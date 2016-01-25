/*
 * Copyright (C) 2004-2013 Polarion Software
 * All rights reserved.
 * Email: dev@polarion.com
 *
 *
 * Copyright (C) 2004-2013 Polarion Software
 * All Rights Reserved.  No use, copying or distribution of this
 * work may be made except in accordance with a valid license
 * agreement from Polarion Software.  This notice must be
 * included on all copies, modifications and derivatives of this
 * work.
 *
 * POLARION SOFTWARE MAKES NO REPRESENTATIONS OR WARRANTIES 
 * ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESSED OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. POLARION SOFTWARE
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */
package com.polarion.alm.ws.client;

/**
 * Utility classes for Polarion Web Services.
 * <p>
 * Encoded location is triplet <code>(REPOSITORY_NAME:)LOCATION_PATH(#REVISION)</code>,
 * e.g. <code>a/b#123</code> or <code>default:/a/b</code>. Each component is encoded so that all
 * <code>\</code> is prepended before every one of <code>\:#</code>.
 * For more information on locations see
 * <code>com.polarion.subterra.base.location.ILocation</code> from Polarion Java API.
 * 
 * @author Stepan Roh
 * @since 3.4.1
 */
public class Utils {

    /**
     * Singleton.
     */
    private Utils() {
        // void
    }

    private static final String DEFAULT_REPOSITORY_NAME = "default"; //$NON-NLS-1$
    private static final char REPO_DELIM = ':';
    private static final String REPO_DELIM_STR = "" + REPO_DELIM; //$NON-NLS-1$
    private static final char REVISION_DELIM = '#';
    private static final String REVISION_DELIM_STR = "" + REVISION_DELIM; //$NON-NLS-1$

    /**
     * Encode location.
     * <p>
     * Usage of {@link #encodeAbsoluteLocationWithDefaultRepository(String, String)} and
     * {@link #encodeRelativeLocation(String, String)} is preferable.
     * 
     * @see #encodeAbsoluteLocationWithDefaultRepository(String, String)
     * @see #encodeRelativeLocation(String, String)
     * 
     * @param repositoryName repository name or <code>null</code>
     * @param locationPath location path (not <code>null</code>)
     * @param revision revision or <code>null</code>
     * @return encoded location (never <code>null</code>)
     */
    public static String encodeLocation(String repositoryName, String locationPath, String revision) {
        // copied from com.polarion.subterra.base.location.Location.serialize()
        StringBuffer buf = new StringBuffer();
        if (repositoryName != null) {
            buf.append(escapeString(repositoryName));
            buf.append(REPO_DELIM);
        }
        buf.append(escapeString(locationPath));
        if (revision != null) {
            buf.append(REVISION_DELIM);
            buf.append(escapeString(revision));
        }
        return buf.toString();
    }

    private static String escapeString(String s) {
        return s.replaceAll("\\\\", "\\\\\\\\") //$NON-NLS-1$ //$NON-NLS-2$
                .replaceAll(REPO_DELIM_STR, "\\\\" + REPO_DELIM) //$NON-NLS-1$
                .replaceAll(REVISION_DELIM_STR, "\\\\" + REVISION_DELIM); //$NON-NLS-1$
    }

    /**
     * Encode absolute location pointing to default repository.
     * 
     * @see #encodeLocation(String, String, String)
     * 
     * @param locationPath location path, should start with <code>/</code> (not <code>null</code>)
     * @param revision revision or <code>null</code>
     * @return encoded location (never <code>null</code>)
     */
    public static String encodeAbsoluteLocationWithDefaultRepository(String locationPath, String revision) {
        return encodeLocation(DEFAULT_REPOSITORY_NAME, locationPath, revision);
    }

    /**
     * Encode relative location.
     * 
     * @see #encodeLocation(String, String, String)
     * 
     * @param locationPath location path, should not start with <code>/</code> (not <code>null</code>)
     * @param revision revision or <code>null</code>
     * @return encoded location (never <code>null</code>)
     */
    public static String encodeRelativeLocation(String locationPath, String revision) {
        return encodeLocation(null, locationPath, revision);
    }

    /**
     * Decodes location encoded by {@link #encodeLocation(String, String, String)} or returned via web service
     * call.
     * 
     * @param encodedLocation encoded location
     * @return triplet [repository name (can be <code>null</code>), location path, revision (can be <code>null</code>)]
     *      or <code>null</code> if <code>encodedLocation</code> is also <code>null</code>
     */
    public static String[] decodeLocation(String encodedLocation) {
        // copied from com.polarion.subterra.base.location.Location.deserializeLocation(String)
        if (encodedLocation == null) {
            return null;
        }
        boolean escaped = false;
        String[] comps = new String[3];
        int index = 0;
        boolean hasRepo = false;
        boolean hasRev = false;
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < encodedLocation.length(); i++) {
            char c = encodedLocation.charAt(i);
            if (escaped) {
                buf.append(c);
                escaped = false;
            } else if (c == '\\') {
                escaped = true;
            } else if ((c == REPO_DELIM) || (c == REVISION_DELIM)) {
                if (c == REPO_DELIM) {
                    hasRepo = true;
                }
                if (c == REVISION_DELIM) {
                    hasRev = true;
                }
                comps[index] = buf.toString();
                index++;
                if (index > 2) {
                    throw new IllegalArgumentException("Malformed encoded location: " + encodedLocation); //$NON-NLS-1$
                }
                buf = new StringBuffer();
            } else {
                buf.append(c);
            }
        }
        comps[index] = buf.toString();
        String repoName = (hasRepo ? comps[0] : null);
        String locPath = (hasRepo ? comps[1] : comps[0]);
        String revision = (hasRev ? (hasRepo ? comps[2] : comps[1]) : null);
        if (locPath == null) {
            locPath = ""; //$NON-NLS-1$
        }
        return new String[] { repoName, locPath, revision };
    }

}

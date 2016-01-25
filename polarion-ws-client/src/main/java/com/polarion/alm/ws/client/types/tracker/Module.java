/**
 * Module.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class Module  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes;

    private java.lang.Boolean areLinksFromParentToChild;

    private com.polarion.alm.ws.client.types.projects.User author;

    private java.lang.Boolean autoSuspect;

    private com.polarion.alm.ws.client.types.tracker.Module branchedFrom;

    private java.lang.String branchedWithQuery;

    private com.polarion.alm.ws.client.types.tracker.ModuleComment[] comments;

    private java.util.Calendar created;

    private java.lang.String[] derivedFields;

    private java.lang.String derivedFromURI;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId derivedFromLinkRole;

    private java.lang.String headingSidebarFields;

    private com.polarion.alm.ws.client.types.Text homePageContent;

    private java.lang.String id;

    private java.lang.String location;

    private java.lang.String moduleAbsoluteLocation;

    private java.lang.String moduleFolder;

    private java.lang.String moduleLocation;

    private java.lang.String moduleName;

    private com.polarion.alm.ws.client.types.projects.Project project;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId status;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole;

    private java.lang.String title;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId type;

    private java.util.Calendar updated;

    private com.polarion.alm.ws.client.types.projects.User updatedBy;

    private java.lang.Boolean usesOutlineNumbering;

    private java.lang.String variantURI;

    private com.polarion.alm.ws.client.types.tracker.Custom[] customFields;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public Module() {
    }

    public Module(
           com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes,
           java.lang.Boolean areLinksFromParentToChild,
           com.polarion.alm.ws.client.types.projects.User author,
           java.lang.Boolean autoSuspect,
           com.polarion.alm.ws.client.types.tracker.Module branchedFrom,
           java.lang.String branchedWithQuery,
           com.polarion.alm.ws.client.types.tracker.ModuleComment[] comments,
           java.util.Calendar created,
           java.lang.String[] derivedFields,
           java.lang.String derivedFromURI,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId derivedFromLinkRole,
           java.lang.String headingSidebarFields,
           com.polarion.alm.ws.client.types.Text homePageContent,
           java.lang.String id,
           java.lang.String location,
           java.lang.String moduleAbsoluteLocation,
           java.lang.String moduleFolder,
           java.lang.String moduleLocation,
           java.lang.String moduleName,
           com.polarion.alm.ws.client.types.projects.Project project,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId status,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole,
           java.lang.String title,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId type,
           java.util.Calendar updated,
           com.polarion.alm.ws.client.types.projects.User updatedBy,
           java.lang.Boolean usesOutlineNumbering,
           java.lang.String variantURI,
           com.polarion.alm.ws.client.types.tracker.Custom[] customFields,
           java.lang.String uri,
           boolean unresolvable) {
           this.allowedWITypes = allowedWITypes;
           this.areLinksFromParentToChild = areLinksFromParentToChild;
           this.author = author;
           this.autoSuspect = autoSuspect;
           this.branchedFrom = branchedFrom;
           this.branchedWithQuery = branchedWithQuery;
           this.comments = comments;
           this.created = created;
           this.derivedFields = derivedFields;
           this.derivedFromURI = derivedFromURI;
           this.derivedFromLinkRole = derivedFromLinkRole;
           this.headingSidebarFields = headingSidebarFields;
           this.homePageContent = homePageContent;
           this.id = id;
           this.location = location;
           this.moduleAbsoluteLocation = moduleAbsoluteLocation;
           this.moduleFolder = moduleFolder;
           this.moduleLocation = moduleLocation;
           this.moduleName = moduleName;
           this.project = project;
           this.status = status;
           this.structureLinkRole = structureLinkRole;
           this.title = title;
           this.type = type;
           this.updated = updated;
           this.updatedBy = updatedBy;
           this.usesOutlineNumbering = usesOutlineNumbering;
           this.variantURI = variantURI;
           this.customFields = customFields;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the allowedWITypes value for this Module.
     * 
     * @return allowedWITypes
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAllowedWITypes() {
        return allowedWITypes;
    }


    /**
     * Sets the allowedWITypes value for this Module.
     * 
     * @param allowedWITypes
     */
    public void setAllowedWITypes(com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes) {
        this.allowedWITypes = allowedWITypes;
    }


    /**
     * Gets the areLinksFromParentToChild value for this Module.
     * 
     * @return areLinksFromParentToChild
     */
    public java.lang.Boolean getAreLinksFromParentToChild() {
        return areLinksFromParentToChild;
    }


    /**
     * Sets the areLinksFromParentToChild value for this Module.
     * 
     * @param areLinksFromParentToChild
     */
    public void setAreLinksFromParentToChild(java.lang.Boolean areLinksFromParentToChild) {
        this.areLinksFromParentToChild = areLinksFromParentToChild;
    }


    /**
     * Gets the author value for this Module.
     * 
     * @return author
     */
    public com.polarion.alm.ws.client.types.projects.User getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Module.
     * 
     * @param author
     */
    public void setAuthor(com.polarion.alm.ws.client.types.projects.User author) {
        this.author = author;
    }


    /**
     * Gets the autoSuspect value for this Module.
     * 
     * @return autoSuspect
     */
    public java.lang.Boolean getAutoSuspect() {
        return autoSuspect;
    }


    /**
     * Sets the autoSuspect value for this Module.
     * 
     * @param autoSuspect
     */
    public void setAutoSuspect(java.lang.Boolean autoSuspect) {
        this.autoSuspect = autoSuspect;
    }


    /**
     * Gets the branchedFrom value for this Module.
     * 
     * @return branchedFrom
     */
    public com.polarion.alm.ws.client.types.tracker.Module getBranchedFrom() {
        return branchedFrom;
    }


    /**
     * Sets the branchedFrom value for this Module.
     * 
     * @param branchedFrom
     */
    public void setBranchedFrom(com.polarion.alm.ws.client.types.tracker.Module branchedFrom) {
        this.branchedFrom = branchedFrom;
    }


    /**
     * Gets the branchedWithQuery value for this Module.
     * 
     * @return branchedWithQuery
     */
    public java.lang.String getBranchedWithQuery() {
        return branchedWithQuery;
    }


    /**
     * Sets the branchedWithQuery value for this Module.
     * 
     * @param branchedWithQuery
     */
    public void setBranchedWithQuery(java.lang.String branchedWithQuery) {
        this.branchedWithQuery = branchedWithQuery;
    }


    /**
     * Gets the comments value for this Module.
     * 
     * @return comments
     */
    public com.polarion.alm.ws.client.types.tracker.ModuleComment[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Module.
     * 
     * @param comments
     */
    public void setComments(com.polarion.alm.ws.client.types.tracker.ModuleComment[] comments) {
        this.comments = comments;
    }


    /**
     * Gets the created value for this Module.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this Module.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the derivedFields value for this Module.
     * 
     * @return derivedFields
     */
    public java.lang.String[] getDerivedFields() {
        return derivedFields;
    }


    /**
     * Sets the derivedFields value for this Module.
     * 
     * @param derivedFields
     */
    public void setDerivedFields(java.lang.String[] derivedFields) {
        this.derivedFields = derivedFields;
    }


    /**
     * Gets the derivedFromURI value for this Module.
     * 
     * @return derivedFromURI
     */
    public java.lang.String getDerivedFromURI() {
        return derivedFromURI;
    }


    /**
     * Sets the derivedFromURI value for this Module.
     * 
     * @param derivedFromURI
     */
    public void setDerivedFromURI(java.lang.String derivedFromURI) {
        this.derivedFromURI = derivedFromURI;
    }


    /**
     * Gets the derivedFromLinkRole value for this Module.
     * 
     * @return derivedFromLinkRole
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getDerivedFromLinkRole() {
        return derivedFromLinkRole;
    }


    /**
     * Sets the derivedFromLinkRole value for this Module.
     * 
     * @param derivedFromLinkRole
     */
    public void setDerivedFromLinkRole(com.polarion.alm.ws.client.types.tracker.EnumOptionId derivedFromLinkRole) {
        this.derivedFromLinkRole = derivedFromLinkRole;
    }


    /**
     * Gets the headingSidebarFields value for this Module.
     * 
     * @return headingSidebarFields
     */
    public java.lang.String getHeadingSidebarFields() {
        return headingSidebarFields;
    }


    /**
     * Sets the headingSidebarFields value for this Module.
     * 
     * @param headingSidebarFields
     */
    public void setHeadingSidebarFields(java.lang.String headingSidebarFields) {
        this.headingSidebarFields = headingSidebarFields;
    }


    /**
     * Gets the homePageContent value for this Module.
     * 
     * @return homePageContent
     */
    public com.polarion.alm.ws.client.types.Text getHomePageContent() {
        return homePageContent;
    }


    /**
     * Sets the homePageContent value for this Module.
     * 
     * @param homePageContent
     */
    public void setHomePageContent(com.polarion.alm.ws.client.types.Text homePageContent) {
        this.homePageContent = homePageContent;
    }


    /**
     * Gets the id value for this Module.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Module.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the location value for this Module.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Module.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the moduleAbsoluteLocation value for this Module.
     * 
     * @return moduleAbsoluteLocation
     */
    public java.lang.String getModuleAbsoluteLocation() {
        return moduleAbsoluteLocation;
    }


    /**
     * Sets the moduleAbsoluteLocation value for this Module.
     * 
     * @param moduleAbsoluteLocation
     */
    public void setModuleAbsoluteLocation(java.lang.String moduleAbsoluteLocation) {
        this.moduleAbsoluteLocation = moduleAbsoluteLocation;
    }


    /**
     * Gets the moduleFolder value for this Module.
     * 
     * @return moduleFolder
     */
    public java.lang.String getModuleFolder() {
        return moduleFolder;
    }


    /**
     * Sets the moduleFolder value for this Module.
     * 
     * @param moduleFolder
     */
    public void setModuleFolder(java.lang.String moduleFolder) {
        this.moduleFolder = moduleFolder;
    }


    /**
     * Gets the moduleLocation value for this Module.
     * 
     * @return moduleLocation
     */
    public java.lang.String getModuleLocation() {
        return moduleLocation;
    }


    /**
     * Sets the moduleLocation value for this Module.
     * 
     * @param moduleLocation
     */
    public void setModuleLocation(java.lang.String moduleLocation) {
        this.moduleLocation = moduleLocation;
    }


    /**
     * Gets the moduleName value for this Module.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this Module.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the project value for this Module.
     * 
     * @return project
     */
    public com.polarion.alm.ws.client.types.projects.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this Module.
     * 
     * @param project
     */
    public void setProject(com.polarion.alm.ws.client.types.projects.Project project) {
        this.project = project;
    }


    /**
     * Gets the status value for this Module.
     * 
     * @return status
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Module.
     * 
     * @param status
     */
    public void setStatus(com.polarion.alm.ws.client.types.tracker.EnumOptionId status) {
        this.status = status;
    }


    /**
     * Gets the structureLinkRole value for this Module.
     * 
     * @return structureLinkRole
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getStructureLinkRole() {
        return structureLinkRole;
    }


    /**
     * Sets the structureLinkRole value for this Module.
     * 
     * @param structureLinkRole
     */
    public void setStructureLinkRole(com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole) {
        this.structureLinkRole = structureLinkRole;
    }


    /**
     * Gets the title value for this Module.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Module.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this Module.
     * 
     * @return type
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getType() {
        return type;
    }


    /**
     * Sets the type value for this Module.
     * 
     * @param type
     */
    public void setType(com.polarion.alm.ws.client.types.tracker.EnumOptionId type) {
        this.type = type;
    }


    /**
     * Gets the updated value for this Module.
     * 
     * @return updated
     */
    public java.util.Calendar getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this Module.
     * 
     * @param updated
     */
    public void setUpdated(java.util.Calendar updated) {
        this.updated = updated;
    }


    /**
     * Gets the updatedBy value for this Module.
     * 
     * @return updatedBy
     */
    public com.polarion.alm.ws.client.types.projects.User getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this Module.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(com.polarion.alm.ws.client.types.projects.User updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the usesOutlineNumbering value for this Module.
     * 
     * @return usesOutlineNumbering
     */
    public java.lang.Boolean getUsesOutlineNumbering() {
        return usesOutlineNumbering;
    }


    /**
     * Sets the usesOutlineNumbering value for this Module.
     * 
     * @param usesOutlineNumbering
     */
    public void setUsesOutlineNumbering(java.lang.Boolean usesOutlineNumbering) {
        this.usesOutlineNumbering = usesOutlineNumbering;
    }


    /**
     * Gets the variantURI value for this Module.
     * 
     * @return variantURI
     */
    public java.lang.String getVariantURI() {
        return variantURI;
    }


    /**
     * Sets the variantURI value for this Module.
     * 
     * @param variantURI
     */
    public void setVariantURI(java.lang.String variantURI) {
        this.variantURI = variantURI;
    }


    /**
     * Gets the customFields value for this Module.
     * 
     * @return customFields
     */
    public com.polarion.alm.ws.client.types.tracker.Custom[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this Module.
     * 
     * @param customFields
     */
    public void setCustomFields(com.polarion.alm.ws.client.types.tracker.Custom[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the uri value for this Module.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Module.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this Module.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this Module.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Module)) return false;
        Module other = (Module) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowedWITypes==null && other.getAllowedWITypes()==null) || 
             (this.allowedWITypes!=null &&
              java.util.Arrays.equals(this.allowedWITypes, other.getAllowedWITypes()))) &&
            ((this.areLinksFromParentToChild==null && other.getAreLinksFromParentToChild()==null) || 
             (this.areLinksFromParentToChild!=null &&
              this.areLinksFromParentToChild.equals(other.getAreLinksFromParentToChild()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.autoSuspect==null && other.getAutoSuspect()==null) || 
             (this.autoSuspect!=null &&
              this.autoSuspect.equals(other.getAutoSuspect()))) &&
            ((this.branchedFrom==null && other.getBranchedFrom()==null) || 
             (this.branchedFrom!=null &&
              this.branchedFrom.equals(other.getBranchedFrom()))) &&
            ((this.branchedWithQuery==null && other.getBranchedWithQuery()==null) || 
             (this.branchedWithQuery!=null &&
              this.branchedWithQuery.equals(other.getBranchedWithQuery()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.derivedFields==null && other.getDerivedFields()==null) || 
             (this.derivedFields!=null &&
              java.util.Arrays.equals(this.derivedFields, other.getDerivedFields()))) &&
            ((this.derivedFromURI==null && other.getDerivedFromURI()==null) || 
             (this.derivedFromURI!=null &&
              this.derivedFromURI.equals(other.getDerivedFromURI()))) &&
            ((this.derivedFromLinkRole==null && other.getDerivedFromLinkRole()==null) || 
             (this.derivedFromLinkRole!=null &&
              this.derivedFromLinkRole.equals(other.getDerivedFromLinkRole()))) &&
            ((this.headingSidebarFields==null && other.getHeadingSidebarFields()==null) || 
             (this.headingSidebarFields!=null &&
              this.headingSidebarFields.equals(other.getHeadingSidebarFields()))) &&
            ((this.homePageContent==null && other.getHomePageContent()==null) || 
             (this.homePageContent!=null &&
              this.homePageContent.equals(other.getHomePageContent()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.moduleAbsoluteLocation==null && other.getModuleAbsoluteLocation()==null) || 
             (this.moduleAbsoluteLocation!=null &&
              this.moduleAbsoluteLocation.equals(other.getModuleAbsoluteLocation()))) &&
            ((this.moduleFolder==null && other.getModuleFolder()==null) || 
             (this.moduleFolder!=null &&
              this.moduleFolder.equals(other.getModuleFolder()))) &&
            ((this.moduleLocation==null && other.getModuleLocation()==null) || 
             (this.moduleLocation!=null &&
              this.moduleLocation.equals(other.getModuleLocation()))) &&
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.structureLinkRole==null && other.getStructureLinkRole()==null) || 
             (this.structureLinkRole!=null &&
              this.structureLinkRole.equals(other.getStructureLinkRole()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.usesOutlineNumbering==null && other.getUsesOutlineNumbering()==null) || 
             (this.usesOutlineNumbering!=null &&
              this.usesOutlineNumbering.equals(other.getUsesOutlineNumbering()))) &&
            ((this.variantURI==null && other.getVariantURI()==null) || 
             (this.variantURI!=null &&
              this.variantURI.equals(other.getVariantURI()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            this.unresolvable == other.isUnresolvable();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAllowedWITypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedWITypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedWITypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAreLinksFromParentToChild() != null) {
            _hashCode += getAreLinksFromParentToChild().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getAutoSuspect() != null) {
            _hashCode += getAutoSuspect().hashCode();
        }
        if (getBranchedFrom() != null) {
            _hashCode += getBranchedFrom().hashCode();
        }
        if (getBranchedWithQuery() != null) {
            _hashCode += getBranchedWithQuery().hashCode();
        }
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getDerivedFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDerivedFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDerivedFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDerivedFromURI() != null) {
            _hashCode += getDerivedFromURI().hashCode();
        }
        if (getDerivedFromLinkRole() != null) {
            _hashCode += getDerivedFromLinkRole().hashCode();
        }
        if (getHeadingSidebarFields() != null) {
            _hashCode += getHeadingSidebarFields().hashCode();
        }
        if (getHomePageContent() != null) {
            _hashCode += getHomePageContent().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getModuleAbsoluteLocation() != null) {
            _hashCode += getModuleAbsoluteLocation().hashCode();
        }
        if (getModuleFolder() != null) {
            _hashCode += getModuleFolder().hashCode();
        }
        if (getModuleLocation() != null) {
            _hashCode += getModuleLocation().hashCode();
        }
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStructureLinkRole() != null) {
            _hashCode += getStructureLinkRole().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUsesOutlineNumbering() != null) {
            _hashCode += getUsesOutlineNumbering().hashCode();
        }
        if (getVariantURI() != null) {
            _hashCode += getVariantURI().hashCode();
        }
        if (getCustomFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        _hashCode += (isUnresolvable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Module.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("uri");
        attrField.setXmlName(new javax.xml.namespace.QName("", "uri"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("unresolvable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "unresolvable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedWITypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "allowedWITypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areLinksFromParentToChild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "areLinksFromParentToChild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoSuspect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "autoSuspect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchedFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "branchedFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchedWithQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "branchedWithQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ModuleComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ModuleComment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derivedFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "derivedFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derivedFromURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "derivedFromURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derivedFromLinkRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "derivedFromLinkRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headingSidebarFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "headingSidebarFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePageContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "homePageContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleAbsoluteLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "moduleAbsoluteLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "moduleFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "moduleLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "moduleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("structureLinkRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "structureLinkRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "updatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesOutlineNumbering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "usesOutlineNumbering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variantURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "variantURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "customFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Custom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Custom"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  com.polarion.alm.ws.client.internal.encoding.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

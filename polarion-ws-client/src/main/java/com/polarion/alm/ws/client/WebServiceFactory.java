package com.polarion.alm.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.handler.HandlerInfo;
import javax.xml.rpc.handler.HandlerRegistry;

import com.polarion.alm.ws.client.builder.BuilderWebService;
import com.polarion.alm.ws.client.builder.BuilderWebServiceServiceLocator;
import com.polarion.alm.ws.client.internal.ClientSessionHandlerInfo;
import com.polarion.alm.ws.client.planning.PlanningWebService;
import com.polarion.alm.ws.client.planning.PlanningWebServiceServiceLocator;
import com.polarion.alm.ws.client.projects.ProjectWebService;
import com.polarion.alm.ws.client.projects.ProjectWebServiceServiceLocator;
import com.polarion.alm.ws.client.security.SecurityWebService;
import com.polarion.alm.ws.client.security.SecurityWebServiceServiceLocator;
import com.polarion.alm.ws.client.session.SessionWebService;
import com.polarion.alm.ws.client.session.SessionWebServiceServiceLocator;
import com.polarion.alm.ws.client.testmanagement.TestManagementWebService;
import com.polarion.alm.ws.client.testmanagement.TestManagementWebServiceServiceLocator;
import com.polarion.alm.ws.client.tracker.TrackerWebService;
import com.polarion.alm.ws.client.tracker.TrackerWebServiceServiceLocator;

public class WebServiceFactory {

    private static final String TRACKER_SERVICE_NAME = "TrackerWebService"; //$NON-NLS-1$

    private static final String PROJECT_SERVICE_NAME = "ProjectWebService"; //$NON-NLS-1$

    private static final String SESSION_SERVICE_NAME = "SessionWebService"; //$NON-NLS-1$

    private static final String SECURITY_SERVICE_NAME = "SecurityWebService"; //$NON-NLS-1$

    private static final String BUILDER_SERVICE_NAME = "BuilderWebService"; //$NON-NLS-1$

    private static final String TESTMANAGEMENT_SERVICE_NAME = "TestManagementWebService"; //$NON-NLS-1$

    private static final String PLANNING_SERVICE_NAME = "PlanningWebService"; //$NON-NLS-1$

    private URL trackerServiceURL;

    private URL projectServiceURL;

    private URL sessionServiceURL;

    private URL securityServiceURL;

    private URL builderServiceURL;

    private URL testManagementServiceURL;

    private URL planningServiceURL;

    private HandlerInfo sessionHandler = new ClientSessionHandlerInfo();

    private TrackerWebServiceServiceLocator trackerWebServiceServiceLocator;

    private ProjectWebServiceServiceLocator projectWebServiceServiceLocator;

    private SessionWebServiceServiceLocator sessionWebServiceServiceLocator;

    private SecurityWebServiceServiceLocator securityWebServiceServiceLocator;

    private BuilderWebServiceServiceLocator builderWebServiceServiceLocator;

    private TestManagementWebServiceServiceLocator testManagementServiceLocator;

    private PlanningWebServiceServiceLocator planningServiceLocator;

    public WebServiceFactory(String baseURL) throws MalformedURLException {
        trackerServiceURL = new URL(baseURL + TRACKER_SERVICE_NAME);
        projectServiceURL = new URL(baseURL + PROJECT_SERVICE_NAME);
        sessionServiceURL = new URL(baseURL + SESSION_SERVICE_NAME);
        securityServiceURL = new URL(baseURL + SECURITY_SERVICE_NAME);
        builderServiceURL = new URL(baseURL + BUILDER_SERVICE_NAME);
        testManagementServiceURL = new URL(baseURL + TESTMANAGEMENT_SERVICE_NAME);
        planningServiceURL = new URL(baseURL + PLANNING_SERVICE_NAME);

        // Initialize locators only once to make the services share the
        // connection manager
        trackerWebServiceServiceLocator = new TrackerWebServiceServiceLocator();
        addSessionHandler(trackerWebServiceServiceLocator);
        projectWebServiceServiceLocator = new ProjectWebServiceServiceLocator();
        addSessionHandler(projectWebServiceServiceLocator);
        sessionWebServiceServiceLocator = new SessionWebServiceServiceLocator();
        addSessionHandler(sessionWebServiceServiceLocator);
        securityWebServiceServiceLocator = new SecurityWebServiceServiceLocator();
        addSessionHandler(securityWebServiceServiceLocator);
        builderWebServiceServiceLocator = new BuilderWebServiceServiceLocator();
        addSessionHandler(builderWebServiceServiceLocator);
        testManagementServiceLocator = new TestManagementWebServiceServiceLocator();
        addSessionHandler(testManagementServiceLocator);
        planningServiceLocator = new PlanningWebServiceServiceLocator();
        addSessionHandler(planningServiceLocator);
    }

    public TrackerWebService getTrackerService() throws ServiceException {
        return trackerWebServiceServiceLocator
                .getTrackerWebService(trackerServiceURL);
    }

    public ProjectWebService getProjectService() throws ServiceException {
        return projectWebServiceServiceLocator
                .getProjectWebService(projectServiceURL);
    }

    public SessionWebService getSessionService() throws ServiceException {
        return sessionWebServiceServiceLocator
                .getSessionWebService(sessionServiceURL);
    }

    public SecurityWebService getSecurityService() throws ServiceException {
        return securityWebServiceServiceLocator
                .getSecurityWebService(securityServiceURL);
    }

    public BuilderWebService getBuilderService() throws ServiceException {
        return builderWebServiceServiceLocator
                .getBuilderWebService(builderServiceURL);
    }

    /** @since 3.6.0 */
    public TestManagementWebService getTestManagementService() throws ServiceException {
        return testManagementServiceLocator.getTestManagementWebService(testManagementServiceURL);
    }

    /** @since 3.8.0 */
    public PlanningWebService getPlanningService() throws ServiceException {
        return planningServiceLocator.getPlanningWebService(planningServiceURL);
    }

    private void addSessionHandler(Service service) {
        HandlerRegistry hr = service.getHandlerRegistry();
        try {
            for (Iterator i = service.getPorts(); i.hasNext();) {
                List chain = hr.getHandlerChain((QName) i.next());
                chain.add(sessionHandler);
            }
        } catch (ServiceException e) {
            // Axis implementation of service.getPorts() doesn't throw
            // ServiceException
            throw new AssertionError("Unexpected initialization error: " + e);
        }

    }

}

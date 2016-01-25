/**
 * SessionWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.session;

public interface SessionWebService extends java.rmi.Remote {

    /**
     * Starts a explicit transaction for the current session.
     * Usually transactions are started and committed for each call to the
     * webservice, but if a transaction has been started explicitly it also
     * has to be terminated using endTransaction.
     */
    public void beginTransaction() throws java.rmi.RemoteException;

    /**
     * Terminates the current session.
     */
    public void endSession() throws java.rmi.RemoteException;

    /**
     * Ends the explicit transaction of the current session by either
     * commit or rollback.
     * @param rollback if true the transaction is rolled back otherwise it
     * is commited.
     */
    public void endTransaction(boolean rollback) throws java.rmi.RemoteException;

    /**
     * Checks if a user is logged-in for the current session.
     */
    public boolean hasSubject() throws java.rmi.RemoteException;

    /**
     * Logs a user in for the current session.
     * @param userName the name of the user to log-in.
     * @param password the passsword of the user to log-in.
     */
    public void logIn(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Check if there is a explicit transaction (started with beginTransaction)
     * for the current session.
     */
    public boolean transactionExists() throws java.rmi.RemoteException;
}

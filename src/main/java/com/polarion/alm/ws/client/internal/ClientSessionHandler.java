package com.polarion.alm.ws.client.internal;

import javax.xml.namespace.QName;
import javax.xml.rpc.handler.Handler;
import javax.xml.rpc.handler.HandlerInfo;

import org.apache.axis.AxisFault;
import org.apache.axis.Constants;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeaderElement;


public class ClientSessionHandler implements  Handler {

	private static final String SESSION_NS = "http://ws.polarion.com/session";

	private static final String SESSION_LOCALPART = "sessionID";
	
	
	private ClientSessionHandlerInfo info;


	public void destroy() {
		// TODO Auto-generated method stub

	}

	public QName[] getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean handleFault(javax.xml.rpc.handler.MessageContext arg0) {
		return false;
	}

	public boolean handleRequest(javax.xml.rpc.handler.MessageContext arg0) {
		Long currentClientSession = info.getSessionId();
		if (currentClientSession == null)
			return true;
		// We have a session ID, so insert the header
		Message msg = ((MessageContext)arg0).getRequestMessage();
		if (msg == null)
			return false;

		SOAPEnvelope env;
		try {
			env = msg.getSOAPEnvelope();
			SOAPHeaderElement header = new SOAPHeaderElement(SESSION_NS,
					SESSION_LOCALPART, currentClientSession);
			env.addHeader(header);
		} catch (AxisFault e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public boolean handleResponse(javax.xml.rpc.handler.MessageContext arg0) {
		Message msg = ((MessageContext) arg0).getResponseMessage();
		if (msg == null)
			return false;
		SOAPEnvelope env;
		try {
			env = msg.getSOAPEnvelope();
			SOAPHeaderElement header = env.getHeaderByName(SESSION_NS,
					SESSION_LOCALPART);
			if (header == null)
				return false;

			info.setSessionId((Long) header.getValueAsType(Constants.XSD_LONG));
			header.setProcessed(true);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public void init(HandlerInfo arg0) {
		this.info = (ClientSessionHandlerInfo)arg0;
	}
	
	
}

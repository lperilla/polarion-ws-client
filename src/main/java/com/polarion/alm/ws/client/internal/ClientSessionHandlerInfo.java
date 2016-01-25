package com.polarion.alm.ws.client.internal;

import javax.xml.rpc.handler.HandlerInfo;


public class ClientSessionHandlerInfo extends HandlerInfo {

	private Long sessionId;

	public ClientSessionHandlerInfo() {
		super(ClientSessionHandler.class, null, null);
	}

	public Long getSessionId() {
		return sessionId;
	}

	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	
	
}

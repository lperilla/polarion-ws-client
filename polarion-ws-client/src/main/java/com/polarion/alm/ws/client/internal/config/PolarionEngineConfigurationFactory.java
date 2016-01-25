package com.polarion.alm.ws.client.internal.config;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.EngineConfigurationFactory;
import org.apache.axis.configuration.FileProvider;

public class PolarionEngineConfigurationFactory implements
		EngineConfigurationFactory {

	public EngineConfiguration getClientEngineConfig() {
		FileProvider fileProvider = new FileProvider("don't care");
		fileProvider.setInputStream(PolarionEngineConfigurationFactory.class.getResourceAsStream("client-config.wsdd"));
		return fileProvider;
	}

	public EngineConfiguration getServerEngineConfig() {
		throw new UnsupportedOperationException();
	}

	public static EngineConfigurationFactory newFactory(Object argument) {
		return new PolarionEngineConfigurationFactory();
	}

}

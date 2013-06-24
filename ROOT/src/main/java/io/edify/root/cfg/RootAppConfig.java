package io.edify.root.cfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Configuration
public class RootAppConfig {

	private static final Logger logger = LoggerFactory.getLogger(RootAppConfig.class);

	//@Bean
	public String something() {
		logger.debug("something");
		return "anything";
	}
}

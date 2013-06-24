package io.edify.core.cfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

@Configuration
@EnableMBeanExport(defaultDomain="io.edify.core")
public class CoreAppConfig {

	private static final Logger logger = LoggerFactory.getLogger(CoreAppConfig.class);

	@Bean
	public String coreBean() {
		logger.debug("coreBean");
		return "coreBean";
	}

}

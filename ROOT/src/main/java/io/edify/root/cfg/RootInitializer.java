package io.edify.root.cfg;

/**
 * Note that web.xml must still be used for root context servlets in Tomcat/JBoss Web until version 7.0.15+.
 * Looks like JBoss AS 7.1.1 uses version 7.0.13.
 */
public class RootInitializer /*extends AbstractAnnotationConfigDispatcherServletInitializer*/ {
	/*
	private static final Logger logger = LoggerFactory.getLogger(RootInitializer.class);

	@Override
	protected Class<?>[] getRootConfigClasses() {
		logger.debug("getRootConfigClasses");
		return new Class<?>[]{RootAppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		logger.debug("getServletConfigClasses");
		return new Class<?>[]{RootServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		logger.debug("getServletMappings");
		return new String[]{"/"};
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		logger.debug("servlet registration, name={}, mappings={}", registration.getName(), registration.getMappings());
	}
	*/
}

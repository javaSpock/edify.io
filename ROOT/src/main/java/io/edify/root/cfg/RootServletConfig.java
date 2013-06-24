package io.edify.root.cfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring3.SpringTemplateEngine;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

@Configuration
@ComponentScan("io.edify.root.controller")
@EnableMBeanExport(defaultDomain="io.edify.root")
public class RootServletConfig extends WebMvcConfigurationSupport {

	private static final Logger logger = LoggerFactory.getLogger(RootServletConfig.class);

	//-- direct view
	public void addViewControllers(ViewControllerRegistry registry) {
		logger.debug("adding view controller / -> landing");
		registry.addViewController("/").setViewName("landing");
	}

	//-- thymeleaf
	@Bean
	public TemplateResolver thymeleafTemplateResolver() {
		logger.debug("thymeleafTemplateResolver");
		ServletContextTemplateResolver r = new ServletContextTemplateResolver();
		r.setPrefix("/WEB-INF/templates/");
		r.setSuffix(".html");
		r.setTemplateMode("HTML5");
		return r;
	}

	@Bean
	public SpringTemplateEngine thymeleafTemplateEngine() {
		logger.debug("thymeleafTemplateEngine");
		SpringTemplateEngine e = new SpringTemplateEngine();
		e.setTemplateResolver(thymeleafTemplateResolver());
		return e;
	}

	@Bean
	public ViewResolver viewResolver() {
		logger.debug("viewResolver");
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setTemplateEngine(thymeleafTemplateEngine());
		return resolver;
	}

	//-- static resources
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		logger.debug("adding static resource handler");
		registry.addResourceHandler("/resources/**").addResourceLocations("resources/");
	}

	//-- ReloadableResourceBundleMessageSource

}

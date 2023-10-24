package com.seleniumexpress.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class[] configFiles = {StudentAppConfig.class};
		
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {//set the mappings (that is endpoints) that DS is going to handle
		String[] mappings = {"/"};
		return mappings;
	}

}

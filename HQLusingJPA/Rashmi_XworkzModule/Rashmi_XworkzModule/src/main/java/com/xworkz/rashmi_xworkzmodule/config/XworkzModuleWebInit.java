package com.xworkz.rashmi_xworkzmodule.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class XworkzModuleWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public XworkzModuleWebInit(){
        System.out.println("XworkzModuleWebInit created");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{XworkzModuleConfiguration.class};
    }

}

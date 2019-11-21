//package com.biquan.helloworld.controller;
//
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//public class CrosController {
//
//	 @Bean
//	    public TomcatServletWebServerFactory tomcat() {
//	        TomcatServletWebServerFactory tomcatFactory = new TomcatServletWebServerFactory();
//	        tomcatFactory.setPort(8090); //默认启动8090端口
//	        return tomcatFactory;
//	    }
//
//	    @RequestMapping("/hello")
//	    public String index() {
//	        return "Hello World";
//	    }
//
//	   
//}

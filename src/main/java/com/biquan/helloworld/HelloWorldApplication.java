package com.biquan.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//@RestController
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
//	  @Bean
//	    public TomcatServletWebServerFactory tomcat() {
//	        TomcatServletWebServerFactory tomcatFactory = new TomcatServletWebServerFactory();
//	        tomcatFactory.setPort(9090); //默认启动8090端口
//	        return tomcatFactory;
//	    }
//	  @RequestMapping("/hello")
//	    public String index() {
//	        return "Hello World";
//	    }
}

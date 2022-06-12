package com.between.ecommerce.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.between.ecommerce.controller"))
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(getApiInfo());
    }
	
	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Prices Service API",
				"Prices Service API Description",
				"1.0",
				"https://mjcr023c.github.io/",
				new Contact("Martin Corrales", "https://mjcr023c.github.io/", "mjcr_023c@hotmail.com"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
	}
}
;
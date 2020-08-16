package com.app;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;  
           // To enable resource server
@SpringBootApplication
@EnableResourceServer
@EnableSwagger2
@ComponentScan(basePackages = {"com.rest.controller","com.rest.service","com.rest.model","com.rest.model","com.rest.security"})
public class SpringBootExampleApplication {
	public static void main(String[] args)   
	{  
	SpringApplication.run(SpringBootExampleApplication.class, args);  
	}  
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rest.controller"))      // Generate API of EndPoints which is available inside defined package
                .paths(PathSelectors.any())     // for all EndPoints
                .build();                   // create object
    }
	
}

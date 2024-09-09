package com.in2it.blogservice.swagerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwagerConfigration {

	@Bean

	OpenAPI customOpenAPI() {

		return new OpenAPI().info(new Info().title("Spike")
				.description("This API exposes endpoints to manage blog-service."));
	}

}

package in.kuldeep.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI customOpenAPI(){
		
		return new OpenAPI().info(new Info()
                .title("Consultant API")
                .version("1.0")
                .description("Consultant Management API")
                .contact(new Contact()
                        .name("Kuldeep")
                        .email("kpal5620@g.com")));
	}
}

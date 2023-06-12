package com.notes.ReleaseNotes;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReleaseNotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReleaseNotesApplication.class, args);
    }


    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Release Note API")
                        .description("An API that provides release notes")
                        .version("v0.0.1")
                        .license(new License().name("n/a").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("To be added")
                        .url("https://springshop.wiki.github.org/docs"));
    }
}

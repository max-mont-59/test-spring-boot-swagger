package com.test.spring.boot.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger configuration
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    /**
     * Docket bean to Swagger configuration
     * @return {@link Docket}
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.test.spring.boot.swagger"))
                .paths(PathSelectors.any())
                .build();
    }


    /**
     * Api information
     * @return {@link ApiInfo}
     */
    private ApiInfo apiInfo() {
        return new ApiInfo("SpringBoot Demo Swagger",
                "Spring boot example with Swagger",
                "1.0",
                "No terms of service",
                "",
                "Apache licence",
                "http://www.apache.org/licenses/LICENSE-2.0.html"
        );
    }
}

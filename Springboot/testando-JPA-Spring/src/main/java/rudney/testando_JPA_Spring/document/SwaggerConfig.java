/*
package rudney.testando_JPA_Spring.document;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Contact contato(){
        return new Contact(
                "Rudy",
                "http://www.exemplo.com.br",
                "rudy@meusite.com.br");
    }

   private ApiInfoBuilder informacoesApi(){
      ApiInfoBuilder apiInfoBuilder =  new ApiInfoBuilder();
      apiInfoBuilder.title("Rest API treino");
      apiInfoBuilder.description("Treinando criação de documentação de API");
      apiInfoBuilder.version("1.0");
      apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
      apiInfoBuilder.license("RudyBusiness");
      apiInfoBuilder.licenseUrl("http://www.exemplo.com.br");
      apiInfoBuilder.contact(this.contato());

      return apiInfoBuilder;

   }

   @Bean
   public Docket detalheApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("rudney.testando_JPA_Spring.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
   }

}
*/
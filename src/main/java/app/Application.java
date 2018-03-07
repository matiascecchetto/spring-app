package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;



// import org.springframework.context.annotation.Bean;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// import org.springframework.core.env.Environment;
// import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	// @Value("{spring.datasource.url}")
	// private String allowedOrigins;

	// @Bean
  // public WebMvcConfigurer corsConfigurer() {
  //     return new WebMvcConfigurerAdapter() {
  //         @Override
  //         public void addCorsMappings(CorsRegistry registry) {
  //             registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:9000");
  //         }
  //     };
  // }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

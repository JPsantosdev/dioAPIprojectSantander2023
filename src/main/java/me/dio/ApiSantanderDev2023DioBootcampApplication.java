package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

import java.util.Collections;

@SpringBootApplication
public class ApiSantanderDev2023DioBootcampApplication {

	public static void main(String[] args) {
	SpringApplication app = new SpringApplication(ApiSantanderDev2023DioBootcampApplication.class);
        app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
        app.run(args);}
	@Component
	public class ServerPortCustomizer
			implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

		@Override
		public void customize(ConfigurableWebServerFactory factory) {
			factory.setPort(8086);
		}
	}
}

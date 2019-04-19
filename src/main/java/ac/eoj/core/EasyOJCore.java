package ac.eoj.core;

import ac.eoj.core.util.settings.Settings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
@SpringBootApplication
@EnableJpaRepositories(basePackages = "ac.eoj.core.data.dao")
public class EasyOJCore extends SpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(EasyOJCore.class, args);
	}

	@Value("${spring.config.additional-location}")
	private String confPath;

	@PostConstruct
	private void init() throws IOException {
		Settings.init(confPath);
	}
}

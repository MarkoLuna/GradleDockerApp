package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @see https://spring.io/guides/gs/spring-boot-docker/ for full tutorial
 */
@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

/**
 * https://examples.javacodegeeks.com/devops/docker/docker-compose-example/
 * https://developers.redhat.com/blog/2016/02/24/10-things-to-avoid-in-docker-containers/
 */
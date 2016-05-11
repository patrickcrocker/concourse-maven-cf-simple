package io.concourse.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ConcourseMavenCfSimpleApplication {

	@RequestMapping
	public @ResponseBody String hello() {
		return "hello!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ConcourseMavenCfSimpleApplication.class, args);
	}
}

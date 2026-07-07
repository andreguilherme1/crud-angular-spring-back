package com.andre.crud_spring_back;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.andre.crud_spring_back.model.Course;
import com.andre.crud_spring_back.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBackApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("FrontEnd");

			courseRepository.save(c);
		};
	}
}

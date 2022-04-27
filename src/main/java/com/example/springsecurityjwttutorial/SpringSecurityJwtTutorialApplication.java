package com.example.springsecurityjwttutorial;

import com.example.springsecurityjwttutorial.entity.User;
import com.example.springsecurityjwttutorial.repository.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtTutorialApplication {
	UserRepo userRepo;

	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
			new User(101L, "Name1", "test1@nowhere.com", "pass1"),
			new User(102L, "Name2", "test2@nowhere.com", "pass2"),
			new User(103L, "Name3", "test3@nowhere.com", "pass3"),
			new User(104L, "Name4", "test4@nowhere.com", "pass4")
		).collect(Collectors.toList());
		userRepo.saveAll(users);



	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtTutorialApplication.class, args);
	}

}

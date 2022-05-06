package com.example.springsecurityjwttutorial;

import com.example.springsecurityjwttutorial.entity.User;
import com.example.springsecurityjwttutorial.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtTutorialApplication {
	@Autowired
	UserRepo userRepo;
	@Value("${EvaPass}")
	String password;

	@PostConstruct
	public void initUsers() {
		System.out.println(password);
		List<User> users = Stream.of(
			new User(101L, "kevinhealy", "kevinhealy@verizon.net", password,"Admin"),
			new User(102L, "Name2", "test2@nowhere.com", "pass2","user"),
			new User(103L, "Name3", "test3@nowhere.com", "pass3","user"),
			new User(104L, "Name4", "test4@nowhere.com", "pass4","user"),
			new User(105L, "Name5", "test5@nowhere.com", "pass5","user"),
			new User(106L, "Name6", "test6@nowhere.com", "pass6","user"),
			new User(107L, "Name7", "test7@nowhere.com", "pass7","user"),
			new User(108L, "Name8", "test8@nowhere.com", "pass8","user"),
			new User(109L, "Name9", "test9@nowhere.com", "pass9","user")
		).collect(Collectors.toList());
		userRepo.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtTutorialApplication.class, args);
	}
}

package com.security;

import com.security.models.User;
import com.security.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class SpringSecurityPracticeApplication implements CommandLineRunner {


	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityPracticeApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("AJAY",bCryptPasswordEncoder.encode("AJAY"),"ajay@gmail.com","ROLE_ADMIN");
		User user2 = new User("DEEP",bCryptPasswordEncoder.encode("DEEP"),"deep@gmail.com","ROLE_NORMAL");
		userRepo.save(user1);
		userRepo.save(user2);
	}
}

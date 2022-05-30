package com.app.springbootwithjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.springbootwithjpa.model.User;
import com.app.springbootwithjpa.model.UserAttendance;
import com.app.springbootwithjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringbootwithjpaApplication implements CommandLineRunner {

	@Autowired
    private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithjpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//INSERT DATA INTO TABLES
		User user1 = new User("kushal@gmail.com","1234","14-05-2022");
		UserAttendance userAttendance1 = new UserAttendance(3,30);
		user1.setUserAttendance(userAttendance1);
		this.userRepository.save(user1);

		User user2 = new User("nex@gmail.com","5678","12-07-2022");
		UserAttendance userAttendance2 = new UserAttendance(6,20);
		user2.setUserAttendance(userAttendance2);
		this.userRepository.save(user2);


		//DIPLAY USER DATA IF USERNAME AND PASSWORD ARE CORRECT
		User user = this.userRepository.findByEmailAndPassword("kushal@gmail.com", "1234");
		if(user !=null){
			System.out.println(user);
		}
		else{
			System.out.println("Wrong username and password");
		}
		
	}

}

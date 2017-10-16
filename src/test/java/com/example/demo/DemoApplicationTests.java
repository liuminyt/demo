package com.example.demo;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DemoApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test(){
		userRepository.save(new User("jwen", "1234"));
		userRepository.save(new User("hah", "sss"));
		userRepository.save(new User("zzz", "xxxx"));

		System.err.println("---------------------------");
//		System.err.println(userRepository.findByName("jwen").get(0).getName());
		System.err.println(userRepository.findUser("jwen").get(0).getName());
		System.err.println(userRepository.findUser("jwen").get(0).getPassword());

	}


	@Test
	public void contextLoads() {
	}

}

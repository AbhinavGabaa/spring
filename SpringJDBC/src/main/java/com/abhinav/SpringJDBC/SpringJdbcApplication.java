package com.abhinav.SpringJDBC;


import com.abhinav.SpringJDBC.model.Alien;
import com.abhinav.SpringJDBC.repo.AlienRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		Alien a1 = context.getBean(Alien.class);
		a1.setId(107);
		a1.setName("ABHINAV");
		a1.setTech("JAVA");
		AlienRepository repo = context.getBean(AlienRepository.class);
		repo.save(a1);
		System.out.println(repo.findAll());

	}

}

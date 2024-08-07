package com.inJoeLegend.spring_in_5min;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5minApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringIn5minApplication.class, args);
	}
	BinarySearch B = new BinarySearch();
	int rs = B.binarySearch(new int[12,6,4],3);
	System.out.println(rs);
}

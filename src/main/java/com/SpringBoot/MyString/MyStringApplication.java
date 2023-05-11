package com.SpringBoot.MyString;

import com.SpringBoot.MyString.entity.ProductLeadTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyStringApplication.class, args);
		ProductLeadTime productLeadTime=new ProductLeadTime();
	}

}

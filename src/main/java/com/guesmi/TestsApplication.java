package com.guesmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guesmi.services.CustomerBo;

@SpringBootApplication
public class TestsApplication implements CommandLineRunner {

	@Autowired
	CustomerBo customerBo;

	public static void main(String[] args) {
		SpringApplication.run(TestsApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		// customerBo.addCustomer();
		// customerBo.addCustomerReturnValue("X");
		customerBo.addCustomerAround("ghassen");
	}
}

package com.rohit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalAppApplication {

	public static void main(String[] args)
	{
		//SpringApplication.run(HospitalAppApplication.class, args);
		OptionalApp op = new OptionalApp();
		op.getHospital("pacific").ifPresent(Hospital-> System.out.println(Hospital.getName()));
	}

}

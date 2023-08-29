package com.full.stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.full.stack.model.EmpData;
import com.full.stack.repo.Dao;

@SpringBootApplication
public class FullStackAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FullStackAppApplication.class, args);
	}
        
	@Autowired
	private Dao ds;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		EmpData ed =  new EmpData();
		ed.setFirstName("Kule");
		ed.setLastName("merty");
		ed.setEmailId("kurlemerty@gmail.com");
		ds.save(ed);
		
	}

}

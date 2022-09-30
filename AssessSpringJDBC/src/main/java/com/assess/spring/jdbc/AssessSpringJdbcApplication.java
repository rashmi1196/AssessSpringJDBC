package com.assess.spring.jdbc;

import com.assess.spring.jdbc.dao.Learner;
import com.assess.spring.jdbc.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssessSpringJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AssessSpringJdbcApplication.class, args);
	}

	@Autowired
	LearnerRepository learnerRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=============All learner data=============");
		System.out.println(learnerRepository.getAllLearner());
		System.out.println("====================Learner by ID======================");
		System.out.println( learnerRepository.getLearnerById(2));
		System.out.println("=======================Inserting values================");
		System.out.println( learnerRepository.insertLearner(new Learner(4, "Roy","Jack","roy@demo.com","1234")));
		System.out.println("====================== Update a Learner Info===================");
		System.out.println(learnerRepository.updateLearnerInfo( new Learner("Raj", "Roy", "raj@demo.com","1367"),4));
		System.out.println("================ Delete by id ===============");
		System.out.println(learnerRepository.deleteLearner(2));

	}
}

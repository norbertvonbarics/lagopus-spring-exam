package com.greenfox.exam.spring;

import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner{

	@Autowired
	QuestionRepository questionRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionRepo.save(new Question(1,"When did your course start? (yyyy.mm.dd)", "2017.03.13"));
		questionRepo.save(new Question(2,"What type of dog Barbi has?", "whippet"));
		questionRepo.save(new Question(3,"What is HerrNorbert's favourite color?", "green"));
		questionRepo.save(new Question(4,"How many classes are learning at Green Fox Academy at this moment?", "4"));
		questionRepo.save(new Question(5,"How many mentors teach at Green Fox at this moment?", "16"));
		questionRepo.save(new Question(6,"What was the name of the first Green Fox class?", "vulpes"));
		questionRepo.save(new Question(7,"How many likes do we have on facebook?", "3300"));
		questionRepo.save(new Question(8,"What is Tojas's horoscope?", "libra"));
		questionRepo.save(new Question(9, "Do you understand this exercise?", "I'm not even close to it!"));
	}
}

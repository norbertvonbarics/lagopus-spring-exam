package com.greenfox.exam.spring;

import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.AnswerRepository;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner{

	@Autowired
	QuestionRepository questionRepo;

	@Autowired
	AnswerRepository answerRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionRepo.save(new Question(1,"When did your course start? (yyyy.mm.dd)"));
		questionRepo.save(new Question(2,"What type of dog Barbi has?"));
		questionRepo.save(new Question(3,"What is HerrNorbert's favourite color?"));
		questionRepo.save(new Question(4,"How many classes are learning at Green Fox Academy at this moment?"));
		questionRepo.save(new Question(5,"How many mentors teach at Green Fox at this moment?"));
		questionRepo.save(new Question(6,"What was the name of the first Green Fox class?"));
		questionRepo.save(new Question(7,"How many likes do we have on facebook?"));
		questionRepo.save(new Question(8,"What is Tojas's horoscope?"));
		questionRepo.save(new Question(9, "Do you understand this exercise?"));

		answerRepo.save(new Answer(1,"2017.03.13"));
		answerRepo.save(new Answer(2,"whippet"));
		answerRepo.save(new Answer(3, "green"));
		answerRepo.save(new Answer(4,"4"));
		answerRepo.save(new Answer(5,"16"));
		answerRepo.save(new Answer(6,"vulpes"));
		answerRepo.save(new Answer(7,"3300"));
		answerRepo.save(new Answer(8, "libra"));
		answerRepo.save(new Answer(9,  "I'm not even close to it!"));

	}
}

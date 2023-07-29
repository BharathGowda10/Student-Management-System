package studentmanagementsystem.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import studentmanagementsystem.sms.entity.student;
import studentmanagementsystem.sms.repository.studentRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

	@Autowired
	private studentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//	student student1 = new student("Bharath","Gowda","bharat@gmail.com");
//		 studentRepository.save(student1);
//
//		student student2 = new student("lionel","messi","messi10@gmail.com");
//		studentRepository.save(student2);
//
//		student student3 = new student("cristiano","Ronaldo","cr7@gmail.com");
//		studentRepository.save(student3);
	}
}

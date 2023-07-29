package studentmanagementsystem.sms.service;

import org.springframework.stereotype.Service;
import studentmanagementsystem.sms.entity.student;
import studentmanagementsystem.sms.repository.studentRepository;

import java.util.List;

@Service
public interface studentService {

     List<student> getAllStudents();

     student saveStudent(student Student);

     student getStudentById(Long id);
     student updateStudent(student student);

     void deleteStudent(Long id);
}

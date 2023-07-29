package studentmanagementsystem.sms.serviceimpl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import studentmanagementsystem.sms.entity.student;
import studentmanagementsystem.sms.repository.studentRepository;
import studentmanagementsystem.sms.service.studentService;

import java.util.List;
@Service
public class studentServiceimpl implements studentService {
    private final studentRepository studentrepository;

    public studentServiceimpl(studentRepository studentrepository) {
        this.studentrepository = studentrepository;
    }

    @Override
    public List<student> getAllStudents() {
        return studentrepository.findAll();
    }

    @Override
    public student saveStudent(student Student) {
        return studentrepository.save(Student);
    }

    @Override
    public student getStudentById(Long id) {
        return studentrepository.findById(id).get();
    }

    @Override
    public student updateStudent(student student) {
        return studentrepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
         studentrepository.deleteById(id);
    }
}

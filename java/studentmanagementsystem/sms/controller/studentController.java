package studentmanagementsystem.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import studentmanagementsystem.sms.entity.student;
import studentmanagementsystem.sms.service.studentService;

@Controller
public class studentController {
    public final studentService studentservice;

    public studentController(studentService studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentservice.getAllStudents());
                return "students";
    }

    @GetMapping("/students/new")
    public String createStudents(Model model){
        student student = new student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudents(@ModelAttribute("student") student Student){
        studentservice.saveStudent(Student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudents(@PathVariable Long id, Model model){
        model.addAttribute("student",studentservice.getStudentById(id));
       return "edit_students";
    }

    @PostMapping("/students/{id}")
    public String updateStudents(@PathVariable Long id, @ModelAttribute("student") student Student){
        student oldStudents = studentservice.getStudentById(id);
        oldStudents.setId(id);
        oldStudents.setFirstName(Student.getFirstName());
        oldStudents.setLastName(Student.getLastName());
        oldStudents.setEmail(Student.getEmail());
        studentservice.updateStudent(oldStudents);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudents(@PathVariable Long id){
        studentservice.deleteStudent(id);
        return "redirect:/students";
    }
}

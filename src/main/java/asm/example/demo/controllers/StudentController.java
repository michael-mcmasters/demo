package asm.example.demo.controllers;

import asm.example.demo.repositories.StudentRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller         // Doesn't work if we use @RestController
public class StudentController {

    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @RequestMapping("")
    public String getStudent(Model model) {
        model.addAttribute("student", studentRepo.findAll());

        return "AllStudents";
    }

    @RequestMapping("/student/first-name")
    public String getStudentFirstName(Model model) {
        model.addAttribute("student", studentRepo.findAll());

        return "AllStudentsFirstName";
    }
}

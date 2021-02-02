package asm.example.demo.controllers;

import asm.example.demo.domain.Student;
import asm.example.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController         // Doesn't work if we use @RestController
public class StudentController {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @RequestMapping("")
    public Student getStudent() {
        Optional<Student> student = studentRepo.findByFirstName("Peter");
        return student.get();
    }

    @RequestMapping("/student/{firstname}")
    public Student getStudentFirstName(@PathVariable String firstname) {
        Optional<Student> student = studentRepo.findByFirstName(firstname);
        return student.get();
    }
}

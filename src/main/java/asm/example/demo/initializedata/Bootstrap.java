package asm.example.demo.initializedata;

import asm.example.demo.domain.Student;
import asm.example.demo.repositories.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final StudentRepo studentRepo;

    public Bootstrap(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setFirstName("Peter");
        student.setLastName("Peterson");

        studentRepo.save(student);
        System.out.println(student);
    }
}

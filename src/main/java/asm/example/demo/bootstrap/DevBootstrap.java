package asm.example.demo.bootstrap;

import asm.example.demo.domain.Student;
import asm.example.demo.repositories.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements CommandLineRunner {

    private final StudentRepo studentRepo;

    public DevBootstrap(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setFirstName("Peter");
        student.setLastName("Peterson");

        Student student2 = new Student();
        student2.setFirstName("Ami");
        student2.setLastName("Amison");

        studentRepo.save(student);
        studentRepo.save(student2);
        System.out.println(student);
        System.out.println(student2);
    }
}

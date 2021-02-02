package asm.example.demo.repositories;

import asm.example.demo.domain.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepo extends CrudRepository<Student, Long> {
    Optional<Student> findByFirstName(String name);
}

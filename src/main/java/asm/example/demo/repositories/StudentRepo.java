package asm.example.demo.repositories;

import asm.example.demo.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {

}

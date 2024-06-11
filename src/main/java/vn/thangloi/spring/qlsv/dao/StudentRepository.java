package vn.thangloi.spring.qlsv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.thangloi.spring.qlsv.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}

package vn.thangloi.spring.qlsv.service;

import vn.thangloi.spring.qlsv.entity.Student;
import vn.thangloi.spring.qlsv.rest.StudentController;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    public Student getStudentById(int id);

    public Student addStudent(Student student);

    public Student updateStudent(Student student);

    public void deleteStudentById(int id);



}

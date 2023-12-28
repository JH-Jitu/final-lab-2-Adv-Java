package dev.rest;

import dev.domain.Student;
import dev.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class StudentRestController {

    private final StudentService studentService;

    public StudentRestController(StudentService StudentService) {
        this.studentService = StudentService;
    }

    //    add a new user
    @PostMapping("/users")
    public String createStudent(@RequestBody Student student) throws SQLException {
        studentService.createStudent(student);
        return "User Created Successfully!";
    }


    //    update user record
    @PutMapping("/users")
    public String editStudent(@RequestBody Student student) throws SQLException {
        studentService.updateStudentById(student);
        return "User Updated Successfully!";
    }

    //    get all users
    @GetMapping("/users")
    public List<Student> getAllStudents() throws SQLException {
        return studentService.getAllStudents();
    }


    //    get total number of users
    @GetMapping("/users/count")
    public String getStudentCount() {
        int studentCount = studentService.getStudentCount();
        return "Total Students: " + studentCount;
    }


    //    get a specific user
    @GetMapping("/users/{id}")
    public Student findStudent(@PathVariable("id") Integer id) throws SQLException {
        return studentService.getStudentById(id);
    }


    //    delete a user
    @DeleteMapping("/users/{id}")
    public String deleteStudent(@PathVariable int id) throws SQLException {
        studentService.deleteStudentById(id);
        return "User with ID:" + id + " Deleted Successfully";
    }

}

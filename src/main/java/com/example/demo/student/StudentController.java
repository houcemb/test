package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @Autowired
    private final StudentService studentService;

    @GetMapping
    public List<Student> hello() {
        return studentService.hello();
    }

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public void registerStudent(@RequestBody Student student){
        studentService.addNewStudent(student);

    }
}

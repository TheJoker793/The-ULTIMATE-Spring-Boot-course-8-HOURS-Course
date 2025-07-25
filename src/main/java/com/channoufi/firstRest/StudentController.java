package com.channoufi.firstRest;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student post(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List <Student>getAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public Student getById(@PathVariable("student-id") Integer id) {
        return studentRepository.findById(id).orElse(null);
    }
    @GetMapping("/students/{firstname}")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getByFirstName(@PathVariable("firstname") String fname){
        return studentRepository.findByFirstnameIgnoreCase(fname);

    }
    @DeleteMapping ("/students/{student-id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("student-id") Integer id) {
        studentRepository.deleteById(id);
    }

}

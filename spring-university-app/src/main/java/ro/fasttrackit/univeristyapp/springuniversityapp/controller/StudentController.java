package ro.fasttrackit.univeristyapp.springuniversityapp.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.univeristyapp.springuniversityapp.service.StudentService;
import ro.fasttrackit.univeristyapp.springuniversityapp.service.model.StudentDto;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/students")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/api/students/{id}")
    public ResponseEntity<StudentDto> getStudentById(@RequestParam(value = "id", required = false)
                                                                 Long studentId){
        return ResponseEntity.ok(studentService.getStudentById(studentId));
    }

    @PostMapping("api/students")
    public ResponseEntity createOrUpdateStudent(@RequestBody StudentDto studentRequest) {

        return ResponseEntity.ok(studentService.getAllStudents());
    }


    @DeleteMapping("/api/students/{id}")
    public void deleteStudentById(@PathVariable("id") Long studentId){
        this.studentService.deleteStudentById(studentId);

    }
}

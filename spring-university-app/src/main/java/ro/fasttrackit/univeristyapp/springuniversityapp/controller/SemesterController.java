package ro.fasttrackit.univeristyapp.springuniversityapp.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.univeristyapp.springuniversityapp.service.SemesterService;
import ro.fasttrackit.univeristyapp.springuniversityapp.service.model.SemesterDto;

import java.util.List;

@RestController
public class SemesterController {
    private final SemesterService semesterService;

    public SemesterController(SemesterService semesterService) {
        this.semesterService = semesterService;
    }

    @GetMapping("/api/semesters")
    public ResponseEntity<List<SemesterDto>> getAllSemesters() {
        return ResponseEntity.ok(semesterService.getAllSemesters());
    }

    @GetMapping("/api/semester/{id}")
    public ResponseEntity<SemesterDto> getSemesterById(@PathVariable("id") Long semesterId){
        return ResponseEntity.ok(semesterService.getSemesterById(semesterId));
    }

    @PostMapping("/api/semester")
    public ResponseEntity createOrUpdateSemester(@RequestBody SemesterDto semesterRequest) {
        this.semesterService.createOrUpdateSemester(semesterRequest);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/api/semester/{id}")
    public void deleteSemesterById(@PathVariable("id") Long semesterId){
        this.semesterService.deleteSemesterById(semesterId);

    }
}

package ro.fasttrackit.univeristyapp.springuniversityapp.service;


import org.springframework.stereotype.Service;
import ro.fasttrackit.univeristyapp.springuniversityapp.repository.StudentEntity;
import ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao.HumanEntity;
import ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao.StudentRepository;
import ro.fasttrackit.univeristyapp.springuniversityapp.service.model.StudentDto;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;}

    public List<StudentDto> getAllStudents() {
        final List<StudentEntity> allStudents = this.studentRepository.findAll();
        return allStudents.stream()
                .map(humanEntity -> {
                    StudentDto createdStudent = new StudentDto();
                    createdStudent.setId(humanEntity.getId());
                    createdStudent.setCnp(humanEntity.getCnp());
                    createdStudent.setFirstname(humanEntity.getFirstname());
                    createdStudent.setLastname(humanEntity.getLastname());
                    return createdStudent;
                })
                .collect(Collectors.toList());
    }

    public StudentDto getStudentById(Long id) {
        final Optional<StudentEntity> studentById = this.studentRepository.findById(id);
        if (studentById.isEmpty()){
            return null;}
        final StudentEntity studentEntity = studentById.get();
        StudentDto sortedStudent = new StudentDto();
        sortedStudent.setId(studentEntity.getId());
        sortedStudent.setCnp(studentEntity.getCnp());
        sortedStudent.setFirstname(studentEntity.getFirstname());
        sortedStudent.setLastname(studentEntity.getLastname());
        return sortedStudent;
    }

    public void createOrUpdateStudent(StudentDto toCreate) {
        StudentEntity createOrUpdateMe = new StudentEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setCnp(toCreate.getCnp());
        createOrUpdateMe.setFirstname(toCreate.getFirstname());
        createOrUpdateMe.setLastname(toCreate.getLastname());
        createOrUpdateMe.setHuman(new HumanEntity());
        this.studentRepository.save(createOrUpdateMe);

    }

    public void deleteStudentById(Long studentId) {
        this.studentRepository.deleteById(studentId);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentService that = (StudentService) o;
        return Objects.equals(studentRepository, that.studentRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentRepository);
    }
}

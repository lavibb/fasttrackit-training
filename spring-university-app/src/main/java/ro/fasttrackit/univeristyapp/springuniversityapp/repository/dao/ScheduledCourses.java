package ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao;


import javax.persistence.*;
        import java.util.Set;

@Entity
public class ScheduledCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinColumn( name = "professor_id")
    Set<ProfessorEntity> professor;
    @ManyToMany
    @JoinColumn(name = "course_id")
    Set<CoursesEntity> courses;
    @ManyToMany
    @JoinColumn(name = "semester_id")
    Set<SemesterEntity> semester;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<ProfessorEntity> getProfessor() {
        return professor;
    }

    public void setProfessor(Set<ProfessorEntity> professor) {
        this.professor = professor;
    }

    public Set<CoursesEntity> getCourses() {
        return courses;
    }

    public void setCourses(Set<CoursesEntity> courses) {
        this.courses = courses;
    }

    public Set<SemesterEntity> getSemester() {
        return semester;
    }

    public void setSemester(Set<SemesterEntity> semester) {
        this.semester = semester;
    }
}


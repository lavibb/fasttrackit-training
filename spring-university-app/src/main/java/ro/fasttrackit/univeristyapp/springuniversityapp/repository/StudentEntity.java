package ro.fasttrackit.univeristyapp.springuniversityapp.repository;


import ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao.CoursesEntity;
import ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao.HumanEntity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;


@Entity(name = "students")
public class StudentEntity extends HumanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    private  String cnp;
    @Column
    private String lastname;
    @Column
    private String firstname;
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    private HumanEntity human = new HumanEntity();
    @JoinColumn(name = "human_id", referencedColumnName = "id")

    @ManyToMany

    @JoinTable(
            name = "student_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "scheduled_course_id"))
    Set<CoursesEntity> studentCourses;

   // @Override
   // public Long getId() {
   //     return id;
   // }

   // @Override
   // public void setId(Long id) {
      //  this.id = id;
   // }

    public HumanEntity getHuman() {
        return human;
    }

    public void setHuman(HumanEntity human) {
        this.human = human;
    }

    public Set<CoursesEntity> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<CoursesEntity> studentCourses) {
        this.studentCourses = studentCourses;
    }
}






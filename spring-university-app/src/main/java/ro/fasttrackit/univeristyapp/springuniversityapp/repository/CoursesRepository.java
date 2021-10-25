package ro.fasttrackit.univeristyapp.springuniversityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao.CoursesEntity;

public interface CoursesRepository extends JpaRepository<CoursesEntity,Long> {
}

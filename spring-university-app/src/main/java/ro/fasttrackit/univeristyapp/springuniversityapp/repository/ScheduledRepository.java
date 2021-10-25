package ro.fasttrackit.univeristyapp.springuniversityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao.ScheduledCourses;

public interface ScheduledRepository extends JpaRepository<ScheduledCourses, Long> {
}

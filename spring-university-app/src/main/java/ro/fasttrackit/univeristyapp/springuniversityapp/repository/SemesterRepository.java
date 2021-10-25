package ro.fasttrackit.univeristyapp.springuniversityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao.SemesterEntity;

public interface SemesterRepository extends JpaRepository<SemesterEntity, Long> {
}

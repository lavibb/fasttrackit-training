package ro.fasttrackit.univeristyapp.springuniversityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao.ProfessorEntity;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {
}

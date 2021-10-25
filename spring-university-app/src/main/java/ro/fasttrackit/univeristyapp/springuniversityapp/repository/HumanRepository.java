package ro.fasttrackit.univeristyapp.springuniversityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao.HumanEntity;

@Repository

public interface HumanRepository extends JpaRepository<HumanEntity,Long> {
}

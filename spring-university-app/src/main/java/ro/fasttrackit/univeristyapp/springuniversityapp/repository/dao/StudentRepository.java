package ro.fasttrackit.univeristyapp.springuniversityapp.repository.dao;


        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;
        import ro.fasttrackit.univeristyapp.springuniversityapp.repository.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

package kodlama.io.odev4.dataAccess.abstracts;

import kodlama.io.odev4.entities.concrete.LowerCours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LowerCourseRepository extends JpaRepository<LowerCours,Integer> {

}

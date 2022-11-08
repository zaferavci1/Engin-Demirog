package kodlama.io.odev4.dataAccess.abstracts;

import kodlama.io.odev4.entities.concrete.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Courses,Integer> {
}

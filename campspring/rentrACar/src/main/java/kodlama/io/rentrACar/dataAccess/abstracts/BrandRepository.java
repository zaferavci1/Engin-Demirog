
package kodlama.io.rentrACar.dataAccess.abstracts;
import kodlama.io.rentrACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
    //veri tabanında bütün işlemler tamam JpaRepository ile
}


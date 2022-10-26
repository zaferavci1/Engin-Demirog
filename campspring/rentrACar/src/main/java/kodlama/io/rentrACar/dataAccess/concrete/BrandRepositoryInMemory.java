package kodlama.io.rentrACar.dataAccess.concrete;

import kodlama.io.rentrACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentrACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BrandRepositoryInMemory implements BrandRepository {

    List<Brand> brands;

    public BrandRepositoryInMemory() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Ford"));
        brands.add(new Brand(4,"Toyota"));
        brands.add(new Brand(5,"Fiat"));
    }


    @Override
    public List<Brand> getAll() {
        return brands;
    }
}

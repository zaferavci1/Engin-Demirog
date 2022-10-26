package kodlama.io.rentrACar.dataAccess.abstracts;

import kodlama.io.rentrACar.entities.concretes.Brand;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}

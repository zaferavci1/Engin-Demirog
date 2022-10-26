package kodlama.io.rentrACar.business.concretes;

import kodlama.io.rentrACar.business.abstracts.BrandService;
import kodlama.io.rentrACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentrACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //is kuralları
        return brandRepository.getAll();
    }
}


package kodlama.io.rentrACar.business.concretes;

import kodlama.io.rentrACar.business.abstracts.BrandService;
import kodlama.io.rentrACar.business.requests.CreateBrandRequest;
import kodlama.io.rentrACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentrACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentrACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll(); // veri tabanından geldi
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>(); //bos bir liste olusturup ona ataycagız

        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse(brand.getId(), brand.getName());
         /*   responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());*/

            brandsResponse.add(responseItem);
        }
        //is kuralları
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());

        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        List<Brand> brands = brandRepository.findAll(); // veri tabanından geldi
        for (Brand brand: brands) {
            if (id == brand.getId()){
                brandRepository.delete(brand);
            }
        }
    }
}

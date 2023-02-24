
package kodlama.io.rentrACar.business.concretes;

import kodlama.io.rentrACar.business.abstracts.BrandService;
import kodlama.io.rentrACar.business.requests.CreateBrandRequest;
import kodlama.io.rentrACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentrACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentrACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentrACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentrACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentrACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;



    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll(); // veri tabanından geldi


        List<GetAllBrandsResponse> brandsResponse = brands.stream().map(brand -> this.modelMapperService.forResponse()
                .map(brand,GetAllBrandsResponse.class)).collect(Collectors.toList());//stream bize dolaşmayı sağlıyor foreach in yaptığının yapmayı sağlıyor
        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand,GetByIdBrandResponse.class);
        return response;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        //
        //buradaki bir sürü set işlemini kısaltıyoruz.
        //
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);//gelen nesneyi map edeceğiz

        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);//burada id miz var o yüzden update yapacak
    }

    @Override
    public void delete(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        this.brandRepository.delete(brand);
    }
}

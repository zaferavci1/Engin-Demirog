
package kodlama.io.rentrACar.business.abstracts;

import kodlama.io.rentrACar.business.requests.CreateBrandRequest;
import kodlama.io.rentrACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentrACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentrACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentrACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
}


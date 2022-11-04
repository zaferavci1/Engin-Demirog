
package kodlama.io.rentrACar.business.abstracts;

import kodlama.io.rentrACar.business.requests.CreateBrandRequest;
import kodlama.io.rentrACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentrACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
    void delete(int id);
}


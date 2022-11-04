
package kodlama.io.rentrACar.webApi.controllers;

import kodlama.io.rentrACar.business.abstracts.BrandService;
import kodlama.io.rentrACar.business.requests.CreateBrandRequest;
import kodlama.io.rentrACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentrACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //annotion
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody()  CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id)
    {
        this.brandService.delete(id);
    }
}


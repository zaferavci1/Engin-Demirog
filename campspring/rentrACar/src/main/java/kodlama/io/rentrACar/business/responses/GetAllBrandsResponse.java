package kodlama.io.rentrACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {
    //cevap
    private int id;
    private String name;

}

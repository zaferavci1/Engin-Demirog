<<<<<<< HEAD
package kodlama.io.rentrACar.entities.concretes;

public class Brand {
    private int id;
    private String name;

    public Brand() {

    }


    public Brand(int id,String name) {
        this.id=id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
=======
package kodlama.io.rentrACar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//lombok getter ve setterları kullanmamamızı sağlıyor
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Brand {

    private int id;
    private String name;
    
    
    
    
/*	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}*/
/*	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/


}
>>>>>>> 85c249c (gun4)

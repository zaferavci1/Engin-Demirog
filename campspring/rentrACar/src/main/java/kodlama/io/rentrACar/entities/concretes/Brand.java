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

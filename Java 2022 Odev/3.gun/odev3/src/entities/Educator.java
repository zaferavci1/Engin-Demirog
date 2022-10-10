package entities;

public class Educator {
	private int id;
	private String firstName;
	private String lastNmae;
	
	public Educator(int id, String firstName, String lastNmae) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastNmae = lastNmae;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}
	
	
}

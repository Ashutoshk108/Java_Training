
public class Customer {
	private int id;
	private String name;
	private String tier;
	public int getId() {
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
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public Customer(int id, String name, String tier) {
		super();
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}

}

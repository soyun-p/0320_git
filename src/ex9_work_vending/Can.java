package ex9_work_vending;

public class Can {
	
	private String name;
	private int price;
	
	public Can( String name, int price ) {
		
		this.name = name;
		this.price = price;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}

package cmWithInterFace;

public class Car {
	private String brand;
	private String type;
	private String num;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String brand, String type, String num) {
		super();
		this.brand = brand;
		this.type = type;
		this.num = num;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	

}

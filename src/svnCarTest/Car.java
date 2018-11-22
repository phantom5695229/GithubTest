package svnCarTest;
//Ã·Ωªgit≤‚ ‘
public class Car {
	private String brand;
	private String type;
	private String carId;
	 
	public Car() {
		super();
	}

	public Car(String brind, String type, String carId) {
		super();
		this.brand = brind;
		this.type = type;
		this.carId = carId;
	}

	public String getBrind() {
		return brand;
	}

	public void setBrind(String brind) {
		this.brand = brind;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}
	
	

}

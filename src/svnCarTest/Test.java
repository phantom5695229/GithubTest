package svnCarTest;

public class Test {
	public static void printCars(Car[] cars){
		for(Car car : cars){
			System.out.println("∆∑≈∆:"+car.getBrind());
			System.out.println("¿‡–Õ:"+car.getType());
			System.out.println("≥µ≈∆:"+car.getCarId());
			System.out.println("==================");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ICarDao icd = new CarDaoImpl(10);
		Car c1 = new Car("±¶¬Ì","SUV","¡…B11111");
		Car c2 = new Car("±¶¬Ì","Sedan","¡…B22222");
		Car c3 = new Car("∞¬µœ","SUV","¡…B33333");
		Car c4 = new Car("∞¬µœ","Sedan","¡…B44444");
		Car c5 = new Car("Ω›±™","SUV","¡…B55555");
		Car c6 = new Car("Ω›±™","Sedan","¡…B66666");
		Car c7 = new Car("±º≥€","SUV","¡…B77777");
		Car c8 = new Car("±º≥€","Sedan","¡…B88888");
		
		icd.save(c1);
		icd.save(c2);
		icd.save(c3);
		icd.save(c4);
		icd.save(c5);
		icd.save(c6);
		icd.save(c7);
		icd.save(c8);
		
		System.out.println("=====ALL=====");
		printCars(icd.quryAll());
		System.out.println("=====DEL=====");
		icd.delete("¡…B11111");
		printCars(icd.quryAll());
		System.out.println("=====ByID=====");
		Car car = icd.quryById("¡…B88888");
		if (car != null) {
			System.out.println("∆∑≈∆:"+car.getBrind());
			System.out.println("¿‡–Õ:"+car.getType());
			System.out.println("≥µ≈∆:"+car.getCarId());
			System.out.println("==================");
		} else {
			System.out.println("¥ÌŒÛ≥µ≈∆");
		}
		System.out.println("=====ByBrand=====");
		printCars(icd.quryByBrand("Ω›±™"));
		
		System.out.println("=====ByType=====");
		printCars(icd.quryByType("SUV"));
		
		
		
		
	}
}

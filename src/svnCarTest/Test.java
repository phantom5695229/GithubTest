package svnCarTest;

public class Test {
	public static void printCars(Car[] cars){
		for(Car car : cars){
			System.out.println("Ʒ��:"+car.getBrind());
			System.out.println("����:"+car.getType());
			System.out.println("����:"+car.getCarId());
			System.out.println("==================");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ICarDao icd = new CarDaoImpl(10);
		Car c1 = new Car("����","SUV","��B11111");
		Car c2 = new Car("����","Sedan","��B22222");
		Car c3 = new Car("�µ�","SUV","��B33333");
		Car c4 = new Car("�µ�","Sedan","��B44444");
		Car c5 = new Car("�ݱ�","SUV","��B55555");
		Car c6 = new Car("�ݱ�","Sedan","��B66666");
		Car c7 = new Car("����","SUV","��B77777");
		Car c8 = new Car("����","Sedan","��B88888");
		
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
		icd.delete("��B11111");
		printCars(icd.quryAll());
		System.out.println("=====ByID=====");
		Car car = icd.quryById("��B88888");
		if (car != null) {
			System.out.println("Ʒ��:"+car.getBrind());
			System.out.println("����:"+car.getType());
			System.out.println("����:"+car.getCarId());
			System.out.println("==================");
		} else {
			System.out.println("������");
		}
		System.out.println("=====ByBrand=====");
		printCars(icd.quryByBrand("�ݱ�"));
		
		System.out.println("=====ByType=====");
		printCars(icd.quryByType("SUV"));
		
		
		
		
	}
}

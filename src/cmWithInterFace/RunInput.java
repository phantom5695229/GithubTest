package cmWithInterFace;

import java.util.Scanner;

public class RunInput {
	Scanner scan = new Scanner(System.in);
	ICarDao icd = new CarDaoImpl(8);
	
	public void saveCar(){
		Car c = new Car();
		System.out.println("������Ʒ��");
		c.setBrand(scan.next());
		System.out.println("�����복��");
		c.setType(scan.next());
		System.out.println("�����복�ƺ�");
		c.setNum(scan.next());
		icd.save(c);
	}
	
	public void delCar(){
		System.out.println("������Ҫɾ���ĳ�������");
		icd.delete(scan.next());
	}
	public void queryById(){
		System.out.println("������Ҫ���ҵĳ�������");
		Car car = icd.queryByNum(scan.next());
		if (car != null) {
			System.out.println("Ʒ�ƣ�"+car.getBrand());
			System.out.println("���֣�"+car.getType());
			System.out.println("���ƺţ�"+car.getNum());
			System.out.println("-----------------------");
		}else {
			System.out.println("��ƥ�䳵����Ϣ");
		}
	}
	public void queryByType(){
		System.out.println("������Ҫ���ҵĳ���");
		Car[] cars = icd.queryByType(scan.next());
		if (cars != null) {
			for (Car car : cars) {
				System.out.println("Ʒ�ƣ�"+car.getBrand());
				System.out.println("���֣�"+car.getType());
				System.out.println("���ƺţ�"+car.getNum());
				System.out.println("-----------------------");
			}
		}else {
			System.out.println("�����������");
		}
	}
	public void queryByBrand(){
		System.out.println("������Ҫ���ҵĳ���Ʒ��");
		Car[] cars = icd.queryByBrand(scan.next());
		if (cars != null) {
			for (Car car : cars) {
				System.out.println("Ʒ�ƣ�"+car.getBrand());
				System.out.println("���֣�"+car.getType());
				System.out.println("���ƺţ�"+car.getNum());
				System.out.println("-----------------------");
			}
		}else {
			System.out.println("Ʒ���������");
		}
	}
	
	
	
	public void showAll(){
		for (Car car : icd.queryAll()){
			System.out.println("Ʒ�ƣ�"+car.getBrand());
			System.out.println("���֣�"+car.getType());
			System.out.println("���ƺţ�"+car.getNum());
			System.out.println("-----------------------");
		}
	}
}

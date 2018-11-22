package cmWithInterFace;

import java.util.Scanner;

public class RunInput {
	Scanner scan = new Scanner(System.in);
	ICarDao icd = new CarDaoImpl(8);
	
	public void saveCar(){
		Car c = new Car();
		System.out.println("请输入品牌");
		c.setBrand(scan.next());
		System.out.println("请输入车种");
		c.setType(scan.next());
		System.out.println("请输入车牌号");
		c.setNum(scan.next());
		icd.save(c);
	}
	
	public void delCar(){
		System.out.println("请输入要删除的车辆牌照");
		icd.delete(scan.next());
	}
	public void queryById(){
		System.out.println("请输入要查找的车辆牌照");
		Car car = icd.queryByNum(scan.next());
		if (car != null) {
			System.out.println("品牌："+car.getBrand());
			System.out.println("车种："+car.getType());
			System.out.println("车牌号："+car.getNum());
			System.out.println("-----------------------");
		}else {
			System.out.println("无匹配车辆信息");
		}
	}
	public void queryByType(){
		System.out.println("请输入要查找的车种");
		Car[] cars = icd.queryByType(scan.next());
		if (cars != null) {
			for (Car car : cars) {
				System.out.println("品牌："+car.getBrand());
				System.out.println("车种："+car.getType());
				System.out.println("车牌号："+car.getNum());
				System.out.println("-----------------------");
			}
		}else {
			System.out.println("车种输入错误！");
		}
	}
	public void queryByBrand(){
		System.out.println("请输入要查找的车辆品牌");
		Car[] cars = icd.queryByBrand(scan.next());
		if (cars != null) {
			for (Car car : cars) {
				System.out.println("品牌："+car.getBrand());
				System.out.println("车种："+car.getType());
				System.out.println("车牌号："+car.getNum());
				System.out.println("-----------------------");
			}
		}else {
			System.out.println("品牌输入错误！");
		}
	}
	
	
	
	public void showAll(){
		for (Car car : icd.queryAll()){
			System.out.println("品牌："+car.getBrand());
			System.out.println("车种："+car.getType());
			System.out.println("车牌号："+car.getNum());
			System.out.println("-----------------------");
		}
	}
}

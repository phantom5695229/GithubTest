package cmWithInterFace;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RunInput ri = new RunInput();
		
		while (true) {
			System.out.println();
			System.out.println("**************************");
			System.out.println("1.添加");
			System.out.println("2.删除");
			System.out.println("3.按牌照查找");
			System.out.println("4.按车种查找");
			System.out.println("5.按品牌查找");
			System.out.println("6.显示当前库存");
			System.out.println("7.退出");
			System.out.println("**************************");
			
			System.out.println("请输入对应数字");
			int input = scan.nextInt();
			switch (input) {
			case 1 : ri.saveCar();
				break;
			case 2 : ri.delCar();
				break;
			case 3 : ri.queryById();
				break;
			case 4 : ri.queryByType();
				break;
			case 5 : ri.queryByBrand();
				break;
			case 6 : ri.showAll();
				break;
			case 7 : return;
			default : System.out.println("无效值，请重新输入");
			}
		}
	}
}

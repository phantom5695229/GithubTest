package cmWithInterFace;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RunInput ri = new RunInput();
		
		while (true) {
			System.out.println();
			System.out.println("**************************");
			System.out.println("1.���");
			System.out.println("2.ɾ��");
			System.out.println("3.�����ղ���");
			System.out.println("4.�����ֲ���");
			System.out.println("5.��Ʒ�Ʋ���");
			System.out.println("6.��ʾ��ǰ���");
			System.out.println("7.�˳�");
			System.out.println("**************************");
			
			System.out.println("�������Ӧ����");
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
			default : System.out.println("��Чֵ������������");
			}
		}
	}
}

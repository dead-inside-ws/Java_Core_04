package ua.lviv.lgs.first;

public class Main {
	public static void main(String[] args) {
		Robot r = new Robot("� Robot � � ������ ������");
		CoffeeRobot cr = new CoffeeRobot("� CoffeRobot � � ���� ����");
		RobotDancer rd = new RobotDancer("� RobotDancer � � ������ ������");
		RobotCooker rc = new RobotCooker("� RobotDancer � � ������ �����");
		
//		System.out.println(r);
//		System.out.println(cr);
//		System.out.println(rd);
//		System.out.println(rc);
		
		Object[]arrayOfRobots= {r,cr,rd,rc};
		for (int i = 0; i < arrayOfRobots.length; i++) {
			System.out.println(arrayOfRobots[i]);
		}
	}	
}

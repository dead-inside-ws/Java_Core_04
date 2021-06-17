package ua.lviv.lgs.first;

public class Main {
	public static void main(String[] args) {
		Robot r = new Robot("я Robot Ц € просто працюю");
		CoffeeRobot cr = new CoffeeRobot("я CoffeRobot Ц € варю каву");
		RobotDancer rd = new RobotDancer("я RobotDancer Ц € просто танцюю");
		RobotCooker rc = new RobotCooker("я RobotDancer Ц € просто готую");
		
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

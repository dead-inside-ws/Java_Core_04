package ua.lviv.lgs.second;

public class Main {
	public static void main(String[] args) {
		Animal a = new Animal("Леопард",20,7);
		System.out.print("Назва тварини = "+a.getName());
		System.out.print(", швидкість тварини = "+a.getSpeed()+" км/год");
		System.out.println(", вік тварини = "+a.getAge()+" років");
		System.out.println(" ---------------------------------------------------------------------------");
		a.setName("Max");
		a.setSpeed(6);
		a.setAge(16);
		System.out.print("Назва тварини = "+a.getName());
		System.out.print(", швидкість тварини = "+a.getSpeed()+" км/год");
		System.out.println(", вік тварини = "+a.getAge()+" років");
	}
}

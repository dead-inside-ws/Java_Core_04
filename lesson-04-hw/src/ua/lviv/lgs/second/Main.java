package ua.lviv.lgs.second;

public class Main {
	public static void main(String[] args) {
		Animal a = new Animal("�������",20,7);
		System.out.print("����� ������� = "+a.getName());
		System.out.print(", �������� ������� = "+a.getSpeed()+" ��/���");
		System.out.println(", �� ������� = "+a.getAge()+" ����");
		System.out.println(" ---------------------------------------------------------------------------");
		a.setName("Max");
		a.setSpeed(6);
		a.setAge(16);
		System.out.print("����� ������� = "+a.getName());
		System.out.print(", �������� ������� = "+a.getSpeed()+" ��/���");
		System.out.println(", �� ������� = "+a.getAge()+" ����");
	}
}

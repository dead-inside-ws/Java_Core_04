package ua.lviv.lgs.first;

public class Robot {
	private String work;
	public Robot(String work) {
		this.work=work;
	}
	
	@Override
	public String toString() {
		return "'" + work + "'";
	}
}

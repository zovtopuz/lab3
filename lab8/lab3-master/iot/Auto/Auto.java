package ua.lviv.iot.Auto;

public class Auto {

    private String color;
    private String wheelDiameter;
    private int price;
    private String graduationYear;
	
    
    public Auto(String color, String wheelDiameter, int price, String graduationYear) {
		super();
		this.color = color;
		this.wheelDiameter = wheelDiameter;
		this.price = price;
		this.graduationYear = graduationYear;
	}


	@Override
	public String toString() {
		return "Auto [color=" + color + ", wheelDiameter=" + wheelDiameter + ", price=" + price + ", graduationYear="
				+ graduationYear + "]";
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getWheelDiameter() {
		return wheelDiameter;
	}


	public void setWheelDiameter(String wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getGraduationYear() {
		return graduationYear;
	}


	public void setGraduationYear(String graduationYear) {
		this.graduationYear = graduationYear;
	}


	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}
}
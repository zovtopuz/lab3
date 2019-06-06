package ua.lviv.iot.Auto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "color")
	private String color;
	@Column(name = "wheelDiameter")
	private String wheelDiameter;
	@Column(name = "price")
	private int price;
	@Column(name = "graduationYear")
	private String graduationYear;

	public Auto() {

	}

	public Auto(String color, String wheelDiameter, int price, String graduationYear) {
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
}
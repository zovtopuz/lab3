package ua.lviv.iot.Auto;

public class Truck extends Auto {
	private int weight;
    private int numberOfWheels;
    private Motor tyeOfMotor;

    public Truck(String color, String wheelDiameter, int price, String graduationYear) {
		super(color, wheelDiameter, price, graduationYear);
		// TODO Auto-generated constructor stub
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Motor getTyeOfMotor() {
		return tyeOfMotor;
	}

	public void setTyeOfMotor(Motor tyeOfMotor) {
		this.tyeOfMotor = tyeOfMotor;
	}

}
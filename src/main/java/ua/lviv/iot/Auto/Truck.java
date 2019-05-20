package ua.lviv.iot.Auto;

public class Truck extends Auto {
    private int weight;
    private int numberOfWheels;

    public Truck(String color, String wheelDiameter, int price, String graduationYear, int weight, int numberOfWheels) {
		super(color, wheelDiameter, price, graduationYear);
		this.weight = weight;
		this.numberOfWheels = numberOfWheels;
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

}
    
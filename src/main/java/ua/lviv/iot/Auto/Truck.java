package ua.lviv.iot.Auto;

public class Truck extends Auto {
    private int weight;
    private int numberOfWheels;
	private Motor dvig;

    public Truck(String color, String wheelDiameter, int price, String graduationYear, Motor dvig, int weight, int numberOfWheels) {
		super(color, wheelDiameter, price, graduationYear);
		this.weight = weight;
		this.numberOfWheels = numberOfWheels;
		this.dvig = dvig;
	}

    public String getHeaders() {
    	return super.getHeaders() + "," 
                + "weight" + ","
                + "numberOfWheels" + ","
                + "dvig";
    }

    public String toCSV() {
    	 return super.toCSV() + ","
    			+ this.weight + ","
                + this.numberOfWheels + ","
                + this.dvig;
    }
    
    public int getWeight() {
        return weight;
    }

    public void setWeight( int weight) {
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels( int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", numberOfWheels=" + numberOfWheels + ", dvig=" + dvig + "]";
	}
}
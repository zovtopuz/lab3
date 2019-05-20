package ua.lviv.iot.Auto;

public class Bus extends Auto {
    private int numberOfWindows;
    private int numberOfStandingPlaces;
	private CarBrand brand;
    
	public Bus(String color, String wheelDiameter, int price, String graduationYear, CarBrand brand, int numberOfWindows,
			int numberOfStandingPlaces) {
		super(color, wheelDiameter, price, graduationYear);
		this.numberOfWindows = numberOfWindows;
		this.numberOfStandingPlaces = numberOfStandingPlaces;
		this.setBrand(brand);
    }
    public String getHeaders() {
        return super.getHeaders() + ","
        		+ "numberOfWindows" + ","
                + "numberOfStandingPlaces" + ","
        		+ "brand";
    }

    public String toCSV() {
        return super.toCSV() + ","
        		+ this.numberOfWindows + ","
                + this.numberOfStandingPlaces + ","
                + this.brand;
    }
    
    public int getNumberOfWindows() {
        return numberOfWindows;
    }
    public void setNumberOfWindows( int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
    public int getNumberOfStandingPlaces() {
        return numberOfStandingPlaces;
    }
    public void setNumberOfStandingPlaces(
             int numberOfStandingPlaces) {
        this.numberOfStandingPlaces = numberOfStandingPlaces;
	}
	@Override
	public String toString() {
		return "Bus [numberOfWindows=" + numberOfWindows + ", numberOfStandingPlaces=" + numberOfStandingPlaces
				+ ", CarBrand=" + brand + "]";
	}
	public CarBrand getBrand() {
		return brand;
	}
	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}

}
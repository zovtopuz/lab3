package ua.lviv.iot.Auto;

public class Bus extends Auto {
	private int numberOfWindows;
    private int numberOfStandingPlaces;
    private CarBrand tyeOfCarBrand;
    ;
;

    public Bus(String color, String wheelDiameter, int price, String graduationYear) {
		super(color, wheelDiameter, price, graduationYear);
		// TODO Auto-generated constructor stub
    }
	public int getNumberOfWindows() {
		return numberOfWindows;
	}
	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}
	public int getNumberOfStandingPlaces() {
		return numberOfStandingPlaces;
	}
	public void setNumberOfStandingPlaces(int numberOfStandingPlaces) {
		this.numberOfStandingPlaces = numberOfStandingPlaces;
	}
	public CarBrand getTyeOfCarBrand() {
		return tyeOfCarBrand;
	}
	public void setTyeOfCarBrand(CarBrand tyeOfCarBrand) {
		this.tyeOfCarBrand = tyeOfCarBrand;
	}

}
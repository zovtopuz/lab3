package ua.lviv.iot.Auto;

public class Car extends Auto {
	private int seats;
    private double loadCapacity;
    private VolumeMotor tyeOfVolumeMotor;

    public Car(String color, String wheelDiameter, int price, String graduationYear) {
		super(color, wheelDiameter, price, graduationYear);
        // TODO Auto-generated constructor stub
    }

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public VolumeMotor getTyeOfVolumeMotor() {
		return tyeOfVolumeMotor;
	}

	public void setTyeOfVolumeMotor(VolumeMotor tyeOfVolumeMotor) {
		this.tyeOfVolumeMotor = tyeOfVolumeMotor;
	}
    
}

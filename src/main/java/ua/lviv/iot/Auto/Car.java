package ua.lviv.iot.Auto;

public class Car extends Auto {
    private int seats;
    private double loadCapacity;
	private VolumeMotor volume;

    public Car(String color, String wheelDiameter, int price, String graduationYear, VolumeMotor volume, int seats, double loadCapacity) {
		super(color, wheelDiameter, price, graduationYear);
		this.seats = seats;
		this.loadCapacity = loadCapacity;
		this.setVolume(volume);
		
    }

    public String getHeaders() {
    	 return super.getHeaders() + ","
    			+ "seats" + ","
                + "loadCapacity" + ","
    			+ " volume ";
    }

    public String toCSV() {
        return super.toCSV() + ","
        		+ this.seats + ","
                + this.loadCapacity + ","
                + this.volume;
    }
    
    public  int getSeats() {
        return seats;
    }

    public void setSeats( int seats) {
        this.seats = seats;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity( double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

	public VolumeMotor getVolume() {
		return volume;
	}

	public void setVolume(VolumeMotor volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Car [seats=" + seats + ", loadCapacity=" + loadCapacity + ", volume=" + volume + "]";
	}
   
}

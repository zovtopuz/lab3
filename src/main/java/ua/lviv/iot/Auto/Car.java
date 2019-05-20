package ua.lviv.iot.Auto;

public class Car extends Auto {
    private int seats;
    private double loadCapacity;

    public Car(String color, String wheelDiameter, int price, String graduationYear, int seats, double loadCapacity) {
		super(color, wheelDiameter, price, graduationYear);
		this.seats = seats;
		this.loadCapacity = loadCapacity;

    }
	public final int getSeats() {
        return seats;
        }

    public final void setSeats(final int seats) {
        this.seats = seats;
        }

    public final double getLoadCapacity() {
        return loadCapacity;
        }

    public final void setLoadCapacity(final double loadCapacity) {
        this.loadCapacity = loadCapacity;
        }

    
    }
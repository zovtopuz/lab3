package ua.lviv.iot.Auto;

public class Bus extends Auto {
    private int numberOfWindows;
    private int numberOfStandingPlaces;
    
	public Bus(String color, String wheelDiameter, int price, String graduationYear, int numberOfWindows,
			int numberOfStandingPlaces) {
		super(color, wheelDiameter, price, graduationYear);
		this.numberOfWindows = numberOfWindows;
		this.numberOfStandingPlaces = numberOfStandingPlaces;
        }

	public final int getNumberOfWindows() {
        return numberOfWindows;
        }
    public final void setNumberOfWindows(final int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        }
    public final int getNumberOfStandingPlaces() {
        return numberOfStandingPlaces;
        }
    public final void setNumberOfStandingPlaces
    (final int numberOfStandingPlaces) {
        this.numberOfStandingPlaces = numberOfStandingPlaces;
        }
   
    }
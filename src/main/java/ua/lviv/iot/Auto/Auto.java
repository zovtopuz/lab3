package ua.lviv.iot.Auto;

public class Auto {

    private String color;
    private String wheelDiameter;
    private int price;
    private String graduationYear;

    public Auto(final String color, final String wheelDiameter,
            final int price, final String graduationYear) {
        super();
        this.color = color;
        this.wheelDiameter = wheelDiameter;
        this.price = price;
        this.graduationYear = graduationYear;
    }


    @Override
    public final String toString() {
        return "Auto [color=" + color
                + ", wheelDiameter=" + wheelDiameter
                + ", price=" + price + ", graduationYear="
                + graduationYear + "]";
        }


    public final String getColor() {
        return color;
        }


    public final  void setColor(final String color) {
        this.color = color;
        }


    public final String getWheelDiameter() {
        return wheelDiameter;
        }


    public final void setWheelDiameter(final String wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
        }


    public final int getPrice() {
        return price;
        }


    public final void  setPrice(final int price) {
        this.price = price;
        }


    public final String getGraduationYear() {
        return graduationYear;
        }


    public final void setGraduationYear(final String graduationYear) {
        this.graduationYear = graduationYear;
        }


  
    }
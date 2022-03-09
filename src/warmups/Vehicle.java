package warmups;

public class Vehicle {

    protected String model;
    protected String make;
    protected Integer year;
    protected String color;

    public Vehicle(String model, String make, Integer year, String color) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
    }

    public String getMakeModel() {
        return this.make + " " + this.model;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getAllInfo() {
        return "This vehicle is a "+ this.year +" " + this.make +" "+ this.model+ " with a color of " + this.color + ".";
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Maxima", "Nissan", 2013, "Glacier White");
        System.out.println(vehicle1.getAllInfo());
        System.out.println(vehicle1.getYear());
        System.out.println(vehicle1.getMakeModel());
    }

}

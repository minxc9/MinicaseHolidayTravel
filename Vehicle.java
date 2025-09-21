public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public String getVehicleName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public double getBaseCost() {
        return baseCost;
    }

    public void setVehicleName(String name) {
        this.name = name;
    }
    public void setModel(String model) {
        this.model = model;
    } 
    public void setYear(int year) {
        this.year = year;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public String toString() {
        return manufacturer + " " + model + " (" + year + "), baseCost=" + baseCost;
    }
}

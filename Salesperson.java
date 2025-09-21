public class Salesperson {
    private int salespersonID;
    private String name;

    public Salesperson(int salespersonID, String name) {
        this.salespersonID = salespersonID;
        this.name = name;
    }

    public int getsalesId() {
        return salespersonID;
    }
    public String getSalesName() {
        return name;
    }

    public void setSalesName(String name) {
        this.name = name;
    }
}
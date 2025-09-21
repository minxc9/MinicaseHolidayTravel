import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle("SN-001","Holiday Cruiser","HC-200",2025,"Holiday Travel Vehicles",34999.0);
        // Customer c = new Customer(1,"Alice","123 Beach Rd","080-000-0000");
        // Salesperson s = new Salesperson(42,"Bob");

        // Invoice inv = new Invoice(1001, new Date(), v, c, s);
        // inv.setTax(2500.0);
        // inv.setLicenseFee(500.0);
        // inv.setTradeinAllowance(1000.0);
        // inv.addOption(new Option("OP1","Sunroof",1200.0));

        // inv.calculateFinalPrice();
        // System.out.println(inv);
        Vehicle v = new Vehicle("SN-001","Holiday Cruiser","HC-200",2025,
                                "Holiday Travel Vehicles",34999.0);
        System.out.println(v);
    }
}
import java.util.Date;
import java.util.ArrayList;


public class Invoice {
    private int invoiceID;
    private Date date;
    private double finalPrice;
    private double tax;
    private double licenseFee;
    private String customerSignature;
    private double tradeinAllowance;

    private Vehicle vehicle;
    private ArrayList<Option> options;
    private TradeInVehicle tradeInVehicle;
    private Customer customer;
    private Salesperson sales;

    public Invoice(int invoiceID, Date date, Vehicle vehicle, TradeInVehicle tradeInVehicle,
    Customer customer, Salesperson sales) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.vehicle = vehicle;
        this.tradeInVehicle = tradeInVehicle;
        this.customer = customer;
        this.sales = sales;
    }

    public int getInvoiceId() {
        return invoiceID;
    }
    public Date getDate() {
        return date;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public TradeInVehicle getTradeInVehicle() {
        return tradeInVehicle;
    }
    public Customer customer() {
        return customer;
    }
    public Salesperson sales() {
        return sales;
    }
    public ArrayList<Option> getOption() {
        return options;
    }
    public double getTax() {
        return tax;
    }
    public double getLicenseFee() {
        return licenseFee;
    }
    public String getCustomerSignature() {
        return customerSignature;
    }
    public double getTradeinAllowance() {
        return tradeinAllowance;
    }
    public double getFinalPrice() {
        return finalPrice;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public void setLicenseFee(double licenseFee) {
        this.licenseFee = licenseFee;
    }
    public void setCustomerSignature(String customerSignature) {
        this.customerSignature = customerSignature;
    }
    public void setTradeinAllowance(double tradeinAllowance) {
        this.tradeinAllowance = tradeinAllowance;
    }
    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) { 
        this.tradeInVehicle = tradeInVehicle; 
    }

    public void calculateFinalPrice() {
        double optionsSum = 0.0;
        for (Option o : options) optionsSum += o.getPrice();
        double subtotal = vehicle.getBaseCost() + optionsSum + licenseFee - tradeinAllowance;
        finalPrice = Math.max(0.0, subtotal + tax);
    }

    public String toString() {
        return "Invoice No." + invoiceID + " Date: "+ date + " Vehicle: " + vehicle + " finalPrice: " + finalPrice;
    }

}
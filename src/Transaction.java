
import java.util.ArrayList;


public class Transaction {

    private ArrayList itemList;
    private Double totalPrice;
    private int itemCount;
    private double tax;
    private String paymentType;

    public Transaction() {
        itemList = new ArrayList<Item>();
        totalPrice = 0.0;
        itemCount = 0;
        tax = 0;
    }

    public Transaction(double tax) {
        itemList = new ArrayList<Item>();
        totalPrice = 0.0;
        itemCount = 0;
        this.tax = tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public ArrayList getList() {
        return itemList;
    }

    public void addItem(Item a) {
        itemList.add(a);
        totalPrice += a.getTaxedPrice(tax);
        itemCount++;
    }

    public void voidItem(int index) {
        itemList.remove(index);
    }

    public void addTransactionDiscount(double disc) { //disc should be a number between 0 and 1. if you want a 10% discount, .1 would be entered.
        totalPrice = totalPrice * (1 - disc);
    }

    public void setTransactionType(String str) {
        paymentType = str;
    }

    public String getTransactionType() {
        return paymentType;
    }
    
    public double getPrice() {
        return totalPrice;
    }
    
    
    

}

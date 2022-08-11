/*
 * 
 */
/**
 *
 *
 */
public class Item {

    private int departmentNum; //two digit number. department numbers are included in DEPTLIST.txt which is initialized when creating store
    private String itemName; //name of product
    private int styleNum; //6 digit number for lookup purposes
    private double price; //price
    private boolean isTax;
    public Item(String nm) {
        itemName = nm;
    }

    public void setName(String nm) {
        itemName = nm;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStyle(int style) {
        styleNum = style;
    }

    public String getName() {
        return itemName;
    }

    public int getDepartment() {
        return departmentNum;
    }

    public int getStyle() {
        return styleNum;
    }

    public double getPrice() {
        return price;
    }
    
    public double getTaxedPrice(double tax) { //tax should be a number between 0 and 1. 7% tax is .07.
       if (isTax)
           return price*(1+tax);
       else
           return price;
    }
}

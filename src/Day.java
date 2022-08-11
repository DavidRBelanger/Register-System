
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author drbx3
 */
public class Day {

    private ArrayList transactionList;
    private Date date;

    public Day() {
        transactionList = new ArrayList<Transaction>();
        date = new Date();
    }

    public void addTransaction(Transaction a) {
        transactionList.add(a);
    }

    public void removeTransaction(int index) {
        transactionList.remove(index);
    } 
    
    
    
}

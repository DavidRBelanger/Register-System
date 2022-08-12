
import java.util.ArrayList;
import java.util.Date;

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

    public Date getDate() {
        return date;
    }

    public ArrayList<Transaction> getList() {
        return transactionList;
    }

    public Transaction get(int index) {
        return (Transaction) transactionList.get(index);
    }
    
    public ArrayList<Transaction> get(double min) {
        ArrayList list = new ArrayList<Transaction>();
        for (int i = 0; i < transactionList.size(); i++) {
            Transaction a = (Transaction) transactionList.get(i);
            if (a.getPrice()>=min)
                list.add(a);
        }
        return list;
    }

}

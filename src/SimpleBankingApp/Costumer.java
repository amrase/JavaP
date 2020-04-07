package SimpleBankingApp;

import java.util.ArrayList;

public class Costumer {
  private String name;
  private ArrayList<Double> transaction;

  public Costumer(String name,double initialAmount){
      this.name = name;
      this.transaction = new ArrayList<Double>();
      addTransaction(initialAmount);
  }

  public  void addTransaction(double amount){
      this.transaction.add(amount);
  }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}

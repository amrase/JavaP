package SimpleBankingApp;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Costumer> costumers = new ArrayList<>();


    public Branch(String branchName) {
        this.branchName = branchName;
        this.costumers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Costumer> getCostumers() {
        return costumers;
    }

    public boolean newCostumer(String costumerName, double initialAmount){
        if(findCostumer(costumerName) == null){
            this.costumers.add(new Costumer(costumerName,initialAmount));
            return true;
        }
            System.out.println("Costumer exists");
            return false;

    }

    public boolean addTransaction(String costumerName,double amount){
        Costumer existingCostumer = findCostumer(costumerName);
        if( existingCostumer != null){
            existingCostumer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Costumer findCostumer(String costumerName){
        for(int i =0;i<this.costumers.size();i++){
            Costumer checkedCostumer = this.costumers.get(i);
            if( checkedCostumer.getName() == costumerName){
                return checkedCostumer;
            }
        }
        return null;
    }
}

package SimpleBankingApp;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches ;


    public Bank(String bankName){
        this.bankName=bankName;
        this.branches = new ArrayList<Branch>();
    }


    public  boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCostumer(String branchName,String costumerName,double initalAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCostumer(costumerName,initalAmount);
        }
        return false;
    }

    public boolean addCostumerTransaction(String branchName,String costumerName,double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaction(costumerName,amount);
        }
        return false;
    }


    private Branch findBranch(String branchName){
        for(int i =0;i<this.branches.size();i++){
            Branch checkedBranch = this.branches.get(i);
            if( checkedBranch.getBranchName() == branchName){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCostumers(String branchName,boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch !=null){
            System.out.println("Costumers details for branch :" + branch.getBranchName());
            ArrayList<Costumer> branchCostumers = branch.getCostumers();
            for(int i =0;i<branchCostumers.size();i++){
                Costumer branchCostumer = branchCostumers.get(i);
                System.out.println("Costumer:" + branchCostumer.getName() +  "[" + i +"]" );
                if(showTransactions){
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCostumer.getTransaction();
                    for(int j =0;j<transactions.size();j++){
                        System.out.println("["+(j+1)+"] Amount" + transactions.get(j));
                    }
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}

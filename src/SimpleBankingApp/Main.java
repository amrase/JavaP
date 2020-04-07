package SimpleBankingApp;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch created");
        }


        bank.addCostumer("Adelaide","Time",50.05);
        bank.addCostumer("Adelaide","Mike",175.35);
        bank.addCostumer("Adelaide","Percy",220.11);

        bank.addBranch("Sydney");
        bank.addCostumer("Sydney","Bob",150.54);

        bank.addCostumerTransaction("Adelaide" ,"Tim",44.22);
        bank.addCostumerTransaction("Adelaide" ,"Tim",12.44);
        bank.addCostumerTransaction("Adelaide" ,"Mike",1.22);


//        bank.listCostumers("Adelaide",true);
        bank.listCostumers("Sydney",true);

        bank.addBranch("Melbourne");

        if(!bank.addCostumer("Melbourne","Brian",5.53)){
            System.out.println("Error Melbourne branch didnt exist");
        }

        if(!bank.addBranch("Sydney")){
            System.out.println("Sydney branch already exists");
        }


        if(!bank.addCostumerTransaction("Adelaide","Fergus",12.332)){
            System.out.println("Costumer does not exist at branch");
        }


    }
}

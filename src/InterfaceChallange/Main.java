package InterfaceChallange;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player tim =  new Player("Tim",10,15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(5);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
//         loadObject(tim);
        System.out.println(tim);


        Saveable warewolf = new Monster("Warewolf",20,40);
        //We can't call warewold.getStrength becuase we need to cast it to Monster so we can do
        System.out.println("Monster strength =" + ((Monster)warewolf).getStrength());

        System.out.println(warewolf);
        saveObject(warewolf);


    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;



        while(!quit){
            System.out.println("Choose\n" + "1 to enter a string\n"+ "0 to quit");
            int actions  = scanner.nextInt();
            scanner.nextLine();
            switch (actions){

                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;

    }

    public static void saveObject(Saveable objectToSave){
        for (int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

        }
    }

    public static void loadObject(Saveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}

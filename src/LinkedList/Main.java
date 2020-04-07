package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

           LinkedList<String> placesToVisit  = new LinkedList<String>();
           addInOrder(placesToVisit,"Sydney");
            addInOrder(placesToVisit,"Sydney");
            addInOrder(placesToVisit,"Perth");
            addInOrder(placesToVisit,"Darwin");
            addInOrder(placesToVisit,"Bergamo");
            addInOrder(placesToVisit,"LA");
            addInOrder(placesToVisit,"Adelaide");
//        placesToVisit.add("LV");
//           placesToVisit.add("Sydney");
//            placesToVisit.add("Perth");
//            placesToVisit.add("Darwin");
//            placesToVisit.add("Bergamo");
//            placesToVisit.add("LA");
//            placesToVisit.add("LV");

            printList(placesToVisit);
            addInOrder(placesToVisit,"Adelaide");
//
//            //changes the element on index 1 to Alice SPRINGS
//            placesToVisit.add(1,"Alice Springs");
//
//            printList(placesToVisit);
//
//            placesToVisit.remove(4);
//            printList(placesToVisit);
        visit(placesToVisit);


    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting :" + i.next() );
        }
        System.out.println("===============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator =  linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal,do not add
                System.out.println(newCity+" is already added as a destination");
                return false;
            }
            else if(comparison>0){
                //new City should appear before this one
                //we need to move back
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
         else if(comparison<0){
             //Move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        }
        else{
            System.out.println("Now wisiting " + listIterator.next());
            printMenu();
        }
        while(!quit){
            int actions = scanner.nextInt();
            scanner.nextLine();
            switch (actions){
                case 0:
                    System.out.println("Holiday Vacation over");
                    quit = true;
                    break;
                case 1:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting" + listIterator.next());
                    }
                    else{
                        System.out.println("Reached end of the list");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                        break;
                    }
                    else{
                        System.out.println("We are at the start of the list");
                        break;
                    }
                case 3:
                    printMenu();
                    break;
            }

        }
    }


    public static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"+"1 - go to next city\n" +
                "2 - go to previous city\n" + "3 - print menu options"
                );
    }

//        Customer costumer = new  Customer("Tim",54.97);
//        Customer anotherCustomer ;
//        anotherCustomer= costumer;
//        anotherCustomer.setBalance(11.34);
//        System.out.println(costumer.getName()+"Balance for costumer:" + costumer.getBalance());
//        System.out.println( anotherCustomer.getName() + "Balance for other costumer:" + anotherCustomer.getBalance());
//
//
//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(3);
//        intList.add(5);
//
//        for(int i=0;i<intList.size();i++){
//            System.out.println(i+":"+ intList.get(i));
//        }
//
//        intList.add(1,2);
//
//        for(int i=0;i<intList.size();i++){
//            System.out.println(i+":"+ intList.get(i));
//        }






}

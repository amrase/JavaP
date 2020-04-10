package com.amra._static;

public class Main {
    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());//1
//
//        StaticTest secondInstance = new StaticTest("2st Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());//1
//
//        StaticTest thirdInstance = new StaticTest("3st Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstances());
        int pw = 2435263;
        //compromised decrypted password
        Password myPassword = new ExtendedPassword(pw);
        myPassword.storePassword();

        myPassword.letMeIn(1);
        myPassword.letMeIn(34567);
        myPassword.letMeIn(6667);
        myPassword.letMeIn(-1);
        myPassword.letMeIn(2435263);

    }
}

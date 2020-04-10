package com.amra._static;

public class ExtendedPassword extends Password {
    private int decrytpedPassword;
    public ExtendedPassword(int password) {
        super(password);
        this.decrytpedPassword = password;
    }

    @Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decrytpedPassword);
    }
}

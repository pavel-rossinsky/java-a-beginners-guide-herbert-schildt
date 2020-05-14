package com.guide.c8;

// Use the default method.
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Can call getUserID(), because it is explicitly
        // implemented by MyIFImp:
        System.out.println("User ID is " + obj.getUserID());

        // Can also call get AdminID(), because of default
        // implementation
        System.out.println("Administrator ID is " + obj.getAdminID());
    }
}

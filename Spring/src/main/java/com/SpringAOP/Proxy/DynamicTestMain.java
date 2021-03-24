package com.SpringAOP.Proxy;

public class DynamicTestMain {
    public static void main(String[] args) {
        You you = new You();
        JDKHandeler jdkHandeler = new JDKHandeler(you);
        Marry marry =(Marry) jdkHandeler.getProxy();
        marry.toMarry();

        System.out.println("\n");
        Owner owner = new Owner();
        JDKHandeler jdkHandeler1 = new JDKHandeler(owner);
        Rent rent =(Rent) jdkHandeler1.getProxy();
        rent.rent();




    }
}

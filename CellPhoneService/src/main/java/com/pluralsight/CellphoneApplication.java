package com.pluralsight;

import java.util.Scanner;

public class CellphoneApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         CellPhone myPhone = new CellPhone();

         System.out.println("What is the serial number?");
         String sn = scanner.nextLine();

         System.out.println("What model is the phone?");
        String model = scanner.nextLine();

         System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();

         System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();

         System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();

        //set the cell data on the object
        myPhone.setSerialNumber( Integer.parseInt(sn) );
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        //use the getters to display this info
        System.out.println("SN: " + myPhone.getSerialNumber());
        System.out.println("model: " + myPhone.getModel());
        System.out.println("Carrier: " = myPhone.getCarrier());
        System.out.println("Phone number " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());


    }
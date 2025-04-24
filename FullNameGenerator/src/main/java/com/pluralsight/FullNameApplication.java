package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  String name = "";
  String firstName = "Glen";
  String lastName = "Williams";
  String middleName = "C.";
  String title = "PhD";


  //ask to input first name
  System.out.print("First name: ");
  firstName = scanner.nextLine().trim();

  //enter middle initial
  System.out.print("Middle initial: ");
  middleName = scanner.nextLine().trim();

  System.out.print("Last Name: ");
  lastName = scanner.nextLine().trim();

  System.out.print("Title: ");
  title = scanner.nextLine().trim();

  System.out.print("Full name: ");
  String fullName = firstName + " " + middleName + " " + lastName + title;

  System.out.println("----------------------");
  System.out.println("Full name: " + fullName.trim());











    }

}

import java.util.Scanner;
//package com.test.pkmn;



public class myfirstclass {

  public static void main(String[] args){
    System.out.println("Want to create a new pokemon ? Press 1");
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();
    if(value == 1) {
      String newnom = input.next();
      pkmn pika = new pkmn(newnom, "Static", 25);
      System.out.println(pika.nom);
    }
  }
}

package org.example;

import java.util.Scanner;

public class Dowhileapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*  System.out.println(" Enter Value ");
        int value  = scanner.nextInt();
        while(value != 5){
            System.out.println("Your Entered Value ");
            value  = scanner.nextInt();
        }
        System.out.println("Your Entered 5 Value!!! ");?*/
        int value = 0;
do{
    System.out.println(" Enter Value ");
     value  = scanner.nextInt();
}
while(value !=10);
    System.out.println("Got 5");

    }
}

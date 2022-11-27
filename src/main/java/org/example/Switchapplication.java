package org.example;

import java.util.Scanner;

public class Switchapplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Command");
        String text = scanner.nextLine();
        switch (text){
            case  "Start":
                System.out.println("Started");
                break;
            case "Stop":
                System.out.println("Stopped");
                break;
            default:
                System.out.println("Unrecognised");
        }
    }

}

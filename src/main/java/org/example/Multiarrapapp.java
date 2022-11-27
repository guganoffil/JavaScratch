package org.example;

public class Multiarrapapp {
    public static void main(String[] args) {
        //int Arrray
        int[][] multi  = {
                {12,34,90},
                {20,45,38},
                {897,9,655}

        };
System.out.println(multi[2][2]);
//String Array
        String[][]  multistr= new String[2][2];
        multistr[0][0] = "Hai";
        multistr[1][0] = "Gugan";
        System.out.println(multistr[1][0]);
        //for loop
        for(int row=0;row<multi.length;row++){
            for(int col=0;col<multi[row].length;col++){
                System.out.print(multi[row][col] + "\t");
            }
            System.out.println();
        }
    }

}

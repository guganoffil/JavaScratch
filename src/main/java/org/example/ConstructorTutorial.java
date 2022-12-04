package org.example;
class Machine{
    private String name;
   public Machine(){
       System.out.println("first constructor runing ");
   }
    public Machine(String name){
        System.out.println("second constructor runing ");
    }
}
public class ConstructorTutorial {
    public static void main(String[] args) {
        Machine Machine1 = new Machine();
        Machine Machine2 = new Machine("Gugan  ");
    }
}

package org.example;
class Thing{
    public static String name;
    public String description;
    public final static int AGE = 24;
}
public class StaticAndFinal {
    public static void main(String[] args) {
       Thing.name = "Java Class";
        System.out.println("Name = " + Thing.name);
        System.out.println("Thing.Age = " + Thing.AGE);
    }

}

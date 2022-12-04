package org.example;
class Colleges{
    //instance variable data or state
    String name;
    int age;
     int  retirementAge(){
        int yearsLeft = 65 - age;
        return yearsLeft;
    }
    int getAge(){
         return age;
    }
    String getName(){
    return name;
    }

}
public class GettersAndReturnValue {
    public static void main(String[] args) {
        Colleges attendance = new Colleges();
        attendance.name = "Gugan";
        attendance.age = 24;
        System.out.println("Attendance = " + attendance.name);
        System.out.println("Attendance = " + attendance.age);
        int years = attendance.retirementAge();
        int age = attendance.getAge();
        String Name = attendance.getName();
        System.out.println("Name = " + Name);
        System.out.println("age = " + age);
        System.out.println("years = " + years);

    }
}

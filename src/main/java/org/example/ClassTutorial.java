package org.example;
class College{
    //instance variable data or state
    String name;
    Number age;

}
public class ClassTutorial {
    public static void main(String[] args) {
College attendance = new College();
attendance.name = "Gugan";
attendance.age = 24;
        System.out.println("Attendance = " + attendance.name);
        System.out.println("Attendance = " + attendance.age);
    }
}

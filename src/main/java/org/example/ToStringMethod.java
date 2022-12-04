package org.example;
class Student{
    private  String name;
    private String dept;
    public Student(String name,String dept){
        this.name = name;
        this.dept = dept;

    }
    public String toString(){
        return name +":"+dept;
    }
}

public class ToStringMethod {
    public static void main(String[] args) {
        Student admission = new Student("Gugan","IT");
        System.out.println("admission = " + admission);

    }

}

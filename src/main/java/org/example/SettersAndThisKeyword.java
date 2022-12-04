package org.example;
class Example{
   private  String name;
  private   int age;

  public void setName(String name){
    this.name = name;

  }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class SettersAndThisKeyword {
    public static void main(String[] args) {
Example newEx = new Example();
newEx.setName("Gugan");
newEx.setAge(24);
        System.out.println("newEx = " + newEx.getName());
        System.out.println("newEx = " + newEx.getAge());
    }
}

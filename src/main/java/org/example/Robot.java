package org.example;
class Operation{
    public void speak(String talk){
        System.out.println("talk = " + talk);
    }
    public void jump(int meter){
        System.out.println("meter = " + meter);
    }
}
public class Robot {
    public static void main(String[] args) {
Operation chitti = new Operation();
chitti.speak("Hai I am Chitti");
chitti.jump(7);
    }
}

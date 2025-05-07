package Coding.Random;

public class Parent {
    int a;
    String name;
    public Parent(){
        System.out.println("Random.Parent Default Const..");
    }
    public Parent(int a, String name){
        this.a=a;
        this.name = name;
        System.out.println("Random.Parent Const.. Name : "+name+" a: "+a);
    }
    public void m1(){
        System.out.println("parent method m1");
    }
    public void m2(){
        System.out.println("parent inherited method m2");
    }
    public static void mfunction(){
        System.out.println("Static parent function");
    }
}

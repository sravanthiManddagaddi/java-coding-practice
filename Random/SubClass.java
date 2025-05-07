package Coding.Random;

public class SubClass extends Parent implements ParentInterface{
    int a;
    String name;
    String gender;

   public SubClass(int a,String name){
       this.a =a;
       this.name = name;
       this.gender = "F";
       System.out.println("Child Const.. Name : "+name+" a: "+a+" gender: "+gender);

   }
   @Override
   public void m1(){
       System.out.println("child method overridden m1");
   }
   public void m3(){
       System.out.println(gender);
   }

    public static void mfunction(){
        System.out.println("Static child function");
    }

    public static void main(String[] args) {
        SubClass newObj = new SubClass(23,"Sreya");
        newObj.m1();
        newObj.m2();
        newObj.m3();
        SubClass.mfunction();
        Parent newObj1 = new SubClass(25,"Simran");
        newObj1.m1();
        newObj1.m2();
        Parent.mfunction();
        ParentInterface newObj2 = new SubClass(25,"Simran");
        newObj2.m3();
        Parent newObj3 = new Parent();
        newObj3.m1();

    }
}

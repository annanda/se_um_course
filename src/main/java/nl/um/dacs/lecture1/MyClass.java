package nl.um.dacs.lecture1;

public class MyClass {
    final int x;

    public MyClass(int x){
        this.x = x;
    }

    public static void main(String [] args){
        MyClass myObject = new MyClass(26);
        // myObject.x = 25;
        System.out.println(myObject.x);
    }
}

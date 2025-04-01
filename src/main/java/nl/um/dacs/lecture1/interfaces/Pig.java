package nl.um.dacs.lecture1.interfaces;

public class Pig implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The Pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzz");
    }
}

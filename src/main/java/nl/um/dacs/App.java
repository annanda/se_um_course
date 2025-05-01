package nl.um.dacs;

import nl.um.dacs.lecture1.Animal;
import nl.um.dacs.lecture1.Day;
import nl.um.dacs.lecture1.Dog;
import nl.um.dacs.lecture1.Person;
import nl.um.dacs.lecture1.Pig;
import nl.um.dacs.lecture8.ArraySumCalculator;

/**
 * Hello world!
 *
 */
public class App 
{   
    private static void dateViolation(){
        System.out.println( "Violation of Day class logic!" );
        Day d = new Day(30, 4, 2025);
        System.out.println(d.date);
        d.date++;
        System.out.println(d.date);
    }

    private static void personEncapsulation(){
        Person p = new Person();
        p.setName("John");
        System.out.println(p.getName());
    }

    private static void animalInheritance() {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        myAnimal.animalSound();
        myPig.animalSound();
    }

    private static void animalPolymorphism() {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }

    private static void debugging() {
        ArraySumCalculator.main(null);
    }
    
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        // dateViolation();
        // personEncapsulation();
        // animalInheritance();
        // animalPolymorphism();
        debugging();
    }
}

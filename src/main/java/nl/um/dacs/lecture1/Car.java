package nl.um.dacs.lecture1;

public class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args){
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}

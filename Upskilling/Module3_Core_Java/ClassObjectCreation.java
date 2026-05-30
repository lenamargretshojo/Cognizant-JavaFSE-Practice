/*17. Class and Object Creation 
• Objective: Understand classes and objects. 
• Task: Create a Car class with attributes and methods. 
• Instructions: 
o Define attributes: make, model, year. 
o Implement a method displayDetails() to print car information. 
o Create objects of the Car class and call the method.*/

import java.util.Scanner;
public class ClassObjectCreation
{
    public static void main(String[] args)
    {
        Car car1=new Car("BMW", "X5", 2023);
        Car car2=new Car("Ford", "Mustang", 2021);
        car1.displayDetails();
        car2.displayDetails();
    }
}
    
class Car
{
    String model, make;
    int year;
    Car(String make, String model, int year)
    {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    void displayDetails()
    {
        System.out.println("Car Make: "+make);
        System.out.println("Car Model: "+model);
        System.out.println("Car Year: "+year);
        System.out.println("--------------------");
    }
}
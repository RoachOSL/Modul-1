
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author os199
 */
public class Car {
    
  
    private int weight;
    private String manufacturer;
    private String model;
    Scanner scanner = new Scanner(System.in);
    
    public Car(){
    } 
    
    public Car(int weight, String manufacturer, String model) {
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.model = model;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
     public String getModel() {
        return model;
    }
     
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
     
    public void setModel(String model) {
        this.model = model;
    }
    
    public void print() {
        System.out.printf("Car manufacturer and model: %s %s, and weight of the car is: %d%n" ,manufacturer, model, weight );
    }
    
    public void createCarFromUserInput() {
        System.out.println("Provide manufacturer of the car: ");
        String manufacturerOfInput = scanner.nextLine();
        System.out.println("Provide model of the car: ");
        String modelOfInput = scanner.nextLine();
        System.out.println("Provide weight of the car: ");
        int weightOfInput = scanner.nextInt();
        
        Car inputCar = new Car(weightOfInput, manufacturerOfInput, modelOfInput );
        inputCar.print();
    }
    
     
     
    
    
    
}

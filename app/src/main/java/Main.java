/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author os199
 */
public class Main {
    
    public static void main(String[] args) {
        
        HelloWorld hw = new HelloWorld();
        
        hw.introduceYourself();
        
        
        
        System.out.println("-".repeat(40));
        
        Car mercedes = new Car(1000,"Mercedes", "CLS 450");
        Car kia = new Car(1500,"Kia", "Sportage");
        Car toyota = new Car(2000,"Toyota", "RAV4");
        
        System.out.println(mercedes); 
        System.out.println(kia);
        System.out.println(toyota);
        
        System.out.println("-".repeat(40));
        mercedes.print();
        System.out.println("-".repeat(40));
        kia.print();
        System.out.println("-".repeat(40));
        toyota.print();
        System.out.println("-".repeat(40));
        
        Car emptyCar = new Car();
        
        emptyCar.createCarFromUserInput();
        
        
        
        
        
      
        
        
    }
    
     
      
    
}

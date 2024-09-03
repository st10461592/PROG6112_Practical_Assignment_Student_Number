
package com.mycompany.vehicle;
import java.util.Scanner;
import java.util.List;

//Base class for a vehicle
 class Vehicle {
     private String make;
     private String model;
     private String enginesize;
     

    public Vehicle(String make, String model, String enginesize){
        this.make = make;
        this.model = model;
        this.enginesize = enginesize;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getEnginesize(){
        return enginesize;
    }
    
    public String getDetails(){
        return "Make:" + make + "Model:" + model + ",Enginesize:" + enginesize;
    }
 }

//Derived class for Car
 class Car extends Vehicle0 {
     private int enginesize;
     public Car(String make,String model,String enginesize){
         super(make,model,enginesize);
         
     }
 }

//Derived class for Motorcycle
 class Motorcycle extends Vehicle {
     private boolean hasSidecar;
     
     public Motorcycle(String make, String model, String enginesize,boolean hasSidecar){
         super(make,model,enginesize);
         this.hasSidecar = hasSidecar;
     }
     
     public String getDetails(){
         return super.getDetails() + ",Has Sidecar:" + (hasSidecar? "Yes" : "No");
     }
}

   class VehicleManager{
       private List<Vehicle> vehicles;
       public VehicleManager(){
           vehicles = new Arraylist<>(); 
       }
       
       public void addVehicle(Vehicle vehicle){
           vehicles.add(vehicle);
           System.out.println("Vehicle added: " + vehicle.getMake()
           +""+ vehicle.getModel());
       }
       public void viewVehicles(){
           if (vehicles.isEmpty()){
               System.out.println("No vehicles available");
               return;
           }
               System.out.println("List of Vehicles:");
               for(Vehicle vehicle: vehicles){
                   System.out.println(vehicle.getDetails());   
           }
       }
   }      
    
//This method was adapted from stack overflow
//https://stackoverflow.com/questions/44428951/beginner-java-how-to-get-it-to-display-menu-again-after-invalid-selection
public class VehicleManagementSystem{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();
        int choice;
        
        do{
            System.out.println("\nVehicle Management System");
            System.out.println("1. Add vehicle");
            System.out.println("2. Add Motocycle");
            System.out.println("3. View Vehicle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice ){
                case 1:
                    System.out.println("Enter car make: ");
                    String carMake = scanner.nextLine();
                    System.out.println("Enter car model: ");
                    String carModel = scanner.nextLine();
                    System.out.println("Enter engine size: ");
                    String carEnginesize = scanner.nextLine();
                    vehicleManager.addVehicle(new Car(carMake, carModel, carEnginesize));
                    break;
                    
                case 2:
                    System.out.println("Enter motorcycle make: ");
                    String motorcycle = scanner.nextLine();
                    System.out.println("Enter motorcycle model: ");
                    String motorcycleModel = scanner.nextLine();
                    System.out.println("Enter motorcycle engine size: ");
                    String enginesize = scanner.nextLine();
                    System.out.println("Does it have a sidecar? (Yes/No): ");
                    String sidecar = scanner.nextLine();
                    vehicleManager.addVehicle(new Motorcycle(motorcycleMake,motorcycleModel
                            ,motorcycleEnginesize,hasSidecar));
                    break;
                    
                case 3:
                    vehicleManager.viewVehicles();
                    break;
                    
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice.Please try again.");   
            }
          } while(choice =! 4);
        scanner.close();
        }
     }


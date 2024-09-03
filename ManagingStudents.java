
package com.mycompany.managingstudents;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TEMOGO
 */
public class ManagingStudents {
    
    
    //This was adapted from javatpoint
    //https://www.javatpoint.com/java-linkedlist
    public static ArrayList<Student> students = new ArrayList<>();
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter '1' to launch the menu or any other key to exit
        System.out.println("Enter (1) to launch menu or any other key to exit: ");
        String input = scanner.nextLine();
        
        
        if(input.equals("1")){
            showmenu(scanner);           
          }else{
            System.out.println("Exiting the application.");
            scanner.close();
          }
      }
        
        //This method was adapted from stack overflow
        //https://stackoverflow.com/questions/44428951/beginner-java-how-to-get-it-to-display-menu-again-after-invalid-selection
        //Use showMenu method to display the menu options for capturing students information
   public static void showmenu(Scanner scanner) {
        while (true){
            System.out.println("\nPlease select one of the following menu items:");
            System.out.println("1. Capture a new student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Print student report");
            System.out.println("5. Exit Application");
            
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    captureNewStudent(scanner);
                    break;
                case "2":
                    searchForStudent(scanner);
                    break;
                case "3":
                    deleteStudent(scanner);
                    break;
                case "4":
                    printStudentReport(scanner);
                    break;
                case  "5":
                    System.out.println("Exiting the application");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");        
            }
        }
    }
    
    
//Prompt user to enter information to capture a student
public static void captureNewStudent(Scanner scanner){ 
    System.out.println("Enter student ID: ");
    String id = scanner.nextLine();
    System.out.println("Enter student name: ");
    String name = scanner.nextLine();
    
    int age;
    while(true){
        System.out.println("Enter student age: (16 or older): ");
            age = scanner.nextInt();
            if (age>= 16){
                System.out.println("Age successfully entered");
              }else{
                System.out.println("Age must be 16 or older. Please try again.");
      }
 
   
         System.out.println("Enter student email: ");
         String email = scanner.nextLine();
         System.out.println("Enter student course: ");
         String course = scanner.nextLine();
         students.add(new Student(id,name,age,email,course));
        System.out.println("Student captured: " + name + ",ID:" + id + ",Email: " +email + 
            ", Age: " + age + ",Course: "+ course);
        System.out.println("Student added successfully");
  }
}


//Prompt user to enter a students' name or ID to search for them
public static void searchForStudent(Scanner scanner){
    System.out.println("Enter student ID to search: ");
    int id = scanner.nextInt();
    Student student = students.get(id);
        if(student =! null){             
            System.out.println("Student found");
            System.out.println("Email: " + student.getEmail());
            System.out.println("Course: " +student.getCourse());
            System.out.println("Age: " + student.getAge());
        }
        else {
        System.out.println("Student not found");
    }
}


//Prompt the user to enter a students' name or ID to delete them from the system 
public static void deleteStudent(Scanner scanner){
    System.out.println("Enter student ID to delete:");
    int id = scanner.nextInt();
    for(Student student : students){
      if (student.getId()=id){
         students.remove(student);
          System.out.println("Student deleted successfully");
      }else{
    System.out.println("Student not found");
      }
    }
}


//This method iterates through the students list and prints a report
public static void printStudentReport(Scanner scanner){ 
    System.out.println("Student ID: " + student.getId());
    System.out.println("Email: " + student.getEmail());
    System.out.println("Course: " + student.getCourse());
    System.out.println("Age: " + student.getAge);
}


//Prints a message indicating that the applicaton has ended
public static void exitStudentApplication(){
    System.out.println("Exiting the application. Thank you!");
   }
}

    


    
    
            
        

    


        
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managingstudents;

/**
 *
 * @author TEMOGO
 */
 class Student {
     private String id;
     private String name;
     private int age;
     private String email;
     private String course;
     
     Student (String id,String name, int age, String email, String course){
         this.id = id;
         this.name = name;
         this.age = age;
         this.email = email;
         this.course = course;
     }
     
     public String getID(){
         return id;
     }
     
     public String getName(){
         return name;
     }
     
     public int getAge(){
         return age;
     }
     
     public String getEmail(){
         return email;
     }
     
     public String getCourse(){
         return course;
    }
 }


    
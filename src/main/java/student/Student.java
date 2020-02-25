/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author qa
 */
public class Student {
     
private String firstName;
private String lastName;  
private int yearOfBirth;   

public Student (){

    this.firstName = "not defined";
    this.lastName = "not defined";
    this.yearOfBirth = 0;
}



public Student(String firstName, String lastName, int yearOfBirth) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.yearOfBirth = yearOfBirth;
       
    }




    
public void setFirstName (String customFirstName) {
       this.firstName = customFirstName;
   }    
 
public String getFirstName (){
    return this.firstName;
     
}

    
public void setLastName (String customLastName) {
       this.lastName = customLastName;
   }  

public String getLastName (){
    return this.lastName;
     
}


public void setYearOfBirth (int customYearOfBirth){
         this.yearOfBirth = customYearOfBirth; 
   }

public int getYearOfBirth(){
        return this.yearOfBirth;
    }




        
        
        
   
public void Info () {
       
    System.out.println("First name: " + this.getFirstName());
    System.out.println("Last name: " +  this.getLastName());
    System.out.println("Last name: " +  this.getYearOfBirth());

}

}

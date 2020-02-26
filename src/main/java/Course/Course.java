/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

/**
 *
 * @author qa
 */
public class Course {
    
    private String name;
    private int numberOfClasses;  
    private String codeName;    
    
    public Course (){

    this.name = "not defined";
    this.numberOfClasses = 0;
    this.codeName = "not defined";
    }
    
    public Course(String name,int numberOfClasses,String codeName ){
    
    this.name = name;
    this.numberOfClasses = numberOfClasses;
    this.codeName = codeName;
    
    }
    

    public void setName (String customName) {
       this.name = customName;
   }    
 
    public String getName (){
    return this.name;
    }

    public void setNumberOfClasses (int customNumberOfClasses){
         this.numberOfClasses = customNumberOfClasses; 
   }

    public int getNumberOfClasses(){
        return this.numberOfClasses;
        
    }
    public void setCodeName (String customCodeName) {
       this.codeName = customCodeName;
   }    
 
    public String getCodeName (){
    return this.codeName;
    }
    
    
    
    
    
    

}

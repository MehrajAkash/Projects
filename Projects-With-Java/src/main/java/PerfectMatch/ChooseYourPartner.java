
package PerfectMatch;

import java.util.Scanner;
class person {
 
    public int age;
    public String name;
    public int height;
    public double weight;
 
    // Student class constructor
    person(String name,int age,int height,double weight)
    {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
 
  
    public void datastore()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
    }
    
 
}

public class ChooseYourPartner {
    public static void main(String args[])
    {
        // Declaring an array of student
        person[] obj;
      
        obj = new person[2];
       
        obj[0] = new person("Abul",20,60,71.5);
     
        obj[1] = new person("Khaled",25,58,65.3);
 
       
        System.out.println("****Person 01 data*********");
         obj[0].datastore();
         System.out.println("");
 
         System.out.println("****Person 02 data*********");
         obj[1].datastore();
         System.out.println("");
         
          
         System.out.println("Enter you Desiring Age & height: ");
           Scanner myObj = new Scanner(System.in);
            int age = myObj.nextInt(); 
            int height=myObj.nextInt();
            
            System.out.println("--------Your Desired Persons are-----");
            
         for (int i = 0; i < 2; i++) {
             if(obj[i].age==age && height==obj[i].height){
                System.out.println("********Person "+i+"*******");
                obj[i].datastore();
             }
        }
            
           
            
         
     /*     System.out.println("Person 02 data*********");
         obj[1].display();
         System.out.println("");
         
          System.out.println("Person 02 data*********");
         obj[1].display();
         System.out.println("");
         */
    }
}


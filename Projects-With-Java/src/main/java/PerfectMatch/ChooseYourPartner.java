
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

    public void pdatastore()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
    } 
}

class female {
    public int age;
    public String name;
    public int height;
    public double weight;
    // Student class constructor
    female(String name,int age,int height,double weight)
    {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void pdatastore()
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
        System.out.println("1. Male"); 
        System.out.println("2. Female");  
        System.out.print("Enter your Gender: ");
        Scanner f = new Scanner(System.in);
        int gender = f.nextInt();
        
        int n=3;
        if(gender==2){
             person[] obj;
            obj = new person[3];

            obj[0] = new person("Abul",20,60,71.5);
            obj[1] = new person("Khaled",25,58,65.3);
            obj[2] = new person("Rahim",27,59,60.3);

            System.out.println("****Person 01 data*********");
             obj[0].pdatastore();
             System.out.println("");

             System.out.println("****Person 02 data*********");
             obj[1].pdatastore();
             System.out.println("");
             
             System.out.println("****Person 02 data*********");
             obj[2].pdatastore();
             System.out.println("");

            System.out.println("Enter you Desiring Age & height: ");
            Scanner myObj = new Scanner(System.in);
             int age = myObj.nextInt(); 
             int height=myObj.nextInt();

             System.out.println("--------Your Desired Men are-----");
             for (int i = 0; i < 3; i++) {
                 if((age>=obj[i].age && age<=obj[i].age+2) && (height>=obj[i].height && height<=obj[i].height+2)){
                    System.out.println("********Person "+i+"*******");
                    obj[i].pdatastore();
                 }
            }
        }
        
        else{
            
                   female[] obj;
            obj = new female[3];

            obj[0] = new female("Sadia",20,60,71.5);
            obj[1] = new female("Fariya",25,55,65.3);
            obj[2] = new female("Rukaiya",26,55,59.5);
            
            System.out.println("****Person 01 data*********");
             obj[0].pdatastore();
             System.out.println("");

             System.out.println("****Person 02 data*********");
             obj[1].pdatastore();
             System.out.println("");
             
             System.out.println("****Person 02 data*********");
             obj[2].pdatastore();
             System.out.println("");

            System.out.print("Enter you Desiring Age & height: ");
            Scanner myObj = new Scanner(System.in);
             int age = myObj.nextInt(); 
             int height=myObj.nextInt();

             System.out.println("--------Your Desired Girls are-----");
             for (int i = 0; i < 3; i++) {
                 if((age>=obj[i].age && age<=(obj[i].age+2)) && (height>=obj[i].height && height<=(obj[i].height+2))){
                    System.out.println("********Female "+i+"*******");
                    obj[i].pdatastore();
                 }
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


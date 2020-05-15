package ½m²ß;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
        student.x= 10;
        
        student x1 =new student();   
        student x2 =new student();   

        x1.height =1.73f;        
        x1.weight =56.0f;     
        
        x2.height =1.83f;        
        x2.weight =78.5f; 
               
		System.out.println(x1.BMI()+"\n"+x2.BMI());
    
        x1.print1();
        
        student.print2();
        
        //---------------------------------------------------------------------------------- 

        Monster.NUM_POKEMON=365;
        
        Monster dragon = new Monster();  
        
        Monster pika   = new Monster();  
        
        dragon.HP=100;
        dragon.DAMAGE=50;
        dragon.ID=1;
  
        pika.HP=100;
        pika.DAMAGE=50;
        pika.ID=2;
        
		dragon.all();
		pika.all();
		
        //---------------------------------------------------------------------------------- 
                     
	}
	   
         
 
 }



package method方法.class類別與建構子.圓形版本;

import java.util.Scanner;

public class Circle {

	public double radius;
	
	public double perimeter;
	
	public double area;
	
	public Circle() {
		
		input();
	}
			
	private void input() {
		
		Scanner input = new Scanner(System.in);	
		
		System.out.print("請輸入半徑:");
		
		radius = input.nextDouble();
		
		 if(radius<=0) {
			
			System.out.println("請重新輸入!!");	
									
			input();			
			
		}
		 
	    input.close();

	}			
	
	public void calculatearea() {
            
		area = Math.pow(radius, 2)*Math.PI;
					
		System.out.printf("圓面積:%.2f%n",area);
		
	}
	
	public void calculateperimeter() {
					
		perimeter = 2*Math.PI*radius;		
		
		System.out.printf("圓周長: %.2f%n",perimeter);

	}
	
}

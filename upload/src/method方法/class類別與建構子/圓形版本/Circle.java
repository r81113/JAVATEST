package method��k.class���O�P�غc�l.��Ϊ���;

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
		
		System.out.print("�п�J�b�|:");
		
		radius = input.nextDouble();
		
		 if(radius<=0) {
			
			System.out.println("�Э��s��J!!");	
									
			input();			
			
		}
		 
	    input.close();

	}			
	
	public void calculatearea() {
            
		area = Math.pow(radius, 2)*Math.PI;
					
		System.out.printf("�ꭱ�n:%.2f%n",area);
		
	}
	
	public void calculateperimeter() {
					
		perimeter = 2*Math.PI*radius;		
		
		System.out.printf("��P��: %.2f%n",perimeter);

	}
	
}

package ½m²ß;

public class Hey 
{
	public static void main(String[] args) 
	{
	  
	   long mynum1 = 10;
	   float mynum2 = 100.5f;
	   String mynum3 = "545";
		// TODO Auto-generated method stub
	   Number num1 = new Number(mynum1); 
	   Number num2 = new Number(mynum2); 
	   Number num3 = new Number(mynum3); 


	   num1.setlong(mynum1);
	   
	   num2.setfloat(mynum2);
	   
	   num3.setString(mynum3);
	   
	   num1.print();
	   num2.print(); 
	   num3.print();
	}
}

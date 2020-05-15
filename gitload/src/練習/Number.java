package ½m²ß;

public class Number 
{
	private long number;
	
    public Number(long num) 
	{
		  number=num;
	}
    
    public Number(float num) 
	{
		  number=(long)num;
	} 
    
    public Number(String num) 
	{
		  number=Long.valueOf(num);
	}
 //----------------------------------------------------   
    public void setlong(long num) 
    {
    	  number = num;
    } 

    public void setfloat(float num) 
    {
    	  number =(long)num;
    } 
   
    public void setString(String num) {
    	
    	  number = Long.valueOf(num) ;
    }
    
//------------------------------------------------------    
    public void print() 
    {
    	
    	System.out.println("from Num="+number);
    	
    }
    
}

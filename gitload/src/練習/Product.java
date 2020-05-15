package ½m²ß;

public class Product
{
  public int originalprice;
  private float discount;
  public String name;
  
  public Product() 
  {
	    name = "???";
	    originalprice = 0;
	    discount = 10;	
  }
  
  public float getprice() 
  {
	  
	  return originalprice*(discount/10.0f);
  }
  
  public void setdiscount(float inputdiscount) 
  {
	  if(inputdiscount>=0 && inputdiscount < 10) 
	  {
		  
		  discount = inputdiscount;
		  
	  }
	  else
	  {
		  
	      System.out.println("invaild discount");  

	  }
	  
  }
  
  
  public void print() 
  {
	  System.out.println("name:"+name+"\t"+"price:"+originalprice+"\t"+"dicount:"+discount+"§é"+"\t"+"realprice:"+getprice());
	 
  }
}

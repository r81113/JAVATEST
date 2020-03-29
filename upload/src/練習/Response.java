package ½m²ß;

public class Response {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Product a = new Product();
       Product b = new Product();
       
       Product c = new Product();

       a.originalprice=100;
       a.name="car";
       a.setdiscount(8.6f);
   
     
       b.originalprice=100;
       b.name="bottle";
       b.setdiscount(7.5f);
       

       if(a.getprice()>b.getprice()) 
       {
    		  System.out.println("B is cheaper");  

       }
       else
       {
 		      System.out.println("A is cheaper");  

       }
       

    
       a.print();
       b.print();
       c.print();
       
	}

}

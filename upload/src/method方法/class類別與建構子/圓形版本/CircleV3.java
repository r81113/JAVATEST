package method��k.class���O�P�غc�l.��Ϊ���;

public class CircleV3 {
	
    private double radius;
	
    private double perimeter;
	
    private double area;
	           	
	public void setradius(double radius) {
    	
        if(radius<=0) {
			
			radius=1;
	
		}
		
		else {
			
			//�Ѥl
			this.radius = radius;
		}
               
    }
	
//   public double getradius() {
//    	
//    	return radius;
//    	
//    }
	
//	public CircleV3() {}    
	    
    public CircleV3(double radius) {
	    	
		this.setradius(radius);
			
	}
	        
	public double getPerimeter() {
		
		perimeter = 2*Math.PI*radius;		
			
		return perimeter;
		
	}

	public double getArea() {
		
		area = Math.pow(radius, 2)*Math.PI;
		
		return area;
		
	}

    public void show() {
    	
    	System.out.printf("�ꭱ�n:%.2f%n",this.getArea());
    	  
       	System.out.printf("��P��: %.2f%n",this.getPerimeter());
       	
    	System.out.println("--------------------");
    	
    }
    
    
    
}

package method方法;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Triangle_angle extends JFrame {
    
	private Triangle_angle me =this;
	static int x1=180,y1=155,x2=222,y2=200,x3=111,y3=100;
	static int radius=10;
	
	
    public Triangle_angle() {
        
    	super("三角形繪製");
    
    	
    	
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	getContentPane().addMouseListener(new MouseAdapter(){
    		
    		public void mouseClicked(MouseEvent e) {
    			
    			super.mouseClicked(e);
    			
    		}
    		   		
    	});
    	
    
    	
    	getContentPane().addMouseMotionListener(new MouseAdapter(){
    		
    		 public void mouseDragged(MouseEvent e) {
    			 
    			 super.mouseDragged(e);
    			
    			 double dis1 = getDistance(x1, y1, e.getX(), e.getY());
    			 
    			 double dis2 = getDistance(x2, y2, e.getX(), e.getY());

    			 double dis3 = getDistance(x3, y3, e.getX(), e.getY());

    			 if(dis1 <= radius) {
    				 
    				 x1= e.getX();
    				 y1= e.getY();
    				 repaint();
    			 }
    			 
                 if(dis2 <= radius) {
    				 
    				 x2= e.getX();
    				 y2= e.getY();
    				 repaint();
    			 }
    			 
                 if(dis3 <= radius) {
    				 
    				 x3= e.getX();
    				 y3= e.getY();
    				 repaint();
    			 }
                 
               
    		 }

    		
	

			private double getDistance(int x1, int y1, int x, int y) {
				// TODO Auto-generated method stub
				return Math.sqrt(Math.pow(x1-x, 2+Math.pow(y1-y, 2)));
			}
		
			
    	});
    	
    	   	
	    
    }	
    
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Triangle_angle a=new Triangle_angle();
    	
    
	
	}
}

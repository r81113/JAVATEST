package  array;

public class Poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   final int num=52;
		   int [] card = new int[num];
		    
		    
	        for(int i=0 ; i<card.length;i++){
	        	
                 card[i]=i;
                 
             	 System.out.print(card[i]);
             	 
	        	 if((i+1)%13==0){
	        		 
	     	        System.out.println(); 
	     	        
	        	 }
	        	 else {
	        		 
	        		System.out.print("\t"); 
	        		 
	        	 }
	        	 

	        } 
	        
	        String[] cardColors = {"黑桃","紅心","方塊","梅花"};
	        
	        String[] cardValue={
	        	
	        	"A","2","3","4","5","6","7","8","9","10","J","Q","K"
	        	
	        };
	        
	        System.out.println("洗牌前:"); 
	        
	        for(int i=0 ; i<card.length;i++){
	        	
	        	 System.out.print(cardColors[card[i] / 13]+"-"+cardValue [card[i] % 13]);

	        	 
	        	 if((i+1)%13==0){
	        		 
	     	        System.out.println(); 
	     	        
	        	 }
	        	 else {
	        		 
	        		System.out.print("\t"); 
	        		 
	        	 }
	        	 
		    } 
	        
	        
	        for(int i=0 ; i<card.length;i++){
	        	
              int Index=(int)(Math.random() * num);
              
              int temp=card[i];
              
              card[i]=card[Index];
              
              card[Index]=temp;
	        } 
	     
	        
	        
	        System.out.println("洗牌後:"); 
	        
	        for(int i=0 ; i<card.length;i++){
	        	
	        	 System.out.print(cardColors[card[i] / 13]+"-"+cardValue [card[i] % 13]);
	        	 
	        	 if((i+1)%13==0){
	        		 
	     	        System.out.println(); 
	     	        
	        	 }
	        	 else {
	        		 
	        		System.out.print("\t"); 
	        		 
	        	 }
	        	 
		    } 
		        
	        
		    
	}

}

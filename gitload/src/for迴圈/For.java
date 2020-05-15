package for迴圈;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		int result=0;
		
		while(true) {
			
			System.out.print("請輸入個人貢獻:");	
			int devotion = input.nextInt();
			
			if(devotion<0) {
				System.out.println("當前貢獻度負數,退出系統!");
		        break;
			}
		
		
			   	result+=devotion;
			     
		}
		   System.out.println("目前個人貢獻:"+result);	
		
		
		
		
		
		
		
		
		
		
//		int count =0;
//		long starttime =System.currentTimeMillis();
//		while(true) {
//			if(count++ == Integer.MAX_VALUE) {
//				break;
//			}
//			
//			
//		}
//		long endtime =System.currentTimeMillis();	
//		System.out.println("已結束"+count);
//		System.out.println("循環時間"+(endtime-starttime));
//	

//		int result=0;
//		for(int i=0;i<=10;i++) {
//			
//			for(int j =0;j<=10;j++) {
//				
//			  result=i*j;
//	  
//			  System.out.print(i+"*"+j+"="+result+","+"\t");
//			
//			  
//			  if(j==10){
//		    	  
//		    	   System.out.print("\n");
//		    	   break;
//		      }
//			  
//		    
//			}
//			  
//		}		
		

		
		
		
//		Scanner input = new Scanner(System.in);
//        int dayofmonth =0;
//        do {
//        	System.out.print("請輸入年份:");
// 	        int year =input.nextInt();
// 	        
//        	System.out.print("請輸入月份:");
//     		dayofmonth=input.nextInt();
//     		     	    
//     		 while(1>=dayofmonth || dayofmonth>12) {
//    	    	 
//    	    	 System.out.print("請重輸入月份:");
//    	 		 dayofmonth=input.nextInt();
//    	 	     
//    	     } 
//   
//       
//	        switch(dayofmonth)	{
//	
//	          case  1:
//	          case  3:
//	          case  5:
//	          case  7:
//	          case  8:
//	          case 10:
//	          case 12:	   
//	        	  
//	          System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
//	          System.out.print("\t");	  
//		      for(int i = 1;i<= 31;i++) {
//			
//		       System.out.print(i);
//		
//		      if((i+1)%7==0) {
//			 
//			    System.out.print("\n");
//		      }	
//		      else {
//			 
//		        System.out.print("\t");
//		 
//		      }
//		 
//		      }
//		          break;  
//	          case 4:                 
//              case 6:                       
//              case 9:                    
//              case 11:
//              System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
//              System.out.print("\t");
//              for(int i = 1;i<= 30;i++) {
//   			
//		       System.out.print(i);
//		
//		      if((i+1)%7==0) {
//			 
//			    System.out.print("\n");
//		      }	
//		      else {
//			 
//		        System.out.print("\t");
//		 
//		      }
//		 
//		     }  
//    	        break; 
//    	        
//             case 2:  
//           	 System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
//         	 System.out.print("\t");
//      	     if(year%4!=0 || year%100==0 && year%400!=0){   
//    	      
//      	     for(int i = 1;i<= 28;i++) {
//      			
//		       System.out.print(i);
//		
//		      if((i+1)%7==0) {
//			 
//			    System.out.print("\n");
//		      }	
//		      else {
//			 
//		        System.out.print("\t");
//		 
//		      }
//		 
//		    }
//         }
//      	     
//      	    else {
//      		for(int i = 1;i<= 29;i++) {
//      			
// 		       System.out.print(i);
// 		
// 		      if((i+1)%7==0) {
// 			 
// 			    System.out.print("\n");
// 		      }	
// 		      else {
// 			 
// 		        System.out.print("\t");
// 		 
// 		      }
// 		 
// 		    }
//      	 }
//           break;             
//	    }
//	        
//	      
//	        
//	             
//	         
//	  }while(1>dayofmonth || dayofmonth>12);
//       
//	   
//   }		
//		
		
		
		
		
		
		
//        Scanner input = new Scanner(System.in);
//        
//        while(true) {    
// 	    System.out.print("請輸入數字:");
//
//        int range=input.nextInt();
//        
//		int result =0;
//		
//	
//		
//		
//		for(int i=1 ;i<=range;i++) {
//			
//		  	        		   		  	           
//           System.out.print("第"+i+"位玩家攻擊力:"); 
//        	   
//          
//		   int player=input.nextInt();
//          
//           
//           result+=player; 
//           
//           
//     
//       
//
//                  
//        }  
//		       System.out.println("總共"+range+"位平均:"+result/range);  
//	  }
//		
	}
}
	
	



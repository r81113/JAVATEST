package method方法;

import java.util.Scanner;

public class Calendar_advanced {
    
	public static int year =-1;
	
	public static int month=-1;
		
	public static int[] daymonth= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	    
		totalcalendar();
	}
	
	//輸入年月份
	static void inputself() {
				 
		Scanner input = new Scanner(System.in);
		
        System.out.print("請輸入西元年:");
        
        year=input.nextInt();
        
        System.out.print("請輸入月份:");
                
        month=input.nextInt();        

        input.close();
        
        input=null;
		 				
	}
	
	//判斷閏年
	private static boolean isLeapYear(int year) {
			
		return year%4==0 && year%100!=0 || year%400==0;
			
	}
	
	
	//判斷是否輸錯和閏年
	private static int getsumdayofyear() {
		
		if(year == Integer.MIN_VALUE) {
			
	        System.out.print("年份錯誤請重新輸入年月份");

	        inputself();
		}
		
		int sum=0;
		
		for(int i = 2018 ; i < year;i++) {
			
		     sum+= 365;
		     
		     if(isLeapYear(i)) {
		    	 
		    	 sum++;
		     }
		}
		
		return sum;
	}
	
	//月份總天數
	private static int getsumdayofmonth() {
		
		int sum=0;
				
		for(int i = 0; i < month-1 ; i++) {
			
			sum+=daymonth[i];
			
		}
		
		if(isLeapYear(year) && month>=3) {
				
			sum++;	
		}
		
		return sum;
	}
	
	
	//判斷輸出星期月份
	private static void Content(int week) {

		int tcount = week - 1;
		
		if(week == 0) {
			
			tcount = 6;
			
		}
		
		else {
			
			tcount = week - 1;
			
		}
		
		for(int i = 0;i < tcount; i++) {
			
			System.out.print("\t");
			
		}
		
        for(int i = 0;i < daymonth[month - 1]; i++) {
			
			System.out.print(i+1);
			
			if((week + i) % 7 == 0) {
				
				System.out.println();
				
			}
			
			else {
				
				System.out.print("\t");
				
			}
			
		}
		
	}
				
	//輸出月份星期
	private static void title() {
		
		String[] monthname = {
				"一月","二月","三月","四月","五月"
				
				,"六月","七月","八月","九月","十月","十一月","十二月"
		};
		
		System.out.println(year+"\t"+monthname[month-1]);
		
		System.out.println("----------------------------");
		
		String[] week= {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		
		for(int i = 0; i < week.length;i++ ) {
			
			System.out.print(week[i]+"\t");

			
		}
		
		System.out.println();
		
	}
	
	
	
	public static void totalcalendar() {
		// TODO Auto-generated method stub	
		 inputself();	
		 		 
		 if(year%4!=0 || year%100==0 && year%400!=0) {
			 
			  System.out.println("平年");
			 
		 }
         
		 else if(year%4==0 && year%100!=0 || year%400==0) {
			 
			  System.out.println("閏年");
		 } 
		 	 		
		 
		 int sum = getsumdayofyear();
		 
		 sum +=getsumdayofmonth();
		 
		 sum++;
		 
		 System.out.println(sum % 7);
		 
		 title();
		 
		 Content(sum%7);
		
		 		 
	}
	
	
	

}

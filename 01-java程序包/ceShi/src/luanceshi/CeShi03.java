/**
 * 
 */
package luanceshi;

import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class CeShi03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in); 
			System.out.println("欢迎使用万年历");	 
			System.out.println("请输入年份");	   
				int year = sc.nextInt();//年
			System.out.println("请输入月份");
				int month = sc.nextInt();	//月
				int sum = 0;	//总天数
		for (int i = 1900;i < year; i++) {//1900+到year	
			if(i%4 == 0 && i%100 != 0 || i%400 == 0){//判断是否为闰年
				sum += 366;	//闰年	
			} else {		
				sum += 365;	//平年
			}
	
		}	 
	    for(int j = 1;j < month; j++){//自加到输入月份
	    	switch(j){//月份判断	
	    		case 2:		//二月	 
  			if(year%4 == 0 && year%100 != 0 || year%400 == 0){
		  		sum += 29;//闰年二月	
  			} else {				  
	 	        sum += 28;//平年二月
  			}		
  				break;	
				case 4:	
				case 6:	
			    case 9:	
				case 11:	
				    sum += 30;//小月30天	
				    break;	
				default://如果不是小月则执行大月	
					sum += 31;//大月31天		
					break;	
				}	
		    
	    	}
	    	int t = 0;	  
		 	switch(month){	//判断自己输入的月份是第几个月 
		 		case 2:	
		 	if (year%4 == 0 && year%100 != 0 || year%400 == 0) {//闰年判断
				t += 29;	//闰年二月
		  	} else {		
	  			t += 28;	//平年二月
			}	    
			  break;	
			  case 4:	 
			  case 6:	
			  case 9:	
			  case 11:		
				  t += 30;//汇总小月		
				  break;	
			  default://如果不是则执行如下：		
				  t += 31;//汇总大月
				  break;	 
			 }	 	   
		 	int kg = (sum%7)%7;//空格的数量kg。总天数%一个星期7天在%7天
			System.out.println("一\t二\t三\t四\t五\t六\t日");//表头										 
		for (int i = 1;i <= kg; i++) {//空格
			System.out.print("\t");	 //打印制表符日历格式基本成型 
			}	   
		for (int j = 1;j <= t; j++) {//输出日期
			System.out.print(j+"\t");//打印每次日期并使用制表符		 
			if ((kg+j)%7 == 0) {//如果空格数量加天数模7恒等于0就换行			 
			System.out.println();//换行		  
			}	   
		
		}	      

	}

}

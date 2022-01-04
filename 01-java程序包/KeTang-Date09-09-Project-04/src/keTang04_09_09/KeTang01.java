/**
 * 
 */
package keTang04_09_09;

/**
 * @author EDZ
 *
 */	
import java.util.Scanner;
public class KeTang01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根		
		Scanner sc = new Scanner(System.in);
		/* 1.输入一个整数，
		 * 	如果输入的整数大于等于1000，
		 * 	那么输出“输入的数>=1000”,
		 * 	否则的话就输出“输入的数<1000”。
         *	（使用if-else、扫描器Scanner接收数据）
		 */
			System.out.print("请输入一个整数");
		int chengJi0 = sc.nextInt();
		if (chengJi0 >= 1000) {
		    System.out.println("输出的数>=1000");	
		    }
		else{
		    System.out.println("输出的数<1000");	
		    }
		/* 2. 输入任意一个3位数的整数（注意不是3个数字），然后反序输出.
		 * 	例如输入357，那么输出753
		 */	
		 	System.out.println("输入任意一个3位数的整数");
		int zhengShu0 = sc.nextInt();
		if (zhengShu0 <1000) {
			System.out.println("改之前" +zhengShu0);
			  int A = zhengShu0/100;
		      int B = zhengShu0/10%10;
		      int C = zhengShu0%10;
		    System.out.println("改之后"+C+B+A);		     			
		}
		/*3. 输入两个小数，计算他们的和，如果和大于100，就输出这两个数整数部分的和，
		 * 	 如果和小于等于100，就输出这两个数小数部分的和
		 *	(提示: 
   		 *		得到整数部分： 如：int a=(int)10.5;      -- 结果值为10
   		 *		得到小数部分： 如：double b=10.5%1       -- 结果值为0.5
   		 */
		 	System.out.println("请输入两个小数");
		double xiaoShu0 =sc.nextDouble();
		double xiaoShu1 =sc.nextDouble();
		if (((int) (xiaoShu0+xiaoShu1))>=100 ) {
		       int A1 = (int) (xiaoShu0+xiaoShu1);		
		    System.out.println("得到整数部分：" +A1);		 	
		}else {
	    double B1 = (xiaoShu0+xiaoShu1)%1; 
			System.out.println("得到小数部分：" +B1);
		}
		/*4. 情景模拟: 一个女生问男生, 你Java成绩怎么样, 
		 * 		如果男生回答的分数在80以上,
		 * 	  女生就说"你教教我吧!"
		 * 		如果回答的分数在80分以下, 女生就说"你好好自习!"
		 */
		    System.out.println(" 你Java成绩怎么样，考了多少分：");
		int chengJi1 = sc.nextInt();
		if (chengJi1>80) {
			System.out.println("你教教我吧!");	 
		}else {
			System.out.println("你好好自习!");
		}
		/*5. 输入一个int型的数据，
		 * 		判断这个数是否能被2整除，
		 * 		如果能被2整除，
		 *		那么输出“这个数是偶数”，
		 * 		否则输出“这个数是奇数”。	
		 */
	
		 	System.out.println("请输入一个整数");
		int Q = sc.nextInt();		
	        
		boolean L;
	    if (Q%2==0) {
	    	System.out.println("这个数是偶数");
	      }else 
	      {
	    	System.out.println("这个数是奇数");}  
	      
		
		/*6. 输入两个整数，然后输出二者的最大值。
		 */ 
	    int max;
			System.out.println("请输入两个整数");
			System.out.println("请输入第一个数");
		int zhengShu1 = sc.nextInt();
		    System.out.println("请输入第二个数");
		int zhengShu2 = sc.nextInt();
		if (zhengShu1>zhengShu2) {
		    max = zhengShu1;
		
		}else
			max = zhengShu2;
		    System.out.println("您输入的两个数最大值为："+max);
		/*7.输入年龄和性别，
		 * 	如果年龄大于等于7
		 * 	或者年龄大于等于5并且性别是男，
		 * 	则输出能搬动桌子，否则输出不能搬动桌子。		 
		 */     
		    System.out.println("请输入年龄：");
		int nianLin = sc.nextInt();
			System.out.println("请输入性别：");
		String xingBie = sc.next();
		if ( nianLin >= 7 || nianLin>=5 & xingBie.equals("男")){
	    	System.out.println("能搬动桌子");
	    }else
	    	System.out.println("不能搬动桌子");
		
		    
	  }

}

/**
 * 
 */
package keTang04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
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

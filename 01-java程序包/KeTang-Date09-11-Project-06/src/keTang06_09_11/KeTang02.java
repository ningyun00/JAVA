/**
 * 
 */
package keTang06_09_11;
import java.util.Scanner;//导包
/**
 * @author EDZ
 *
 */
public class KeTang02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//系统录入
		// TODO 自动生成的方法存根
		/*需求说明： 
		 * 单次消费满 50，加 2 元，换购百事可乐饮料 1 瓶
		 * 单次消费满 100，加 3 元，换购 500ml 可乐 1 瓶
		 * 单次消费满 100，加 10 元，换购 5 公斤面粉
		 * 单次消费满 200，加 10 元，换购苏泊尔炒菜锅 1 个单次
		 * 消费满 200，加 20 元，换购欧莱雅爽肤水 1 瓶
		 */
			System.out.println("请输入你的消费金额");
	int B = ning.nextInt();//金额
			System.out.println("是否参加本次活动");
			System.out.println("1.单次消费满 50，加 2 元，换购百事可乐饮料 1 瓶\n2.单次消费满 100，加 3 元，换购 500ml 可乐 1 瓶\n3.单次消费满 100，加 10 元，换购 5 公斤面粉\n4.单次消费满 200，加 10 元，换购苏泊尔炒菜锅 1 个\n5.单次 消费满 200，加 20 元，换购欧莱雅爽肤水 1 瓶\n0.不换购");			
			System.out.println("换购数字：");
	int A = ning.nextInt();
	switch (A) {
		case 1:
			System.out.print("加 2 元，换购百事可乐饮料 1 瓶");
			System.out.println(B=B+2);
				break;
		case 2:
			System.out.print("加 3 元，换购 500ml 可乐 1 瓶");
			System.out.println(B=B+3);
				break;
		case 3:
			System.out.print("加 10 元，换购 5 公斤面粉");
			System.out.println(B=B+10);
				break;
		case 4:	
				System.out.println("加 10 元，换购苏泊尔炒菜锅 1 个");
				System.out.println(B=B+10);
				break;
		case 5:	
			System.out.println("加 20 元，换购欧莱雅爽肤水 1 瓶");
			System.out.println(B=B+20);	
				break;
		case 0:
			System.out.println("不换购");
		default:
			System.out.println("请输入正确的数字：1/2/3/4/5/0");
	
			}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

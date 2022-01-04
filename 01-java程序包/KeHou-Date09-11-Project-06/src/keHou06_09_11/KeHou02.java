/**
 * 
 */
package keHou06_09_11;
import java.util.Scanner;//导包
/**
 * @author EDZ
 *
 */
public class KeHou02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//系统录入
		// TODO 自动生成的方法存根
		/*二、编程实现迷你计算器：
		 * 支持+、-、*、/，从控制台输入 2 个操作数，
		 * 输出运算结果
		 */
		int A,B,C,D;
				System.out.print("请输入第一个数字：");
		int E = ning.nextInt();
				System.out.print("请输入第二个数字：");
		int F = ning.nextInt();
			if(E>F) {
			A=E+F;
				System.out.println(A);
			B=E-F;
				System.out.println(B);
			C=E*F;
				System.out.println(C);
			D=E%F;	
				System.out.println(D);
			}else if(F>E) {
			A=E+F;
				System.out.println(A);
			B=F-E;
				System.out.println(B);
			C=E*F;
				System.out.println(C);
			D=F%E;	
				System.out.println(D);
			}else if(F==E) {
			A=E+F;
				System.out.println(A);
			B=F-E;
				System.out.println(B);
			C=E*F;
				System.out.println(C);
			D=F%E;	
				System.out.println(D);
				
			}
			
			}

}

/**
 * 
 */
package keHou03_09_08;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		System.out.println("������Сʱ");
			double A = sc.nextDouble();
			double C;
			C=A/24;
		System.out.println(((int)(C))+"��");	
		System.out.println((int)(((A/24)-((int)(C)))*24)+"Сʱ");
	}

}

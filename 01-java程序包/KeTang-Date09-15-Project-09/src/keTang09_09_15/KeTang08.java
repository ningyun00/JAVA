/**
 * 
 */
package keTang09_09_15;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*8. ����for����������¼����,����ֻ��3�λ���, ����Ϊzhangsan520*/
		Scanner ning = new Scanner(System.in);
				System.out.print("���������룺");
			String A = ning.next();
				for(int B=1;B<=4;B++) {
				if(A.equals("ningyun520")) {
					System.out.println("����ɹ�");
					break;
				}else {
				System.out.println("�������");
				System.out.print("����������");
				A = ning.next();
			 }
		
		 }
			
	}

}

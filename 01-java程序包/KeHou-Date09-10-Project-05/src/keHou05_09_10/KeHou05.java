/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*6.һ�����乫˾�涨��ÿ�����˷�Ϊ 20 Ԫ��
		 * ������乫����С�� 100 ����Ĳ����ۣ�
		 * ���ڵ��� 100 ���ﲢС�� 500����Ĵ� 9 �ۣ�
		 * ���ڵ��� 500 ����Ĵ� 8 �ۡ�
		 * ��Ҫ������һ�����������������
		 */
		System.out.println("�����빫����");
		 	double A = ning.nextInt();
		if(A==20) {
			System.out.println(A);
		}else if (A>=100 && A<500) {
			A=A*0.9;
			System.out.print(A);
		}else if(A>500){
			A=A*0.8;
			System.out.print(A);
		}
	
	}

}

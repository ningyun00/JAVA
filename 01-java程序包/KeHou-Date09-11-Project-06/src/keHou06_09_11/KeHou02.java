/**
 * 
 */
package keHou06_09_11;
import java.util.Scanner;//����
/**
 * @author EDZ
 *
 */
public class KeHou02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//ϵͳ¼��
		// TODO �Զ����ɵķ������
		/*�������ʵ�������������
		 * ֧��+��-��*��/���ӿ���̨���� 2 ����������
		 * ���������
		 */
		int A,B,C,D;
				System.out.print("�������һ�����֣�");
		int E = ning.nextInt();
				System.out.print("������ڶ������֣�");
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

/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*8.����ȥ���ң�
		 * ����� 3 �����£��ϰ�Ͳ����ң�
		 * ����� 3���� 5 ��������һ���ң�
		 * ����� 5 �����Ͼ��� 2 ���ң�
		 * ����Ҫ��������ӵ���������
		 * �������������˼����ң�
		 */	
		System.out.print("�����뼪�����������Ҹ���");
			int A = ning.nextInt();
		if(A<3) {
			System.out.print("�ϰ岻����"+"A");				
		}else if(A>=3&&A<=5) {				
			System.out.print(A=A+1);
		}else if(A>5) {				
			System.out.print(A=A+2);
		}

	}

}

/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*5.����һ���·�, 
		 * �����Ӧ�·ݵļ��ڣ�
		 * 3,4,5 Ϊ�� 
		 * 6,7,8 Ϊ�� 
		 * 9,10,11 Ϊ��
		 * 12,1,2 Ϊ��
		 */
			System.out.println("�������·�");
		int A = ning.nextInt();
		if (A==3||A==4||A==5) {
			System.out.println("����");
		}else if(A==6||A==7||A==8){
			System.out.println("�ļ�");
		}else if(A==9||A==10||A==11){
			System.out.println("�＾");
		}else if(A==12||A==1||A==2){
			System.out.println("����");
		}
		
	}

}

/**
 * 
 */
package keHou07_09_13;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int A = rd.nextInt(100)+0;
		// TODO �Զ����ɵķ������
		/*6. ������� 0-80 ������,
		 * ������������׶�:
		 * 1. 10 ����ǰ - ͯ��
		   2. 10-18 �� - ����
		   3. 19-29 �� - ����
		   4. 30-59 �� - ����
		   5. 60 ������ - ����
		  */
		
		if (A>=0&&A<10) {
			System.out.println("ͯ��");
		}
			else if(A>10&&A<=18) {
			System.out.println("����");
		}
			else if(A>=19&&A<=29) {
			System.out.println("����");
		}	
			else if(A>=30&&A<=59) {
			System.out.println("����");
		}
		else if(A>=60) {
			System.out.println("����");
			}
		
	}
}



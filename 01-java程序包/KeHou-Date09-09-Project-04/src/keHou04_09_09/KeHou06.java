/**
 * 
 */
package keHou04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*6. �����������������뵽I��J������ȥ��
		 *   ���I>=J�ͽ�I��J�е�ֵ���н�����
		 *   ����Ͳ�������
	     */		    
		System.out.println("��������������");
		System.out.println("��һ����");
			int I = sc.nextInt();
	  	System.out.println("�ڶ�����");
		    int J = sc.nextInt();
		    int K;		    
	    if(I>=J) {
	    	K = I;
		    I = J;
		    J = K;	
    	System.out.println("I="+I+"J="+J);		    	
	    }else {
    	System.out.println(I+"--"+J);	
	    }
	    
	}

}

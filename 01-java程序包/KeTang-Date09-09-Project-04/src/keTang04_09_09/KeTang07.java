/**
 * 
 */
package keTang04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*7.����������Ա�
		 * 	���������ڵ���7
		 * 	����������ڵ���5�����Ա����У�
		 * 	������ܰᶯ���ӣ�����������ܰᶯ���ӡ�		 
		 */     
		    System.out.println("���������䣺");
		int nianLin = sc.nextInt();
			System.out.println("�������Ա�");
		String xingBie = sc.next();
		if ( nianLin >= 7 || nianLin>=5 & xingBie.equals("��")){
	    	System.out.println("�ܰᶯ����");
	    }else
	    	System.out.println("���ܰᶯ����");
		
		    
	}

}

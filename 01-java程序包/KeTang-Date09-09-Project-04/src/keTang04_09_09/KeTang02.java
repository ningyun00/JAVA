/**
 * 
 */
package keTang04_09_09;

import java.util.Scanner;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/* 2. ��������һ��3λ����������ע�ⲻ��3�����֣���Ȼ�������.
		 * 	��������357����ô���753
		 */	
		 	System.out.println("��������һ��3λ��������");
		int zhengShu0 = sc.nextInt();
		if (zhengShu0 <1000) {
			System.out.println("��֮ǰ" +zhengShu0);
			  int A = zhengShu0/100;
		      int B = zhengShu0/10%10;
		      int C = zhengShu0%10;
		    System.out.println("��֮��"+C+B+A);		     			
		}
	}

}

/**
 * 
 */
package keTang08_09_14;

/**
 * @author EDZ
 *
 */
public class KeTang01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*1. ѭ����� 1900-2017 �����������Щ?
		 * (��ʾ: ��ѭ�����ǿ����� if �����жϵ�)
		 */
	int A=1900;
		while(A>=1900 && A<=2017) {
			if(A%4==0&&A%100!=0||A%400==0) {
				System.out.println(A);
			}A++;
		}
		
		
		
		
		
	}

}

/**
 * 
 */
package keTang09_09_15;

/**
 * @author EDZ
 *
 */
public class KeTang03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*3. ʹ��forѭ�������1��100֮��ļ��ܱ�3�������ܱ�4����������
		 * (�����ַ�ʽд���� ʹ��continue �� ��ʹ��continue)
		 */
		/*for(int A = 1;A <= 100;A++) {
			if(A%3 == 0 && A%4 == 0) {
				System.out.println(A);//����
			}
			
		}*/
		
		for(int B = 1;B <= 100;B++) {
			if(B%3 != 0 || B%4 != 0) {
				continue;
			}
			System.out.println(B);//��
		}
		
		
		
		
		
	}

}

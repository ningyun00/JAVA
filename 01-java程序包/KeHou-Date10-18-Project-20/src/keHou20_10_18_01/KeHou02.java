package keHou20_10_18_01;

import java.util.Scanner;

/**
 * ����
 * @author ��
 *
 */
public class KeHou02 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 2.�ڵ�һ��Ļ������棬�ټ�����Ҫ��
		 * ���֤ 16 �� 18 λ 
		 * �ֻ��� 11 λ 
		 */
		//ɨ����
		Scanner ning = new 	Scanner(System.in);
		
		//�����ʾ
		System.out.print("�����û�����");
		
			//�����ַ������Ҹĳɶ�������
			String userName = new String(ning.next());
			
		//�����ʾ	
		System.out.print("�������룺");	
		
			//�����ַ������Ҹĳɶ�������
			String passWord = new String(ning.next());
			
		//�����ʾ
		System.out.print("�ٴ��������룺");
		
			//�����ַ������Ҹĳɶ�������
			String passWord1 = new String(ning.next());
			
		//�жϳ���
		if (userName.length()>3||passWord.length()>6) {
			
			//�ж����������Ƿ���ͬ
			if (passWord.equals(passWord1)) {
				
				System.out.println("����ɹ�");
				
		//�ɹ�����ʾ������֤��		
		System.out.print("�������֤�ţ�");		
		
			//�����ַ���
			String sfz = new String(ning.next());
			
		//����ֻ���
		System.out.print("�����ֻ��ţ�");
		
			//�����ַ���
			String sjh = new String(ning.next());
			
				//�ж����֤�Ƿ���16��18
				if (sfz.length()>19||sfz.length()>15) {
					
					//�ж��ֻ����Ƿ���11λ
					if (sjh.length()==11) {
						
						System.out.println("������ȷ");
					} else {
						System.out.println("�ֻ����������");
					}
				} else {
					System.out.println("���֤�������");
				}
			} else {
				System.out.println("�������벻ͬ");
			}
		} else {
			System.out.println("�û��������볤�Ȳ���");
		}	
					
	}

}

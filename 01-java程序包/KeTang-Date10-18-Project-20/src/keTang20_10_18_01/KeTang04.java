package keTang20_10_18_01;

import java.util.Scanner;
/**
 * ����
 * @author ��
 *
 */
public class KeTang04 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		//ɨ����
		Scanner ning = new Scanner(System.in);
		/* 4. ����һ���ַ�������һ�����䣬�ж��������ĸ�ʽ�Ƿ���ȷ��
		 *(�жϸ��ַ������Ƿ����@���ź�.�ţ�@���±�Ҫ����0������С��.���±�)
		�����ʽ: 124408198@qq.com*/
		System.out.print("��������ţ�");
			String youXiang = new String(ning.next());
			int index1 = youXiang.indexOf("@");  
			int index2 = youXiang.indexOf(".");
			if (index1 > 0 && index1 < index2) {
				System.out.println("������ȷ");
			} else {
				System.out.println("�������");
			
		}
		
	}

}

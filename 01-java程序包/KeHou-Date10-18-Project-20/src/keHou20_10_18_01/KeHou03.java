package keHou20_10_18_01;

import java.util.Scanner;

/**
 * ����
 * @author ��
 *
 */
public class KeHou03 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		//3.����һ���ַ�����������Ҫ���ҵ��ַ����жϸ��ַ����ַ������� �Ĵ����� 
		Scanner ning = new Scanner(System.in);
		System.out.print("����һ���ַ�");
			String n1 = new String(ning.next());
		System.out.print("������Ҫ���ҵ��ַ���");
			String n2 = new String(ning.next());
		int sta = 0;
		for (int i = 0; i <= n1.length()-1; i++) {
			String n3 = n1.substring(i, i+1);
			if (n3.equals(n2)) {
				sta++;
			}
			
		}
		System.out.println(sta);
		
	}

}

package keHou20_10_18_01;

import java.util.Scanner;
/**
 * ����
 * @author ��
 *
 */
public class KeHou07 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		//7.�����ַ�������Ҫ���ҵ��ַ����ַ�������λ���г��ָ��ַ����ַ�����λ�á�
		//ɨ����
		Scanner ning = new Scanner(System.in);
		//�����ʾ
//		System.out.print("�����ַ�����");
//			String st1 =new String(ning.next());
//		System.out.print("������Ҫ���ҵ��֣�");
//			String st2 =new String(ning.next());
//		for (int i = 0; i < st1.length(); i++) {
//			String st3 = st1.substring(i, i+1);
//			if (st2.equals(st3)) {
//				System.out.print(i+" ");
//			}
//			
//		}
//		
//	}
//		System.out.print("�����ַ�����");
//			String st1 =new String(ning.next());
//		System.out.print("������Ҫ���ҵ��ַ�����");
//			String st2 =new String(ning.next());
//			String st3 = null;
//			String st4 = null;
//			int i;
//			int j;
//		for (i = 0; i < st1.length(); i++) {
//			 st3 = st1.substring(i, i+1);
//		
//			for (j = 0; j < st2.length(); j++) {
//				 st4 = st2.substring(j, j+1);
//				 if (st3.equals(st4)) {
//						System.out.print(i);
//				 }
//			 
//			}	
//		
//		}
			System.out.print("�����ַ�����");
			String st1 =new String(ning.next());
		System.out.print("������Ҫ���ҵ��ַ�����");
			String st2 =new String(ning.next());
			String st3 = null;
			String st4 = null;
			int j;
			int j2;
			if (st2.length()>1) {
				for (j2 = 0; j2 < st1.length(); j2++) {
					st3 = st1.substring(j2,j2+1);
					for (j = 0; j < st2.length(); j++) {
						st4 = st2.substring(j,j+1);
						if (st3.equals(st4)) {
							System.out.print(j2);
						}
						
				}
					
			}
				
		}
		
	
	}
}

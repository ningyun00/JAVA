package keTang13_09_22;

import java.util.Scanner;

public class KeTang01 {
	
	
	public static void main(String[] args) {
		
		Scanner ning = new Scanner(System.in);

		/*1. ����һ�� String ���͵����飬�ռ�Ϊ 5 ����
		 * ����ɨ�����洢���ѧ������������ʹ��ѭ
		�����������ѧ��������*/	
		
		String [] A = new String[5];//�����ַ������͵����ݿⳤ��Ϊ5
		for (int i = 0; i < A.length; i++) {
			System.out.print("�������"+(i+1)+"��ѧ��������:");
				A[i] = ning.next();
		}
			System.out.print("��ţ�\t\t������");
		for (int i = 0; i < A.length; i++) {
			System.out.print("\n"+(i+1)+"\t\t"+A[i]);
		}	
		
	}

}
package keTang13_09_22;

import java.util.Scanner;

public class KeTang03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//3. ����һ�� int ���͵����飬�洢 4 ��ѧ���ĳɼ��������� 4 ��ѧ�����ּܷ�ƽ��
		Scanner ning = new Scanner(System.in);
				int A [] = new int [4];
				int sum = 0;
			System.out.println("������4Ϊѧ���ĳɼ�");
		for (int i = 0; i < A.length; i++) {
			System.out.print("��"+(i+1)+"λѧ���ĳɼ�");
				A [i]= ning.nextInt();
				sum = sum+A[i];
		}
			System.out.println("ƽ����Ϊ"+sum/A.length);	
	}

}

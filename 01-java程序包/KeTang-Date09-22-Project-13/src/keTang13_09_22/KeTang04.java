package keTang13_09_22;

import java.util.Random;

public class KeTang04 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//4. ����һ�� int ���͵�����, 
		//ѭ��������� 6 �� 1 �� 13 ֮����������뵽��������ȥ����
		//ѭ�����
		Random ning = new Random();
			int A [] = new int [6];
		for (int i = 0; i < A.length; i++) {
			A[i] = ning.nextInt(13)+1;
			System.out.println(A[i]);
		}
		
	}

}

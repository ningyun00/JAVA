package keTang15_10_10;

import java.util.Random;//�����

public class KeTang02 {

	public static void main(String[] args) {
		/*2. ����һ����ά���� arr, int[3][4]��
		 * Ҫ��ѭ������ 12 �����������뵽�����У�
		 * Ȼ��ʹ��Ƕ��ѭ���ҵ���������е����ֵ����Сֵ, 
		 * ����ʾ : Max*/
		Random yun = new Random();//�½�һ������
		int arr [][] = new int [3][4];//�����ά���鳤�ȡ�3��*��4��;
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				arr [i][j] = yun.nextInt(100);//������Ĵ���
			}
			
		}
		int max = arr [0][0];//�������ֵ
		int min = arr [0][0];//������Сֵ
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print(arr[i][j]+"\t");//���¼�����
				if (max < arr [i][j]) {	//�ж����ֵ
					max = arr [i][j];//���ֵ��ֵ
				}
				if (min > arr [i][j]) {//�ж���Сֵ
					min = arr [i][j];//��Сֵ��ֵ
				}
				
			}
			System.out.println();//�������
		}
		System.out.println("���ֵΪ��"+max+"\n��СֵΪ��"+min);
	}//������

}

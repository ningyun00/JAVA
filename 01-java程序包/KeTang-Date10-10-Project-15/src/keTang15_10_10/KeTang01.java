package keTang15_10_10;

import java.util.Random;//�������

//import java.util.Scanner;//ɨ����

public class KeTang01 {

	public static void main(String[] args) {
		/*1. ����һ����ά���� arr, int[4][3]��
		 * Ҫ��ѭ������ 12 �����������뵽�����У�
		 * Ȼ��ʹ��Ƕ��ѭ���ҵ���������е�ȫ��ż����
		 * �����������ż���ĺ͡�*/
		Random ning = new Random();//�½��������
		//Scanner yun = new Scanner(System.in);//�½�ɨ����
		int arr [][] = new int [4][3];//�������鷶Χ��4��*��3����
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				 arr [i][j] = ning.nextInt(24)+1; //��������룬���������롣
				 //arr [i][j] = yun.nextint();
			}
			
		}
		int A = 0;//ż����
		System.out.println("�����Ϊ��");//�����ʾ
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print(arr[i][j]+"\t");//���ȫ����
				if (arr [i][j] %2 == 0) {//�ж�ż��
					A += arr[i][j];//�ۼӺ�
					System.out.print("ż��Ϊ��"+arr[i][j]);//ѭ���������
				}
				System.out.println();//ÿ���һ�л�һ��
			}
			
		}
		System.out.println("����ż����Ϊ��"+A);//ͳ�ƽ�����
	}

}

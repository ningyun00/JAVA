package keHou15_10_10;

import java.util.Scanner;//����

public class KeHou02 {

	public static void main(String[] args) {
		/*2. ����һ����ͼ��ʾ�Ķ�ά����:
		 * 11 12 13
		 * 22 23 24
		 * 33 34 35
		 * �� 23 ɾ����λ���û����������,����: 88 , �ٱ��������������
		 * 11 12 13
		 * 22 88 24
		 * 33 34 35*/
		Scanner ning = new Scanner(System.in);//�½�ɨ����
		int arr [][] = {{11,12,13},{22,23,24},{33,34,35}};//�����ά���鳤��
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print(arr[i][j]+"\t");//�������
			}
			System.out.println();//ÿ������껻һ��
		}
		System.out.println("�����������");//�����ʾ
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				if (i == 1 && j == 1) {//�ж��±�
					arr[i][j] = ning.nextInt();//¼�뵽������
					break;//����
				}
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr.length; j++) {//ѭ����
				System.out.print(arr[i][j]+" ");//�����ά����
			}
			System.out.println();//ÿ������껻һ��
		}
		
	}

}

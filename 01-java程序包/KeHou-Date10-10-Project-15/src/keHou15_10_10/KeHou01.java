package keHou15_10_10;

import java.util.Scanner;//����

public class KeHou01 {

	public static void main(String[] args) {
		/*1. ����һ����ά���飬ѭ������ 3 ��ѧ���� java,c#,sql,html ���Ź��εĳɼ���
		 * ��ά�����һ�м�¼һ���˵ĳɼ���
		 * Ҫ��ÿ��ͬѧ��ÿ�Ƴɼ������ʽ���£�
		 * ѧ�� java c# sql html �ܷ� ƽ����
		 * �� 1 λ 89 79 98 90 356 89
		 * �� 2 λ 99 80 100 98 377 94
		 * �� 3 λ 79 99 87 87 352 88*/
		Scanner ning = new Scanner(System.in);//�½�ɨ����
		int arr [][] = new int [3][4];//�����ά���鷶Χ
		//int brr [][] = {{89,79,98,90},{},{}};
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print("�����"+(i+1)+"��ͬѧ��"+(j+1)+"�ųɼ���");
				//�����ʾ���
				arr [i][j] = ning.nextInt();//¼������
			}
			
		}
		int sum = 0;//�ܷ�
		double avg = 0.0;//ƽ����
		System.out.println("ѧ��\tjava\tc#\tsql\thtml\t�ܷ�\tƽ����");
		//��������ʽ
		for (int i = 0; i < arr.length; i++) {//�����
			System.out.print("\n"+"��"+(i+1)+"Ϊ");//����ڼ���
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print("\t"+ arr [i][j]);//���¼������
					sum += arr [i][j];//�ܷ�ͳ��
			}
			System.out.print("\t"+sum);//����ܷ�
				avg = sum / arr[i].length;//ͳ��ƽ����
			System.out.print("\t"+avg);//���ƽ����
				sum = 0;//����������
			System.out.println();//ÿ�������һ�к���
		}
		
	}

}

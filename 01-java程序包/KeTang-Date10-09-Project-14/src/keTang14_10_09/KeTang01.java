package keTang14_10_09;

import java.util.Scanner;//����

public class KeTang01 {

	public static void main(String[] args) {
		/*1. ���ñ�Ƿ�ʵ�ֲ��ҹ���:
		 * �и� int ��������, ����Ԫ��Ϊ{5,8,1,4,3,2,9,7,6}, 
		 * ������Ҫ���ҵ�����,����ҵ��������������λ��,
		 * ����: arr[X], ���û�ҵ���ʾδ�ҵ�*/
		Scanner ning = new Scanner(System.in);//�½�����ʵ��������
			int A [] = new int [] {5,8,1,4,3,2,9,7,6};//�����������ͣ�����
				System.out.print("������Ҫ���ҵ����֣�");//��ʾ
					int B = ning.nextInt();//�������� 
					int i;
		for (i = 0; i < A.length; i++) {//ѭ������
			if (A [i] == B) {//�ж����������Ƿ���ͬ
					break;//�о�����ѭ������
			}
			
		}
		if (i < A.length) {//�±�С�����鳤����ζ�ҵõ�
			System.out.println("�������ҵ�����"+i+"λ��");	
		} else {//�������			
			System.out.println("δ�ҵ�����");
		
		}
		
	}

}

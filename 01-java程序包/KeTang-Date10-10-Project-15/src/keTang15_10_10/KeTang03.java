package keTang15_10_10;

import java.util.Scanner;//ɨ����

public class KeTang03 {

	public static void main(String[] args) {
		/*3. �ж�3��¥�ļ���, ÿ��¥��4������, 
		 * ÿ����������ס��1�������ķ��� , 
		 * ����Ҫ���� 12 ���������Ҹ���"����"���� , 
		 * ��������"����"�滻��"������" , 
		 * ������ʾ:���޴���. ���ô���ʵ�����ϵĹ���*/
		Scanner ning = new Scanner(System.in);//�½�ɨ����
		String arr [][] = new String [3][4];//�����ά���鳤��
		boolean B = true;//����ֵ���ж�
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print("�����"+(i+1)+"������"+(j+1)+"�������������");//�����ʾ
				arr [i][j] = ning.next(); //¼�봢��
			}
		}
		System.out.print("������Ҫ���ҵ��ˣ�");//�����ʾ
			String name1 = ning.next(); //¼�봢��
		System.out.print("������Ҫ�滻�ɵ����֣�");//�����ʾ
			String name = ning.next();//¼�봢��
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				if (name1.equals(arr [i][j])) {//�ж��������ԭ�����Ƿ���ͬ
					arr[i][j] = name;//�滻��ֵ
					B = false;//����true�򷵻�false;
				}
			}
		}
		if (B) {//false���ش������
			System.out.println("���޴���");
		}
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print(arr[i][j]+"\t");//��������ʽ
			}
			System.out.println();//ÿ���һ�л�һ��
		}		
		
	}

}

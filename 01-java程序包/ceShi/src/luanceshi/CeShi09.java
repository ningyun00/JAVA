package luanceshi;

import java.util.Scanner;

public class CeShi09 {

	public static void main(String[] args) {
		/*3. �ж�3��¥�ļ���, ÿ��¥��4������, 
		 * ÿ����������ס��1�������ķ��� , 
		 * ����Ҫ���� 12 ���������Ҹ���"����"���� , 
		 * ��������"����"�滻��"������" , 
		 * ������ʾ:���޴���. ���ô���ʵ�����ϵĹ���*/
		Scanner ning = new Scanner(System.in);//�½�ɨ����
		String arr [][] = new String [3][4];//�½���ά����
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print("�����"+(i+1)+"������"+(j+1)+"�������������");//�����ʾ
				arr [i][j] = ning.next();//¼������
			}
			
		}
		int C = 0;//i�±�
		int D = 0;//j�±�
		System.out.print("��������Ҫ���ҵ��ˣ�");//�����ʾ
		String A = ning.next();//¼������
//		System.out.println("������Ҫ�滻�����֣�");
//		String E = ning.next();
		if (A.equals("����")) {//�ж�������Ƿ�Ϊ"����"
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				if (arr[i][j].equals("����")) {//�ж��������Ƿ�Ϊ"����"
					System.out.println("���ҵ�����");//�����ʾ
					C = i;//���ҵ����i�±긳ֵ��C
					D = j;//���ҵ����j�±긳ֵ��D
					arr[C][D] = "������";//��arr[C][D]��ֵΪ"������"
					break;//�ҵ������
					}
				
				}
			
			}
			
		} else {//����Ĳ���"����"
			System.out.println("���޴���\n");//�����ʾ
		}
		for (int i = 0; i < arr.length; i++) {//ѭ����
			for (int j = 0; j < arr[i].length; j++) {//ѭ����
				System.out.print(arr[i][j]+"\t");//�������
			}
			System.out.println();//ÿ���һ�л�һ��
		}
	}

}

package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_21 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*21. ѧϰ�ɼ�>=90 �ֵ�ͬѧ�� A ��ʾ��60-89 ��֮���
		�� B ��ʾ��60 �����µ��� C ��ʾ*/
		Scanner ning = new Scanner(System.in);
		System.out.println("������ɼ�");
			int A = ning.nextInt();
		if (A >= 90) {
			System.out.println("A");
		} else if (A <= 89 && A >= 60){
			System.out.println("B");
		} else  {
			System.out.println("C");
		}
				
	}

}

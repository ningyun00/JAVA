package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_09 {

		public static void main(String[] args) {
			/*9. ѭ��������� 0 �����ֽ����۳ˣ�ֱ�����������Ϊ 0��
			�ͽ���ѭ�������������۳˵Ľ��*/
		Scanner ning = new Scanner(System.in);
			int A,B = 1;
		do {
			System.out.println("������һ����");
				A = ning.nextInt();
			if (A == 0) {
				A = 1;
				B = B*A;
			System.out.println(B);
			  break;
			}
			B = B*A;			 
		} while (!(A == 0)) ;
		
	}
		
}
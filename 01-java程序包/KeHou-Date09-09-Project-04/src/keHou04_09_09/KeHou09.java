package keHou04_09_09;

import java.util.Scanner;

public class KeHou09 {

	public static void main(String[] args) {
		/*9. ���������������,�ж����Ƿ��ܱ�11����3����,
		 * ����ܱ�11����3�������"��������Ҫ��",
		 * ���������Ϣ"����������Ҫ��"(a%11==0 || a%3==0)*/
		Scanner ning = new Scanner(System.in);
		System.out.print("����������Ҫ������");
			int num = ning.nextInt();
		if (num%11 == 0 || num%3 == 0) {
			System.out.println("�����Ҫ��");
		} else {
			System.out.println("������num%11 == 0 || num%3 == 0");
		}
	}

}

package keHou04_09_09;

import java.util.Scanner;

public class KeHou10 {

	public static void main(String[] args) {
		/*10. ����һ�����,�жϸ�����Ƿ�Ϊ����,�����
		 * �����"�����Ϊ����",�������"�����Ϊƽ��"
		����Ĺ���: �ܱ�4�������ǲ��ܱ�100���������ܱ�400����		
		(a%4==0 && a%100!=0 || a%400==0)*/
		Scanner ning = new Scanner(System.in);
		System.out.print("������ݣ�");
			int yer = ning.nextInt();
		if (yer%4==0 && yer%100!=0 || yer%400==0) {
			System.out.println("�����Ϊ����");
		} else {
			System.out.println("�����Ϊƽ��");
		}
		
	}

}

package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//11.
		Scanner ning = new Scanner(System.in);
			System.out.print("������Сʱ��");
				double A = ning.nextInt();
				double B= A/24;
			System.out.print((int)B+"��");
			System.out.print("��"+(int)(((A/24)-((int)(B)))*24)+"Сʱ");
	}

}

package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_46 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*46. С������һ˫Ь����ֵ 58 Ԫ������ 3 ���·���ÿ��
		30 Ԫ������ 5 ������ÿ���� 55.8 Ԫ��С�������� 500
		Ԫ���ʻ�Ҫ�һض���Ԫ���ó����*/
		Scanner ning = new Scanner(System.in);
			System.out.println("���������˼����·���");
				int E = ning.nextInt();
			System.out.println("���������˼�˫Ь��");
				int F = ning.nextInt();
			System.out.println("���������˶��ٰ���");
				int D = ning.nextInt();
			System.out.println("������֧���˶���Ǯ��");
				int A = ning.nextInt();
				int B = 58,G = 30;double C = 55.8;
				/*Ь*/ /*�·�*/
				int Z = E*G,Y = F*B;double X = D*C;
			System.out.println("Ӧ�һأ�"+(A-(Z+Y+X)));
	
	}

}

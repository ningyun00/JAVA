package dome09;//��

import java.util.Scanner;//����

public class Dome09 {//��

	public static void main(String[] args) {//������
		Scanner ning = new Scanner(System.in);//ʵ��������
		//forѭ���Ļ����������£�ѭ�����1~100
		for(int A = 1;A <= 100; A++) {
			System.out.println(A);	
		}
		//ѭ�����1~100֮���ż��
		for (int B = 1;B <= 100;B++) {
			if(B%2 != 0) {		
				continue;//contiune��ʹ��
			}System.out.println(B);
		}
		/*����for����������¼����,����ֻ��3�λ���, ����Ϊningyun520*/
		System.out.print("���������룺");
		String A = ning.next();
		for(int B=1;B<=4;B++) {
			if(A.equals("ningyun520")) {
				System.out.println("����ɹ�");
				break;//���������ѭ��
			} else {
			System.out.println("�������");
			System.out.print("����������");
				A = ning.next();
			}
			
		}

	}

}

package keTang18_10_14_05;
//����
import java.util.Scanner;
//��
public class Next05 {
	/**5.дһ���޲��޷���ֵ�ķ�����
	����ѯ���û�¼����������
	���ṩ��+��-��*��/�����û�ѡ��
	�����÷�������ӡ���*/
	//����
	int num1;
	int num2;
	int str;
	int sum;
	//����
	public void JiSuan() {
		Scanner ning = new Scanner(System.in);
		System.out.print("�����һ�����֣�");
			num1 = ning.nextInt();
		System.out.print("����ڶ������֣�");
			num2 = ning.nextInt();
		System.out.print("ѡ���������(+,-,*,/)");
			String str = ning.next();
		//�ж�
		switch (str) {
		case "+":
				sum =num1 + num2;
			break;
		case "-":
			sum = num1 - num2;
			break;
		case "*":
			sum = num1 *num2;
			break;
		case "/":
			sum = num1 / num2;
			break;
		default:
			System.out.println("�������");
			break;
		}
		System.out.println(sum);
	}
	
}

package keTang19_10_15_03;

import java.util.Scanner;
/**
 * ����
 * @author ��
 */
public class Mather03 {
	/**
	 * 1. ����һ����ѧ����Mather
	 * ��ѧ���������: ����, ����, �Ա�
	 */
	Scanner ning = new Scanner(System.in);//ʵ��������
	/**
	 * ����
	 * name ����
	 * age ����
	 * sex �Ա�
	 */
	
	String name = "��";
	int age = 18;
	String sex = "��";
	
	/**
	 * ��ѧ����ķ���:
	 */
	
//	1. ������������, �������ǵĽϴ�ֵ(�в��з�)
	public int a1;
	public int a2;
	public int Max(int a3) {
		System.out.println("�����1������");
		a1 = ning.nextInt();
		System.out.println("�����2������");
		a2 = ning.nextInt();
		if (a1 > a2) {
			a3 = a1;
		} else {
			a3 = a2;
		}
		return a3;
	}
	
//	2. ������������, �������ǵ���Сֵ(�в��з�)
	public int b1;
	public int b2;
	public int b3;
	public int Min(int b4) {
		System.out.print("�����һ����");
			b1 = ning.nextInt();
		System.out.print("����ڶ�����");
			b2 = ning.nextInt();
		System.out.print("�����������");
			b3 = ning.nextInt();
			if (b1<b2) {
				if (b1<b3) {
					b4 = b1;
				} else {
					b4 = b3;
				} 
			} else if (b2<b1) {
				if (b2<b3) {
					b4 = b2;
				} else {
					b4 = b3; 
				}
			} else if (b3<b1) {
				if (b3<b2) {
					b4 = b3;
				} else {
					b4 = b2;
				}
			}
		return b4;
	}
	
//	3. ����һ������n, ����1+2+3+4....+n��ֵ, �����ؽ��(�в��з�)
	public int n1;
	public int N(int n2) {
		for (int i = 1; i <= n1;i++) {
			n2+=i;		
		}
		return n2;
	}
	
//	4. ����һ������n, ���n����������true,���򷵻�false(�в��з�)

	public int IntN(int zhiShu) {
		boolean falg = true;
		for (int i = 2; i < zhiShu; i++) {
			if (zhiShu%i==0) {
				falg = false;
				break;
			}
			
		}
		if (falg) {
			System.out.println(falg);
		} else {
			System.out.println(falg);
		}
		return zhiShu;
	}
	
	
//	5. ����һ�������,һ�������,����ȡǮʱ���ܽ��(ÿ��1��,�������5%)(�в��з�)
	public double yers(double money) {
		System.out.print("������ݣ�");
			 double yer = ning.nextInt();
		System.out.print("�����");
			 money = ning.nextInt();
		for (int i = 1; i <= yer; i++) {
			money =money*(1+0.05);
		}
			System.out.println(money);	
		return money;
	}
//	6. ����һ������(����),���ػ�����Ǽ�Сʱ����
	public int xiaoShi;
	public int Time (int min) {
		xiaoShi = min/60;
			min = min-(xiaoShi*60);
		System.out.println(xiaoShi+"Сʱ"+min+"����");
		return min;
	}
	
//	7. ����һ������n, ����100�����ж��ٸ����ֿ�������n
	public int NumN(int num) {
		int sum = 1;
		for (int i = 1; i <= 100; i++) {
			if (i%num == 0) {
				sum++;
			}
			
		}System.out.println("����"+sum+"��");
		return sum;
	}
	
//	8. ����һ������n, ��֪��ˮ������100��,ÿ����n��ˮ, ���ؼ�������(�в��з�)
	public int A = 0;
	public int Whiter(int N) {
		int N1 = 0;
		while(N1<100) {
			N1=N1+N;
			A++;
		}
		System.out.println("��Ҫ"+A+"������");
		return A;
	}
	
}

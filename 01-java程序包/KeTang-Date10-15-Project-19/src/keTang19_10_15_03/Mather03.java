package keTang19_10_15_03;

import java.util.Scanner;
/**
 * 导包
 * @author 寜
 */
public class Mather03 {
	/**
	 * 1. 定义一个数学家类Mather
	 * 数学家类的属性: 姓名, 年龄, 性别
	 */
	Scanner ning = new Scanner(System.in);//实例化对象
	/**
	 * 属性
	 * name 姓名
	 * age 年龄
	 * sex 性别
	 */
	
	String name = "寜";
	int age = 18;
	String sex = "男";
	
	/**
	 * 数学家类的方法:
	 */
	
//	1. 传入两个整数, 返回他们的较大值(有参有返)
	public int a1;
	public int a2;
	public int Max(int a3) {
		System.out.println("输入第1个数：");
		a1 = ning.nextInt();
		System.out.println("输入第2个数：");
		a2 = ning.nextInt();
		if (a1 > a2) {
			a3 = a1;
		} else {
			a3 = a2;
		}
		return a3;
	}
	
//	2. 传入三个整数, 返回他们的最小值(有参有返)
	public int b1;
	public int b2;
	public int b3;
	public int Min(int b4) {
		System.out.print("输入第一个数");
			b1 = ning.nextInt();
		System.out.print("输入第二个数");
			b2 = ning.nextInt();
		System.out.print("输入第三个数");
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
	
//	3. 传入一个整数n, 计算1+2+3+4....+n的值, 并返回结果(有参有返)
	public int n1;
	public int N(int n2) {
		for (int i = 1; i <= n1;i++) {
			n2+=i;		
		}
		return n2;
	}
	
//	4. 传入一个整数n, 如果n是质数返回true,否则返回false(有参有返)

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
	
	
//	5. 传入一个金额数,一个年份数,返回取钱时的总金额(每存1年,金额增加5%)(有参有返)
	public double yers(double money) {
		System.out.print("输入年份：");
			 double yer = ning.nextInt();
		System.out.print("输入金额：");
			 money = ning.nextInt();
		for (int i = 1; i <= yer; i++) {
			money =money*(1+0.05);
		}
			System.out.println(money);	
		return money;
	}
//	6. 传入一个整数(分钟),返回换算后是几小时几分
	public int xiaoShi;
	public int Time (int min) {
		xiaoShi = min/60;
			min = min-(xiaoShi*60);
		System.out.println(xiaoShi+"小时"+min+"分钟");
		return min;
	}
	
//	7. 传入一个数字n, 返回100以内有多少个数字可以整除n
	public int NumN(int num) {
		int sum = 1;
		for (int i = 1; i <= 100; i++) {
			if (i%num == 0) {
				sum++;
			}
			
		}System.out.println("共有"+sum+"个");
		return sum;
	}
	
//	8. 传入一个数字n, 已知空水缸容量100升,每次挑n升水, 返回几次挑完(有参有返)
	public int A = 0;
	public int Whiter(int N) {
		int N1 = 0;
		while(N1<100) {
			N1=N1+N;
			A++;
		}
		System.out.println("需要"+A+"次挑完");
		return A;
	}
	
}

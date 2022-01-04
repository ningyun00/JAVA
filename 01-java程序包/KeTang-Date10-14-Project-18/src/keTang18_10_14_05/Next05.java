package keTang18_10_14_05;
//导包
import java.util.Scanner;
//类
public class Next05 {
	/**5.写一个无参无返回值的方法。
	里面询问用户录入两个数字
	和提供（+、-、*、/）供用户选择。
	最后调用方法，打印结果*/
	//属性
	int num1;
	int num2;
	int str;
	int sum;
	//方法
	public void JiSuan() {
		Scanner ning = new Scanner(System.in);
		System.out.print("输入第一个数字：");
			num1 = ning.nextInt();
		System.out.print("输入第二个数字：");
			num2 = ning.nextInt();
		System.out.print("选择运算符：(+,-,*,/)");
			String str = ning.next();
		//判断
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
			System.out.println("输入错误：");
			break;
		}
		System.out.println(sum);
	}
	
}

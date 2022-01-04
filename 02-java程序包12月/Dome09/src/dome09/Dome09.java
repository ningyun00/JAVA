package dome09;//包

import java.util.Scanner;//导包

public class Dome09 {//类

	public static void main(String[] args) {//主方法
		Scanner ning = new Scanner(System.in);//实例化对象
		//for循环的基本构架如下：循环输出1~100
		for(int A = 1;A <= 100; A++) {
			System.out.println(A);	
		}
		//循环输出1~100之间的偶数
		for (int B = 1;B <= 100;B++) {
			if(B%2 != 0) {		
				continue;//contiune的使用
			}System.out.println(B);
		}
		/*利用for输入网银登录密码,次数只有3次机会, 密码为ningyun520*/
		System.out.print("请输入密码：");
		String A = ning.next();
		for(int B=1;B<=4;B++) {
			if(A.equals("ningyun520")) {
				System.out.println("输入成功");
				break;//满足后跳出循环
			} else {
			System.out.println("输入错误");
			System.out.print("请输入密码");
				A = ning.next();
			}
			
		}

	}

}

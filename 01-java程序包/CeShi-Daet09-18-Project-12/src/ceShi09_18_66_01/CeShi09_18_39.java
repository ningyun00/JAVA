package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_39 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//39. 使用 switch 模拟实现一个菜单选择功能
		Scanner ning = new Scanner(System.in);
			System.out.println("科目列表：");
			System.out.println("1.语文\n2.数学\n3.英语");
			System.out.print("请选择科目数字：");
				int A = ning.nextInt();	
		switch(A) {
		case 1:
			System.out.println("你选择了语文");
			break;
		case 2:
			System.out.println("你选择了数学");
			break;
		case 3:
			System.out.println("你选择了英语");
			break;
		}
	
	}

}

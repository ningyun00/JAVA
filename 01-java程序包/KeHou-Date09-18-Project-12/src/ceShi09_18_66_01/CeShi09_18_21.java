package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_21 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*21. 学习成绩>=90 分的同学用 A 表示，60-89 分之间的
		用 B 表示，60 分以下的用 C 表示*/
		Scanner ning = new Scanner(System.in);
		System.out.println("请输入成绩");
			int A = ning.nextInt();
		if (A >= 90) {
			System.out.println("A");
		} else if (A <= 89 && A >= 60){
			System.out.println("B");
		} else  {
			System.out.println("C");
		}
				
	}

}

package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_29 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*29. 刘珊珊参加了 JAVA 课程学习，父母承诺：考试成绩
		==100 分，母亲给她买一辆车；考试成绩>=90 分，母
		亲给她买一部笔记本电脑；考试成绩>=60，母亲给她买
		一部手机；考试成绩<60，没有礼物。*/
		Scanner ning = new Scanner(System.in);
		System.out.println("请输入成绩：");
			int A = ning.nextInt();
		if (A == 100) {
			System.out.println("一台车");
		} else if (A >= 90) {
			System.out.println("一台笔记本");
		} else if (A >= 60) {
			System.out.println("一部手机");
		} else {
			System.out.println("没有礼物");
		}
		
	}

}

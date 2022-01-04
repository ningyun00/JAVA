package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//10. 输入三个学生的成绩，计算平均分。
		Scanner ning = new Scanner(System.in);
			int B =0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入第"+i+"个人的成绩");
				int A = ning.nextInt();
				B+=A;
		}
		System.out.println(B/3);
	}

}

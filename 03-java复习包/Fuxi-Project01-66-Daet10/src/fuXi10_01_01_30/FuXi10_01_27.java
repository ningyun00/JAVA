package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_27 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//27.
		Scanner ning = new Scanner(System.in);
			System.out.println("请输入年龄：");
				int A = ning.nextInt();
			System.out.println("请输入性别：");
			  	String B = ning.next();
		if (A > 7 || A>=5 && B.equals("男")) {
			System.out.println("能搬得动桌子");
		} else {
			System.out.println("搬不动桌子");
		}	  	
			  	
	}

}

package keHou04_09_09;

import java.util.Scanner;

public class KeHou10 {

	public static void main(String[] args) {
		/*10. 输入一个年份,判断该年份是否为闰年,如果是
		 * 则输出"该年份为闰年",否则输出"该年份为平年"
		闰年的规则: 能被4整除但是不能被100整除或者能被400整除		
		(a%4==0 && a%100!=0 || a%400==0)*/
		Scanner ning = new Scanner(System.in);
		System.out.print("输入年份：");
			int yer = ning.nextInt();
		if (yer%4==0 && yer%100!=0 || yer%400==0) {
			System.out.println("该年份为闰年");
		} else {
			System.out.println("该年份为平年");
		}
		
	}

}

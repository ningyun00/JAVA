package keHou04_09_09;

import java.util.Scanner;

public class KeHou09 {

	public static void main(String[] args) {
		/*9. 对任意输入的整数,判断其是否能被11还有3整除,
		 * 如果能被11还有3整除输出"该数满足要求",
		 * 否则输出信息"该数不满足要求"(a%11==0 || a%3==0)*/
		Scanner ning = new Scanner(System.in);
		System.out.print("输入你所需要的数：");
			int num = ning.nextInt();
		if (num%11 == 0 || num%3 == 0) {
			System.out.println("满足该要求");
		} else {
			System.out.println("不满足num%11 == 0 || num%3 == 0");
		}
	}

}

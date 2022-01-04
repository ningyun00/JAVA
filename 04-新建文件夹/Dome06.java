import java.util.Scanner;

import java.util.Random;

public class Dome06{

	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
		System.out.print("输入你想猜的数：(1~3)");
			int A = ning.nextInt();	
			int B = yun.nextInt(3)+1;//范围1~3
		if (A==B) {
			System.out.println("恭喜猜对了。");
		} else {
			System.out.println("加油。");
		}
		
	}

}
import java.util.Scanner;

import java.util.Random;

public class Dome06{

	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
		System.out.print("��������µ�����(1~3)");
			int A = ning.nextInt();	
			int B = yun.nextInt(3)+1;//��Χ1~3
		if (A==B) {
			System.out.println("��ϲ�¶��ˡ�");
		} else {
			System.out.println("���͡�");
		}
		
	}

}
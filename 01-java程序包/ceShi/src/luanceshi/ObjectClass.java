package luanceshi;

import java.util.Random;

import java.util.Scanner;

public class ObjectClass {

	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
			int A = yun.nextInt(8999)+1000;
		System.out.println(A);
			double B = A/1000;
		System.out.println(B);
			double C = A/100%10;
		System.out.println(C);
			double D = A/10%10;
		System.out.println(D);
			double E = A%10;
		System.out.println(E);
		B=B+5;C=C+5;D=D+5;E=E+5;
		System.out.println(B+"--"+C+"--"+D+"--"+E+"--");
		double F=B/10,G=C/10,H=D/10,I=E/10;
		System.out.println(F+"--"+G+"--"+H+"--"+I+"--");
		 	int J = (int)(F*10)%10;
		System.out.println(J);
			int K = (int)(G*10)%10;
		System.out.println(K);
			int L = (int)(H*10)%10;
		System.out.println(L);
			int M = (int)(I*10)%10;
		System.out.println(M);
		System.out.println(M+""+L+""+K+""+J);
	}

}

import java.util.Scanner;
public class Dome03 {

	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		System.out.print("请输入你的年龄：");
			int a = ning.nextInt();
		System.out.print("请输入你的姓名：");
			String b = ning.next();
		System.out.print("请输入你的性别：");
			String c = ning.next();
		System.out.println(b+"今年"+a+"岁"+"性别"+c+"。");
		
	}

}

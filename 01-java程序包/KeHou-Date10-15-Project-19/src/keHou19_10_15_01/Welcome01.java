package keHou19_10_15_01;
/** 
 * @author EDZ
 */
import java.util.Scanner;
/**
 * ����
 * ��ӭ��
 */
public class Welcome01 {
	/**
	 * ����
	 */
	public void SayHello() {	
		Scanner input = new Scanner(System.in);
		System.out.print("���ʲô��");
			String name = input.next();
		System.out.println(name + ", ��ã�");
		System.out.println("-----------------------------------");
		System.out.println("********��ӭ������Ϸ********");
		System.out.println("\t��ʼ��Ϸ");
		System.out.println("***************************");
	}
	
}

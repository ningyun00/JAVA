package keTang20_10_18_01;
/**
 * 
 * @author ��
 *
 */
import java.util.Scanner;

public class KeTang01 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.����һ���ַ������ж�����ַ����ĳ������С��6����������Ȳ������������������ȷ����
		Scanner ning = new Scanner(System.in);
			System.out.print("����һ�����ȵķ��ţ�");
		String A = new String(ning.next());
		if (A.length()>6) {
			System.out.println("������ȷ");
		} else {
			System.out.println("���Ȳ���");
		}
		
	}

}

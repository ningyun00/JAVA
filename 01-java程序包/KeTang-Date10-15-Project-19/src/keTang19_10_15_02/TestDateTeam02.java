package keTang19_10_15_02;
/**
 * ����
 */
import java.util.Scanner;
/**
 * ������
 * @author ��
 *
 */
public class TestDateTeam02 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ʵ��������
		 */
		DateTeam02	date = new DateTeam02();
		Scanner ning = new Scanner(System.in);
		
		//1.
		date.XianShi();
		
		//2.
		System.out.print("������ʼ��ݣ�");
		date.QiShi = ning.nextInt();
		System.out.print("���������ݣ�");
		date.JeiShu = ning.nextInt();
		date.RunNian(0);
		
		//3.
		date.ShuRu();
		//4.
		date.YueFen("����", "С��","ƽ��");
		
		//5.
		System.out.print("�����·ݣ�");
		date.YueFen(ning.nextInt());
		
		//6.
		System.out.print("���������ݣ�");
		date.ChengNian(ning.nextInt());
		
		//7.
		System.out.print("���뼸���·ݣ�");
		date.TianShu(ning.nextInt());
		
		//8.
		System.out.print("������ݵó�����֣�");
		date.NianFen(ning.nextInt());
	
	}

}

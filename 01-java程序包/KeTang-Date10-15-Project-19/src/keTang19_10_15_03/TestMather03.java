package keTang19_10_15_03;
//����
import java.util.Scanner;
/**
 * ������
 * @author ��
 */
public class TestMather03 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		Mather03 mat = new Mather03();
		
		
	//1.
		System.out.println("���ֵ�ǣ�"+mat.Max(0));
		
	//2.
		System.out.println("��СֵΪ��"+mat.Min(0));
	
	 
	//3.
		/**
		 * ��������д�ڲ������ԭ��
		 * mat.n1�������޷����ã�Ҫ��д��������n1ֵΪ0;
		 * д�ڲ��������߶����Ե���
		 */
		System.out.print("����һ��������");
			mat.n1 = ning.nextInt();	
		System.out.println("��1����"+mat.n1+"��ֵΪ��"+mat.N(0));
	 
		
	//4.
		System.out.print("����һ������");
			int zhiShu = ning.nextInt();
		mat.IntN(zhiShu);
	
		
	//5.
		mat.yers(0);
		
		
	//6.
		System.out.print("������ӣ�");
			int min = ning.nextInt();
		mat.Time(min);
	
		
	//7.
		System.out.println("����һ�����֣�");
		mat.NumN(ning.nextInt());
	
		
	//8.
		System.out.println("����ÿ����ˮ���٣�");
		mat.Whiter(ning.nextInt());
		
		
	}

}

package keTang19_10_15_01;
/**
 * @author ��
 */
import java.util.Scanner;

//������
public class TestKitchener01 {
	//������
	public static void main(String[] args) {
		//�½�����
		Kitchener01 kit = new Kitchener01();
		Scanner ning = new Scanner(System.in);
		
		//1.
		kit.DengJi(2);
		
		//2.
		kit.ChuLing(14);
		
		//3.
		System.out.println("��ʦ������һЩ"+kit.ZengSong()+"���͸�����");
		
		//4.
		System.out.println("��ϲ�㣺"+kit.ChouJiang());
		
		//5.
		System.out.print("�����߲�����");
		kit.ShuCai(ning.next());
		
		//6.
		System.out.print("����������");
		kit.HunCai(ning.next());
		
		//7.
		System.out.println("������䣺");
			int	A = ning.nextInt();
		System.out.println("�ȼ�Ϊ��"+kit.NianLing(A)+"��");
		
		//8.	
		System.out.println("������,�زˣ�");
		kit.HunSu(ning.next(), ning.next());
		
		//9.
		System.out.println("���뼸Ԫ���,��Ԫ����,��Ԫţ��,��Ԫ�з");
		kit.MaiCai(ning.nextInt(), ning.nextInt(), ning.nextInt(), ning.nextInt());

	}

}

package keHou20_10_18_01;

import java.util.Scanner;

/**
 * ����
 * @author ��
 *
 */
public class KeHou05 {
	/**
	 * ������ 
	 * @param args
	 */
	public static void main(String[] args) {
		//5.�����й��˵��ն��ǵ����֣����������һ���˵�������Ȼ������պ���
		//ʵ��������
		Scanner ning = new Scanner(System.in);
		//�����ʾ
		System.out.print("����������");
			//�����ַ������Ͷ���
			String name = new String(ning.next());
		//�жϳ���
		if (name.length() == 3) {
			//��ȡ��
			String na = name.substring(0, 1);
			//��ȡ��
			String me = name.substring(1, 3);
			System.out.println("�գ�"+na+"\n����"+me);
		//�жϳ���
		}else if (name.length()==4){
			//˫����
			String na = name.substring(0,2);
			//��
			String me = name.substring(2,4);
			System.out.println("�գ�"+na+"\n����"+me);
		//�������
		} else {
			System.out.println("��ʽ����");
		}
		
	}

}

package qita02;

import java.util.Scanner;

public class TersYuxi02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//ʵ��������Ա
		Yuxi02 yuxi = new Yuxi02();
		while(true) {
			System.out.println("�û�����");
				String name = sc.next();
			System.out.println("���룺");
				String pwd = sc.next();
			if (name.equals(yuxi.userName) && pwd.equals(yuxi.Password)) {
				System.out.println("�����������룺");
					yuxi.Password = sc.next();//�޸�
					System.out.println("�޸�����������ɣ�"+yuxi.Password);
					break;//��ֹ��ѭ��
			} else {
				System.out.println("�û����������������Ȩ��");
				
			}
			
		}
		
	}

}

package keTang19_10_15_02;
/**
 * ����
 */
import java.util.Scanner;
/**
 * ��
 * @author ��
 *
 */
public class DateTeam02 {
	/** 
	2. ����һ��������DateTime
	�����������: �� �� ��  ʱ �� ��
	������ķ���:
	
	*/
	/**
	 * ����
	 * @author ��
	 * @apiNote yers ��
	 * @apiNote yue ��
	 * @apiNote date ��
	 * @apiNote when ʱ
	 * @apiNote points ��
	 * @apiNote seconds ��
	 */
	int yers=2021;
	int yue = 10;
	int date= 16;
	int when = 12;
	int points= 30;
	int seconds= 40;
	/**
	 * ����
	 */
	Scanner ning = new Scanner(System.in);
//	1. ��ʾʱ����: ���"XX��XX��XX�� ʱ:��:��"(�޲��޷�)
	public void XianShi() {
		System.out.println(yers+"��"
						  +yue+"��"
						  +date+"�� "
						  +when+"ʱ��"
						  +points+"�֣�"
						  +seconds+"��");
	}
	
//	2. ����һ����ʼ���,һ���������, �����������֮���ж��ٸ�����(�в��з�)
	public int QiShi;//��ʼ���
	public int JeiShu;//�������
	public int RunNian(int runNian) {
		for (int i = QiShi; i <= JeiShu; i++) {
			if (i%4 == 0 && i%100 != 0 || i%400 == 0) {
				runNian++;
			}
			
		}
		System.out.println("�����У�"+runNian+"��");
		return runNian;//�����ж����� 
	}
	
//	3. ����һ�����,�ж��Ƿ����귵��boolean����ֵ
	public void ShuRu() {
		boolean falg = true;//���أ���
		System.out.print("�������ڣ�");
			int riqi = ning.nextInt();//¼������
		if (riqi%4==0&&riqi%100!=0||riqi%400==0) {//�ж�����
			System.out.println(falg);
				falg = false;//���Ƿ���false;
		}
		if (falg) {//����ֵ
			System.out.println("false");
		}
		
	}
	
//	4. ����"С��",��ʾһ������С��, ����"����",��ʾһ�����д���, ����"ƽ��",��ʾһ���е�ƽ��(�в��޷�)
	public void YueFen(String maxYue,String minYue,String pingYue) {
		System.out.print("�����С�º�ƽ�£�");
			String yue = ning.next();
		if (yue.equals(minYue)) {
			System.out.println("4\t6\t9\t11\t");
		} else if (yue.equals(maxYue)) {
			System.out.println("1\t3\t5\t7\t8\t10\t12\t");
		} else if (yue.equals(pingYue)) {
			System.out.println("2");
		} else {
			System.out.println("������ȷֵ");
		}
		
	}
	
//	5. ����һ���·�, �����·ݷ���("����","С��"����"ƽ��")(�в��з�)
	public int YueFen(int yuefen) {
		if (yuefen==4||yuefen==6||yuefen==9||yuefen==11) {
			System.out.println("С��");
		} else if (yuefen==1||yuefen==3||yuefen==5||yuefen==7||yuefen==8||yuefen==10||yuefen==12) {
			System.out.println("����");
		} else if (yuefen==2) {
			System.out.println("ƽ��");
		} else {
			System.out.println("������ȷֵ");
		}
		return yuefen;
	}
	
//	6. ����һ���������year, ���ظó��������Ƕ���(�в��з�)
	public int ChengNian(int chuSheng) {
		int chengNian = chuSheng+18;
		System.out.println("�㽫��"+chengNian+"���ꡣ");
		return chengNian;
	}
	
//	7. ����һ���·�, ���ظ��·ݵ�������(�в��з�)
	public int TianShu(int A) {
		switch(A) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28");
			break;
		}
		return A;
	}
	
//	8. ����һ�����, ���ظ���ݵ�������(�в��з�)
	public int NianFen(int sumDay) {
		if (sumDay%4 == 0 && sumDay%100 != 0 || sumDay%400 == 0) {
			System.out.println("366");
		} else {
			System.out.println("365");
		}
		return sumDay;
	}
	
}

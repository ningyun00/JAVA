package keHou18_10_14_02;

public class Palnter02 {
	/**2. ����һ�������� Painter
	�����������: ��������, ���ҹ���, �����Ա�
	������ķ���:
	1. �޲��޷����ܷ���: ������ҵ���Ϣ
	2. �޲��޷���ӡ�����η���: ���һ��������
	3. �޲��޷���ӡֱ�������η���: ���һ��ֱ��������
	4. �޲��޷���ӡ�����η���: ���һ��ֱ��������
	
	1. �޲��з���ȡ��������: ���ػ��ҵ�����
	2. �޲��з���ȡ���ҹ���: ���ػ��ҵĹ���
	3. �޲��з���ȡ�����Ա�: ���ػ��ҵ��Ա�
	4. �޲��з�������ͷ���: ���� 500 ��
	5. �޲��з�����Т������: ������Ʒ"һ�л����*/
	
	//����
	String name = "��";
	String nationality = "�й�";
	String sex = "��";
	
	//1.����
	public void jeiShao() {
		System.out.println("����������"+name
						  +"���ҹ�����"+nationality
						  +"�����Ա�"+sex);
	}
	
	//2.
	public void daYin() {
		for (int i = 1; i < 5; i++) {//��
			if (i>=2&&i<=3) {
				for (int j = 1; j <= 5; j++) {//��
					if (j==1||j==4) {
						System.out.print("*");
					} else if (j>=1||j<=4){
						System.out.print("    ");
					}
					
				}
				
			}else if(i==1||i==4){
				for (int j = 1; j < 5; j++) {
					System.out.print("*  ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	//3.
	public void zhiJiao() {
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//4.
	public void sanJiaoXing() {
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	
	//1.
	public String Name() {
		return name;
	}
	
	//2.
	public String Nationality() {
		return nationality;
	}
	
	//3.
	public String Sex () {
		return sex;
	}
	
	//4.
	public int money() {
		return 500;
	}
	
	//5.
	public String xiaoJing() {
		return "һ�л����";
	}
	
}

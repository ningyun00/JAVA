package keTang18_10_14_02;

public class Square02 {
	/**2��дһ�������ε��࣬���е����ԣ������εĳ�������
	���з�����
	��һ���ƶ��ķ�����û�з���ֵ��Ҫ����������������ƶ�����
	�������仯�ķ�����û�з���ֵ��Ҫ����������������ڱ仯����
	��������ʾ�˳����� ��Ϣ �ķ�����
	���ģ��õ������εĳ��ķ��������س���
	���壩�õ������ο�ķ��������ؿ�
	�������õ��������ܳ��ķ��������ش˳����ε��ܳ���
	���ߣ��õ������ε�����ķ��������ش˳����������*/
	//����
	int Long = 100;//��
	int Wide = 24;//��
	//һ���޷���
	public void move() {
		System.out.println("�����������ƶ�");
	}
	
	//�����޷��ص�
	public void BiangXing() {
		System.out.println("���������ڱ仯");
	}
	
	//��������
	public void FanFa() {
		System.out.println("����"+Long
						  +"\n��"+Wide);
	}
	
	//�ġ��з��ص�
	public int Chang() {
		return Long; 
	}
	
	//�塣�з��ص�
	public int Kuang() {
		return Wide;
	}
	
	//����
	public int ZouChang() {
		return (Long+Wide)*2;
	}
	//�ߡ�
	public int MianJi() {
		return (Long*Wide);
	}
	
}

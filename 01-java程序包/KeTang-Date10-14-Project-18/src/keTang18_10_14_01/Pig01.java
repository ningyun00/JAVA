package keTang18_10_14_01;
//��
public class Pig01 {
	/**1��дһ�����࣬���е����ԣ�Ʒ�֣���ɫ��������������
	�з�����
	
	�޷���ֵ�ķ�����
	��һ������·�ķ�����û�з���ֵ��Ҫ�������ʽΪ��ĳĳƷ�ֵ�ĳĳ��ɫ����������ȥ����
	����������˵ķ�����û�з���ֵ��Ҫ�������ʽΪ��ĳĳƷ�ֵ�ĳĳ��ɫ��������ˣ���
	����Ϊ���١���
	(������Է��ķ�����û�з���ֵ��Ҫ�������ʽΪ��ĳĳƷ�ֵ�ĳĳ��ɫ����Ե���ࡱ��
	
	�з���ֵ�ķ�����
	��һ���õ�����Ʒ�ֵķ��������ش����Ʒ�֡�
	�������õ�������ɫ�ķ��������ش������ɫ��
	*/
	
	//�޷��ص�
	String varitise;//Ʒ��
	String color;//��ɫ
	int attack;//������
	//1.
	public void Getpig() {
		System.out.println(varitise+"Ʒ�Ƶ�"+color+"��ɫ����������ȥ");
	}//2.
	public void Dapig() {
		System.out.println(varitise+"Ʒ�Ƶ�"+color+"��ɫ��������ˣ�������Ϊ��"+attack);
	}//3.
	public void GanfanPig() {
		System.out.println(varitise+"Ʒ�Ƶ�"+color+"��ɫ����Ե����");
	}
	
	//�з��ص�
	//1.
	public String PingZhong() {
		//����һ
		String	varitise = "ũ��";
			return varitise;//����
	}
	//2.	
	public String Color() {
		//������
		return "��ɫ";
	}
	
}

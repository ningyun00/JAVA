package keHou18_10_14_01;

public class Teacher01 {
	/**1. ����һ����ʦ�� Teacher
	��ʦ�������: ����,����,�Ա�,���(�ѻ�/δ��)
	��ʦ��ķ���:
	1. �޲��޷����ҽ��ܷ���: �����ʦ�������������
	2. �޲��޷��ϰ෽��: ���"XXX ��ʦ�����ϰ��;��,������" 
	3. �޲��޷��°෽��: ���"XXX ��ʦ�����°��;��,˳�������" 
	4. �޲��޷�˯������: ���"XXX ��ʦ����˯��, �������" 
	1. �޲��з����η���: ���"��ʦ������ĭ��ɵĽ���",�������ַ���"Java ֪ʶ" 
	2. �޲��з���ʱ����: ���"��ʦ���˿�ʱ��", ������һ��ʱ������.��: 9
	3. �޲��з���ʦ�³�����: ���"��ʦ���ڳ���", �����ز���"��������˿" 
	4. �޲��з���ʦ�����Ϸ���: ����������"һƿ����" 
	5. �޲��з���ʦ�����ֻ�����: ����"һ���ֻ�"*/
	//����
	String name = "yun";
	int age = 20;
	String sex = "Ů"; 
	String JeiHun = "δ��";
	//1.�����޷�
	public void jeishao() {
		System.out.println("������"+name
						  +"���䣺"+age
						  +"�Ա�"+sex
						  +"���"+JeiHun);
	}
	
	//2.
	public void shangban() {
		System.out.println(name+"��ʦ�����ϰ��;��,������");
	}
	
	//3.
	public void xiaban() {
		System.out.println(name+"��ʦ�����°��;��,˳�������");
	}
	
	//4.
	public void shuijiao() {
		System.out.println(name+"��ʦ����˯��, �������");
	}
	
	//1.�з�
	public String jiangke() {
		return "Java";
	}
	
	//2.
	public int time() {
		return 6;
	}
	
	//3.
	public String chaocai() {
		return "�����";
	}
	
	//4.
	public String yinliao() {
		return "һƿ����";
	}
	
	//5.
	public String shouji() {
		return "һ���ֻ�";
	}
}

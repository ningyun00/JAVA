package keTang18_10_14_03;

public class XueSheng03 {
	/**3��дһ��ѧ�����࣬���е�����ѧ�������֣�ѧ���� java
	�ɼ���ѧ���� sql �ɼ���ѧ���� C#�ɼ��������з�����
	��һ��ѧ��ѧϰ�ķ������޷��أ�Ҫ�������ѧ����ѧϰ����
	����������ѧ�������ķ�����
	����������ѧ�� java �ɼ��ķ�����
	���ģ�����ѧ�����й����ܳɼ��ķ�����
	���壩����ѧ�����й� ��ƽ���ֵķ�����*/
	//����
	String name = "��";
	int java = 89;
	int sql = 98;
	int C = 96;
	
	//һ���޷��ص�
	public void in() {
		System.out.println("ѧ������ѧϰ");
	}
	
	//��������
	public String NAME() {
		return name;
	} 
	
	//��������
	public int ChengJi() {
		return java;
	}
	
	//�ġ�����
	public int sum() {
		return (java+sql+C);
	}
	
	//�塣����
	public double avg() {
		return (sum()/3);
	}
	
}

package keTang18_10_14_04;

public class Car04 {
	/**4��дһ���������࣬���������ԣ�Ʒ�ƣ��۸���ɫ����
	���з�����
	��һ����ʾ��ǰ����������������Եķ��� toString��
	���������������ķ�����Ҫ�������XX Ʒ�Ƶ����������ˡ���
	�������������ٵķ�����Ҫ�������XX Ʒ�Ƶ����������С���
	���ģ����������ķ�����Ҫ�������XX Ʒ�Ƶ��������� XX Ԫ�ļ۸�����*/
	//����
	String brand = "����";
	int money = 123456789;
	String color = "������������";
	
	//һ��
	public void showstring() {
		System.out.println("Ʒ��Ϊ��"+brand
						  +"\n�۸�Ϊ��"+money
						  +"\n��ɫΪ��"+color);
	}
	
	//����
	public void qidong(){
		System.out.println(brand+"Ʒ�Ƶ�����������");	
	}
	
	//����
	public void jiaSu(){
		System.out.println(brand+"Ʒ�Ƶ�����������");	
	}
	
	//�ġ�
	public void chuShou(){
		System.out.println(brand+"Ʒ�Ƶ�������"+money+"�ļ۸�����ˡ�");	
	}
			
}

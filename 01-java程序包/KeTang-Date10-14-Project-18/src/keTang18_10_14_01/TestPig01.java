package keTang18_10_14_01;
//������
public class TestPig01 {
	//������
	public static void main(String[] args) {
		//����һ������
		Pig01 pig =  new Pig01();
		//�޷��ص�
		pig.varitise = "ũ��";
		pig.color = "��ɫ";
		//���
		pig.Getpig();
		
		pig.attack = 100;
		//���
		pig.Dapig();
		pig.GanfanPig();
		
		//�з��ص�
		//1.
		System.out.println("����Ϊ��"+pig.PingZhong()+"��");
		//2.
		System.out.println("����Ϊ��"+pig.Color()+"��ɫ");
	}
	
}

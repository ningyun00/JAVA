package keHou18_10_14_02;
//������
public class TestPalnter02 {
	//������
	public static void main(String[] args) {
		//�½�����
		Palnter02 pal = new Palnter02();
		//1.
		pal.jeiShao();
		//2.
		pal.daYin();
		//3.
		pal.zhiJiao();
		//4.
		pal.sanJiaoXing();
		//1.
		System.out.println("���ҵ������ǣ�"+pal.Name());
		//2.
		System.out.println("���ҵĹ����ǣ�"+pal.Nationality());
		//3.
		System.out.println("���ҵ��Ա��ǣ�"+pal.Sex());
		//4.
		System.out.println("��������У�"+pal.money());
		//5.
		System.out.println("����Т�����ˣ�"+pal.xiaoJing());
	}

}

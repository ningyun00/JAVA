package keHou18_10_14_01;

public class TestTeacher2 {

	public static void main(String[] args) {
		
		Teacher01 tea = new Teacher01();
		//1.
		tea.jeishao();
		//2.
		tea.shangban();
		//3.
		tea.xiaban();
		//4.
		tea.shuijiao();
		//1.
		System.out.println("��ʦ������ĭ��ɵĽ���"+tea.jiangke()+"֪ʶ");
		System.out.println("��ʦ���˿�ʱ��"+tea.time());
		System.out.println("��ʦ���ڳ���"+tea.chaocai());
		System.out.println("��ʦ����������"+tea.yinliao());
		System.out.println("��ʦ�����ֻ�"+tea.shouji());
	}

}

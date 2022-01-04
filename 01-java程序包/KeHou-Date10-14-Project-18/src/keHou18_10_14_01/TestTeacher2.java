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
		System.out.println("老师正在唾沫横飞的讲课"+tea.jiangke()+"知识");
		System.out.println("老师看了看时间"+tea.time());
		System.out.println("老师正在炒菜"+tea.chaocai());
		System.out.println("老师正在买饮料"+tea.yinliao());
		System.out.println("老师借用手机"+tea.shouji());
	}

}

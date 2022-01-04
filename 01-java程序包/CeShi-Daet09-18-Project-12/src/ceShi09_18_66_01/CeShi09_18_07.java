package ceShi09_18_66_01;

public class CeShi09_18_07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*7. 山上有一口缸可以装 50 升水,现在有 15 升水.老和尚叫小
和尚下山挑水,每次可以挑 5 升.问:小和尚要挑几次水才
可以把水港挑满?*/
			int A = 20,B = 0;
		for (int i = 1; A <= 50; i++) {
			A += 5;
			B = i;
		}
		System.out.println("需要"+B+"次");
	}

}

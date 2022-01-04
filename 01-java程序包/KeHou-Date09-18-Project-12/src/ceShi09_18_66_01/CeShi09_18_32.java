package ceShi09_18_66_01;

public class CeShi09_18_32 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*32. 开发一个标题为”FlipFlop”的游戏应用程序。它从 1
			计数到 100，遇到 3 的倍数就输出单词“Flip”
			，遇到 5
			的倍数就输出单词”Flop”
			，既为 3 的倍数也为 5 的倍
			数就输出”FlipFlop”
			，其余情况输出当前数字。*/
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.println("FlipFlop");
			} else if (i%3 == 0) {
				System.out.println("Flip");
			} else if (i%5 == 0) {
				System.out.println("Flop"); 
			} else {
				System.out.println(i);
			}
		
		}

	}

}

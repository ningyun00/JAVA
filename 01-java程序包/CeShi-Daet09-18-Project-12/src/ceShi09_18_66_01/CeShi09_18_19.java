package ceShi09_18_66_01;

public class CeShi09_18_19 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*19. 一张纸的厚度大约是 0.08mm，对折多少次之后能达
到珠穆朗玛峰的高度（8848.13 米）*/
		int B = 1;		
		for (double i = 0.08;i <= 8848.13; i*=2) {
			B++;
		}
			System.out.println(B);
	}

}

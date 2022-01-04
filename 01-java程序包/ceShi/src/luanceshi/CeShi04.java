package luanceshi;
/**
 * 测试二维数组的使用
 * @author EDZ
 * @2021.10.8
 * 
 */
public class CeShi04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] arrayNum = new int [5][4];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				arrayNum[i][j] = i + j;
			}
			
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(arrayNum[i][j]);
			}
			System.out.println("");
		}

	}

}

package luanceshi;
/**
 * ���Զ�ά�����ʹ��
 * @author EDZ
 * @2021.10.8
 * 
 */
public class CeShi04 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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

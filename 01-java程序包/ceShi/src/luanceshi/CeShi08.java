package luanceshi;

public class CeShi08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int arr [] = {2,5,112,45,34,156,98};
		int num = 15;
		int left = 0;
		int right = arr.length-1;
		int middle = (left + right)/2;
		while (left < right) {
			int m = arr [middle];
			if (num < m) {
				right = middle;
			} else if (num > m){
				left = middle;
			} else {
				System.out.println("程序结束");
				System.out.println(middle);
				break;
			}
			middle = (left + right)/2;
		}
	
	}

}

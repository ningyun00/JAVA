package luanceshi;

public class CeShi07 {
	
	public static void main(String[] args) {
			int arr [] = {2,15,112,34,156,98};
		for (int i = 0; i < arr.length-1; i++) {
			//循环最大值减一。
			for (int j = 0; j < arr.length-1-i; j++) {
				//循环到最大值减一减i次
				if (arr[j]>arr[j+1]) {
					//判断第一个值与后一个值
					int A = arr[j];
					arr [j] = arr[j+1];
					arr[j+1] = A;
					//交换赋值
				}
				
			}
			
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
	}

}

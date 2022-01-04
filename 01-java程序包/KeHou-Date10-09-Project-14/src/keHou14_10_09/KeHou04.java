package keHou14_10_09;

public class KeHou04 {

	public static void main(String[] args) {
		/*4. 定义一个数组 arr 值为{"天使","仙女","恶魔","恶灵","魔鬼"}，另外一个数组 brr 值
		为{"炽天使","幽灵","灵魂"}合并成一新的数组 crr.*/
			String arr [] = new String [] {"天使","仙女","恶魔","恶灵","魔鬼"};
				//定义5个长度
			String brr [] = new String [] {"炽天使","幽灵","灵魂"};
				//定义3个长度
			String crr [] = new String [arr.length+brr.length]; 
				//定义8个长度
		for (int i = 0; i < arr.length; i++) {//循环5次赋值给arr[i];
			crr[i] = arr[i]; 
		}
		for (int i = 0; i < brr.length; i++) {//循环3次赋值给第5,6,7下标处
			crr[arr.length+i]=brr[i];
		}
		for (int i = 0; i < crr.length; i++) {//循环输出
			System.out.print(crr[i]+" ");
		}
		
	}

}

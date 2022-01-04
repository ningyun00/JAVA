package keTang20_10_18_01;
/**
 * 
 * @author 寜
 *
 */
public class KeTang06 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		// 6.字符串"    Hello,     baby~!    "; 利用字符串方法清除空格
		//定义字符串类对象
		String st = new String("    Hello,     baby~!    ");
		//将字符串对象改成数组形式，并将空格去除;
		String [] st1 = st.split(" ");
		//for循环储存
		for (int i = 0; i < st1.length; i++) {
			//输出更该
			System.out.print(st1[i]);
		}
		
	}

}

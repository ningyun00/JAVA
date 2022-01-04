package keHou20_10_18_01;

import java.util.Scanner;

/**
 * 导包
 * @author 寜
 *
 */
public class KeHou05 {
	/**
	 * 主方法 
	 * @param args
	 */
	public static void main(String[] args) {
		//5.假设中国人的姓都是单个字，请随机输入一个人的姓名，然后输出姓和名
		//实例化对象
		Scanner ning = new Scanner(System.in);
		//输出提示
		System.out.print("输入姓名：");
			//接收字符串类型对象
			String name = new String(ning.next());
		//判断长度
		if (name.length() == 3) {
			//截取姓
			String na = name.substring(0, 1);
			//截取名
			String me = name.substring(1, 3);
			System.out.println("姓："+na+"\n名："+me);
		//判断长度
		}else if (name.length()==4){
			//双字姓
			String na = name.substring(0,2);
			//名
			String me = name.substring(2,4);
			System.out.println("姓："+na+"\n名："+me);
		//输出错误
		} else {
			System.out.println("格式错误");
		}
		
	}

}

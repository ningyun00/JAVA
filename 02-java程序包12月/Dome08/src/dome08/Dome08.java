package dome08;

public class Dome08 {

	public static void main(String[] args) {
		/*1. 循环输出 1900-2017 年的闰年有哪些?
		 * (提示: 在循环内是可以用 if 进行判断的)*/
		int ning= 1900;//初始变量。
		do {
			if (ning%4 == 0 && ning%100 != 0 || ning%400 == 0) {//满足此条件的都是闰年
				System.out.println("闰年为：\t"+ning);
			} else {//都不是闰年，是平年
				System.out.println("平年为：\t"+ning);
			}
			ning++;//循环值得改变
		} while (ning <= 2017);//循环条件
		
	}

}

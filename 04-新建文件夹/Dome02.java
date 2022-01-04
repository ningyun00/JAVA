public class Dome02{

	public static void main(String[] args) {	

		//首先定义数据类型，拿“18 165 寜韵 男 女  1.65  47.5”举例。
		//如上所说对应的数据储存方式不同。
		//整数用“int”小数用“double”单字符”用char“ 字符串用“String”。
		//1.先声明，在赋值。
			int a;		//声明
  			a = 18; 		//赋值
  	  	System.out.println(a);	//输出
		
		//2、声明并赋值
		          int b = 165;
		System.out.println(b);
		
		//3、连续声明赋值
		//要求变量是同一种数据类型（中间用逗号隔开）
			int c = 18,d =165;
		System.out.println(c+"\n"+d);
		
		
		//4.其它数据的储存
		  	String A = "寜韵";
			char B = '男';
			char C = '女';
			double D = 1.65,E = 47.5;
		System.out.println(A+"是"+C+"孩子"+"身高"+D+"米，体重为"+E);

		//5.运算符的使用
			int Q =  22;
			int W = 22%7;
		System.out.println(W);



         }

}
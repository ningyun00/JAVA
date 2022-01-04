
package keTang17_10_13_02;

public class Dog02 {
	/*2. 写一个狗类 Dog:
	类中的属性: 
	姓名, 性别, 颜色, 品种, 体重, 肩高, 价钱
	类中的方法:
	1. 一个狗类的介绍方法: 输出狗类的所有信息
	写一个测试类 TestDog:
	生成一个 Dog 对象 b, 该对象的姓名
	"阿八", 性别"母", 颜色"棕红", 品种"泰迪", 体
	重"5.2"斤, 肩高"26", 价钱"2000" 生成一个 Dog 对象 t, 
	该对象的姓名"兔子", 性别"母", 颜色"银灰", 品种"泰迪", 体
	重"3.1"斤, 肩高"22", 价钱"5000*/
	//属性
	String name;//姓名
	String sex;//性别
	String color;//颜色
	String varitise;//品种
	double Kg;//体重
	double ShouldeHigt;//肩高
	double money;//价钱
	//方法
	public void shouDog02() {
		//方法体
		System.out.println("姓名："+name
						+"\n性别："+sex
						+"\n颜色："+color
						+"\n品种："+varitise
						+"\n体重："+Kg
						+"\n肩高："+ShouldeHigt
						+"\n价钱："+money);
		System.out.println();
	}
	
}

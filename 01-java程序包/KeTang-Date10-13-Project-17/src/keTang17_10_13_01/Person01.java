package keTang17_10_13_01;

public class Person01 {
		/*1. 写一个人类 Person:
		类中的属性: 姓名. 性别. 年龄. 身高. 体重. 出生年月
		类中的方法:
		1. 一个人类的自我描述方法: 输出该人类的所有相关属性
		写一个测试类 TestPerson:
		生成一个 Person 对象 p, 该对象的姓名"王二麻子", 性别"男", 年龄"17", 身高
		"176.5", 体重"73.5", 
		出生年月"1997/9/23",最后调用该对象的自我描述方法*/
	//属性
	String name;//姓名
	String sex;//性别
	int  age;//年龄
	int height;//身高
	double Kg;//体重
	String DateOfBirth;//出生年月
	//方法
	public void showPerson01() {
		//方法体
		System.out.print("姓名："+name
						+"\n性别："+sex
						+"\n年龄："+age
						+"\n身高："+height
						+"\n体重："+Kg
						+"\n出身年月："+DateOfBirth);
	}
	
}

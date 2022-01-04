package keHou17_10_13_02;

public class Score02 {
	/*2. 写一个学生成绩类 Score
	类中的属性: 学生学号, Java 成绩, HTML 成绩, SQL 成绩, C#成绩
	类中的方法:
	1. 显示成绩的方法: 要求显示学号和 4 门成绩
	写一个测试类 TestScore:
	生成一个学生对象 stu, 显示出学号 S00831, Java 成绩 81 分, HTML 成绩 85 分, SQL
	成绩 76 分, C#成绩 73*/
	//属性
	String StudentNo;//学号
	double Java;//成绩
	double HTML;//成绩
	double SQL;//成绩
	double C;//成绩
	//方法
	public void showScore02() {
		//方法体
		System.out.println("学号："+StudentNo
						  +"\nJava成绩："+Java
						  +"\nHTML成绩："+HTML
						  +"\nSQL成绩："+SQL
						  +"\nC#："+C);
	}
	
}

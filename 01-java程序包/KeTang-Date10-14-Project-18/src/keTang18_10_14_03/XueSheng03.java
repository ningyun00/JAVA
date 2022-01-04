package keTang18_10_14_03;

public class XueSheng03 {
	/**3、写一个学生的类，类中的属性学生的名字，学生的 java
	成绩，学生的 sql 成绩，学生的 C#成绩。类中有方法：
	（一）学生学习的方法，无返回，要求输出“学生在学习”。
	（二）返回学生姓名的方法。
	（三）返回学生 java 成绩的方法。
	（四）返回学生所有功课总成绩的方法。
	（五）返回学生把有功 课平均分的方法。*/
	//属性
	String name = "寜";
	int java = 89;
	int sql = 98;
	int C = 96;
	
	//一。无返回的
	public void in() {
		System.out.println("学生正在学习");
	}
	
	//二。返回
	public String NAME() {
		return name;
	} 
	
	//三。返回
	public int ChengJi() {
		return java;
	}
	
	//四。返回
	public int sum() {
		return (java+sql+C);
	}
	
	//五。返回
	public double avg() {
		return (sum()/3);
	}
	
}

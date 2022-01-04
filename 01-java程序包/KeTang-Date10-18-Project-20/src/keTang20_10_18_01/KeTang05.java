package keTang20_10_18_01;
/**
 * 
 * @author 寜
 *
 */
public class KeTang05 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		//5.”长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山“将这首歌中的空格用","代替。
		//定义字符串类对象
		String guShi = new String("长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山");
		//将更改值储存
		String guShiChang = guShi.replace(" ",",");
		//输出
		System.out.print(guShiChang);
	}

} 

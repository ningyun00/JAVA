package qita03;
/**
 * 账户类
 * @author 寜
 *
 */
public class Account01 {
	public double blance;//余额
	/**
	 * 获取余额
	 */
	public void getBlance() {
		System.out.println("****当前余额是："+blance+"元*****");
		
	}
	/**
	 * 存钱的方法
	 * @param money 要存入的钱
	 */
	public void saveMoney(double money) {
		blance = blance+money;//存钱
		System.out.println("存款成功！");
		System.out.println();
		getBlance();//调用余额显示;
	}
	/**
	 * 取钱的方法
	 * @param money 要取得钱
	 */
	public void takeMoney(double money) {
		//判断取出的金额是否小于等于余额，否则给出提示
		if (money>blance) {
			System.out.println("余额不足！");
			
		}else {
			blance = blance - money;
			System.out.println("取款成功");
			getBlance();
		}
		
	}
	
}

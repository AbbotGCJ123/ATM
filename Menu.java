import java.util.Scanner;
//菜单列表
public class Menu{
	//查询页面
	public boolean display(User user){
		System.out.println("当前页面：查询");
		System.out.println("当前用户："+user.getName());
		System.out.println("账户余额："+user.getMoney());
		System.out.println("1、返回上一级");
		System.out.println("请选择：");
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		boolean b = false;
		if (num == 1) {
			b= true;
		}
		return b;
	}
	public int transferMoney(User user){
		System.out.println("当前页面：转账");
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入对方银行卡号：");
		String forCardnum = sca.next();
		user.setAccountNumber(forCardnum);
		System.out.println("输入转账金额：");
		double forMoney = sca.nextDouble();
		user.setHalfwayMoney(forMoney);

		System.out.println("1、确认  2、重新输入  3、返回菜单");
		System.out.println("请选择：");
		int num = sca.nextInt();
		return num;
	}
	public int takeTheMoney(User user){
		System.out.println("当前页面：取款");
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入取款金额：");
		double money = sca.nextDouble();
		user.setHalfwayMoney(money);
		System.out.println("1、确认  2、重新输入  3、返回菜单");
		System.out.println("请选择：");
		int num = sca.nextInt();
		return num;

	}
	public int saveMoney(User user){
		System.out.println("当前页面：存款");
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入存款金额：");
		double money = sca.nextDouble();
		user.setHalfwayMoney(money);
		System.out.println("1、确认  2、重新输入  3、返回菜单");
		System.out.println("请选择：");
		int num = sca.nextInt();
		return num;

	}
	public boolean theBackCard(){
		System.out.println("当前页面：退卡");
		return false;

	}
}
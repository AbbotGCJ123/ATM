import java.util.Scanner;
public class BusinessProcessing{

	private boolean methodReturns;

	public void setMethodReturns(boolean methodReturns){

		this.methodReturns = methodReturns;
	}

	public boolean getMethodReturns(){

		return methodReturns;
	}

	public void judge(int num){

		Menu menu = new Menu();
		User user = new User();
		boolean bo = true;
		while(bo){
		if (num == 1) {

			setMethodReturns(menu.display(user));

		}else if (num == 2) {
			
			boolean bool = true;
			while(bool){
			int b = menu.transferMoney(user);
			//如果输入的是1再对帐号格式进行判断
			if (b == 1)  {
				//确认
				String cn = user.getCardnum();
				String acn = user.getAccountNumber();
				if (cn.length() == acn.length()) {
					//判断转账帐号长度，合法可以进行转账
					bool = false;
					System.out.println("转账信息：");
					System.out.println("对方帐号：" + acn);
					System.out.println("对方姓名："+ user.getAccountName());
					System.out.println("转账金额："+ user.getHalfwayMoney());
					System.out.println("1、确认转账  2、返回上一级  3、退卡");
					System.out.println("请 核对 转账信息 后选择：");
					Scanner sca = new Scanner(System.in);
					int num1 = sca.nextInt();
					if (num1 == 1) {
						double result = user.getMoney() - user.getHalfwayMoney();
						user.setMoney(result);
						System.out.println("转账成功!!!");
						user.setAccountMoney(user.getAccountMoney() + user.getHalfwayMoney()) ;
					}else if (num1 == 2) {
							bo = false;
							bool = true;
							System.out.println("返回上一级！");
					}else if (num1 == 3) {
						bo = true;
						System.out.println("返回到菜单，退卡！");
					}

				}else{
					bool = true;
					System.out.println("帐号错误！！请从新输入---");
					System.out.println();
				}
			
			}else if (b == 2) {
				//从新输入
				bo = false;
				bool = true;
				System.out.println("从新输入");

			}else if (b == 3) {
				//返回菜单
				bo = true;
				System.out.println("返回菜单");
			}
		}
	}

		else if (num == 3) {
			//取款
			//setMethodReturns(menu.takeTheMoney());
			int number  = menu.takeTheMoney(user);
			if (number == 1) {
				System.out.println("确认");
				if ((user.getMoney() - user.getHalfwayMoney()) >= 0) {
					System.out.println("取款成功");
					double res = user.getMoney() - user.getHalfwayMoney();
					user.setMoney(res);
				}else{
					System.out.println("账户余额不足，无法进行取款操作！请从新输入取款金额----");
				}
				
			}else if (number == 2) {
				System.out.println("从新输入");
			}else if (number == 3) {
				System.out.println("返回菜单");
			}

		}else if (num == 4) {
			//存款
			//setMethodReturns(menu.saveMoney());
			int cnum  = menu.saveMoney(user);
			if (cnum == 1) {
				System.out.println("确认");
				user.setMoney(user.getHalfwayMoney() + user.getMoney());
			}else if (cnum == 2) {
				System.out.println("从新输入");
			}else if (cnum == 3) {
				System.out.println("返回菜单");
			}

		}else if (num == 5) {
			//退出
			setMethodReturns(menu.theBackCard());

		}
		}
	}
}

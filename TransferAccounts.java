import java.util.Scanner;
//转账
//6.转账后 ,370120180104账号的余额要减少,取款后也要减少,存款后增加
// 转账后  在不退出程序的情况要退出当前用户的登陆,使用转账用户登陆
//,并能操作 查询,转账,取款,存款的业务
public class TransferAccounts{
	
	public void transfAccot(User user){
		User secondUser = new User("大猪佩奇","370120180108","123456789",0);
		
		Scanner sca  = new Scanner(System.in);
		MunuBusiness mb = new MunuBusiness();
		boolean b = true;
		while(b){
			System.out.println("请输入对方的银行卡号：");
			String secondUserAccountNumber = sca.next();
			ToolsBusiness tb = new ToolsBusiness();
			//判断对方帐号长度
			boolean bool = tb.verifyAccountNumber(secondUserAccountNumber);
			//bool = true 说明对方账户长度合法
			if(bool){
				System.out.println("可以继续操作");
				//转账可以是小数
				System.out.println("请输入转账金额：");
				double sendMoney = Double.valueOf(sca.next());
				//判断转账金额是否 小于账户余额
				boolean sendMoneyBool = tb.isNotSufficientFunds(user,sendMoney);
				//sendMoneyBool = true 说明 可以继续转账 
				if(sendMoneyBool){
					System.out.println("可以继续转账");
					System.out.println("1、确认  2、重新输入  3、返回菜单");
					int num = Integer.parseInt(sca.next());
					if(num == 1){
						System.out.println("对方帐号：" + secondUser.getAccountNumber());
						System.out.println("对方用户名：" + secondUser.getUsername());
						System.out.println("转账金额：" + sendMoney + "RMB");
						System.out.println("1、确认转账  2、返回上一级  3、返回菜单");
						int nextnum = Integer.parseInt(sca.next());
						if(nextnum == 1 ){
							//转账用户钱 - 输入的转账金额
							user.setMoney(user.getMoney() - sendMoney);
							//接收转账的用户 钱 + 输入的转账金额 
							secondUser.setMoney(secondUser.getMoney() + sendMoney);
							System.out.println("转账成功");
							//操作成功后返回到菜单
							
							mb.munu(user);
							b = false;
						}else if(nextnum == 2){
							System.out.println("返回上一层");
							transfAccot(user);
							//b = true;
							
						}else if(nextnum == 3){
							
							int a = mb.munu(user);
						}
					}else if(num == 2){
						transfAccot(user);
					}else if(num == 3){
						//返回菜单
						
						int c = mb.munu(user);
					}
					b = false;  
				}else{
					b = true;
					System.out.println("转账金额超出当前用户余额，请从新操作");
				}
				
			}else{
				b = false;
				System.out.println("对方账号不合法，请从新输入");
			}
		}
	}
}
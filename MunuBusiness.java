
import java.util.Scanner;
//菜单

public class MunuBusiness{
	
	public int munu(User user){
		System.out.println("1、查询  2、转账  3、取款  4、存款  5、退卡");
		Scanner sca = new Scanner(System.in);
		int num = Integer.parseInt(sca.next());
		if(num == 1){
			//查询
			QueryBusiness qb = new QueryBusiness();
			qb.query(user);
			
		}else if(num == 2){
			//2、转账
			TransferAccounts ta = new TransferAccounts();
			ta.transfAccot(user);
			
			/*
			boolean b = true;
			while(b){
				System.out.println("请输入对方的银行卡号：");
				String user2AccountNumber = sca.next();
				ToolsBusiness tb = new ToolsBusiness();
				//判断对方帐号长度
				boolean bool = tb.verifyAccountNumber(user2AccountNumber);
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
						System.out.println("1、确认  2、返回上一级  3、返回菜单");
						
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
			*/
		}else if(num == 3){
			//3、取款
			WithdrawalBusiness wd = new WithdrawalBusiness();
			wd.widthdrawal(user);
			/*
			boolean b = true;
			while(b){
				System.out.println("请输入要取款的金额：");
				int fetchMoney = Integer.parseInt(sca.next());
				ToolsBusiness tb = new ToolsBusiness();
				//判断输入的取款数目是否是100的倍数   是
				if(tb.verifyMulriple(fetchMoney)){
					System.out.println("满足100的倍数");
					//判断取款金额是否高于余额  true 说明 不是余额不足 可以继续取款
					if(tb.isNotSufficientFunds(user,fetchMoney)){
						System.out.println("余额充足可以取款");
						WithdrawalBusiness wb = new WithdrawalBusiness();
						wd.widthdrawal(user,fetchMoney);
						b = false;
					}else{
						b = true;
						System.out.println("余额不足，请从新输入取款金额！");
					}
				}else{
					System.out.println("输入的取款金额不合法，请从新输入！");
					b = true;
				}
			}
			*/
		}else if(num == 4){
			//4、存款
			DepositBusiness db = new DepositBusiness();
			db.deposit(user);
			/*
			boolean b = true;
			while(b){
				System.out.println("请输入要存入的金额：");
				int moneyNum = Integer.parseInt(sca.next());
				ToolsBusiness tb = new ToolsBusiness();
				if(tb.verifyMulriple(moneyNum)){
					System.out.println("存入金额满足 100 的倍数");
					DepositBusiness db = new DepositBusiness();	
					db.deposit(user,moneyNum);
					b = false;
				}else{
					b = true;
					System.out.println("存入金额不合法，请从新输入要存入的金额！");
				}
			}
			*/
		}else if(num == 5){
			//5、退卡
			ProcessControl pc = new ProcessControl();
			pc.startATM(user);
		}else{
			System.out.println("选择错误");
		}
		return num;
	}
}
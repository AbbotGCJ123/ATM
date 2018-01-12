
import java.util.Scanner;
//取款 
public class WithdrawalBusiness{

	//确定取款
	//自动转换byte→short(char)→int→long→float→double
	/*
	public void widthdrawal(User user,int fetchMoney){
		double getmoney = user.getMoney();
		double setmoney = getmoney - fetchMoney;
		user.setMoney(setmoney);
	}
	*/
	public void widthdrawal(User user){
		Scanner sca = new Scanner(System.in);
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
					double getmoney = user.getMoney();
					double setmoney = getmoney - fetchMoney;
					user.setMoney(setmoney);
					System.out.println("取款成功，返回菜单");
					
					MunuBusiness mb = new MunuBusiness();
					int a = mb.munu(user);
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
	}
}
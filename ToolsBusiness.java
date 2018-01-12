//工具类
public class ToolsBusiness{
	//存款取款都是100的倍数
	//验证输入的取款数是否是100的倍数
	public boolean verifyMulriple(int fetchMoney){
		boolean bool = false;
		if(fetchMoney % 100 == 0){
			bool = true;
		}else{
			bool = false;
		}
		return bool;
	}
	//验证取款的金额是否比余额大
	public boolean isNotSufficientFunds(User user,double fetchMoney){
		boolean bool = false;
		if(fetchMoney<=user.getMoney()){
			bool = true;
		}else{
			bool = false;
		}
		return bool;
	}
	//账号长度验证
	public boolean verifyAccountNumber(String accountNumber){
		boolean bool = false;
		if(accountNumber.length() == 12){
			bool = true;
		}else{
			bool = false;
		}
		return bool;
	}
	//用户名是否存在验证
	public boolean accountNumberIsExist(User user,String accountNumber){
		System.out.println(accountNumber);
		System.out.println(user.getAccountNumber());
		boolean bool = false;
		if(accountNumber.equals(user.getAccountNumber())){
			bool = true;
		}else{
			bool = false;
		}
		return bool;
	}
	//验证密码是否跟初始化对象的时候密码一样
	public boolean verifyPassword(User user,String password){
		boolean bool = false;
		if(password.equals(user.getPassword())){
			bool = true;
		}else{
			bool = false;
		}
		return bool;
	}
}
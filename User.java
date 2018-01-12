

//用户

public class User{
	//用户名
	private String username;
	//账号
	private String accountNumber;
	//密码
	private String password;
	//初始金额
	private double money;
	//有参构造，在创建对象的时候传递一个用户
	User(String username,String accountNumber,String password,double money){
		this.username = username;
		this.accountNumber  = accountNumber;
		this.password = password;
		this.money = money;
	}
	public String getUsername(){
		return username;
	}
	public String getAccountNumber(){
		return accountNumber;
	}
	public String getPassword(){
		return password;
	}
	public double getMoney(){
		return money;
	}
	public void setMoney(double money){
		this.money  = money;
	}

	/*
	//用户名是否存在验证
	public boolean accountNumberIsExist(User user,String accountNumber){
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
	*/
}
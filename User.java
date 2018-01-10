public class User{
	
	private String cardnum = "370120180104";//µ±Ç°ÓÃ»§ÕÊºÅ
	private String pwd = "123456";//µ±Ç°ÓÃ»§ÃÜÂë
	private String name = "小猪";//µ±Ç°ÓÃ»§Ãû
	private double money = 1000;//µ±Ç°ÕË»§Óà¶î

	private String accountNumber = null;
	private String accountName = "大猪佩奇";
	private double accountMoney = 0;
	private double halfwayMoney = 0;
	
	public String getCardnum(){
		return cardnum;
	}
	public String getPwd(){
		return pwd;
	}
	public String getName(){
		return name;
	}
	public double getMoney(){
		return money;
	}
	public void setMoney(double money){
		this.money = money;
	}

	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	public String getAccountNumber(){
		return accountNumber;
	}

	public void setAccountName(String accountName){
		this.accountName = accountName;
	}
	public String getAccountName(){
		return accountName;
	}

	public void setAccountMoney(double accountMoney){
		this.accountMoney = accountMoney;
	}
	public double getAccountMoney(){
		return accountMoney;
	}

	public void setHalfwayMoney(double halfwayMoney){
		this.halfwayMoney = halfwayMoney;
	}
	public double getHalfwayMoney(){
		return halfwayMoney;
	}
}
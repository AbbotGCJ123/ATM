

//�û�

public class User{
	//�û���
	private String username;
	//�˺�
	private String accountNumber;
	//����
	private String password;
	//��ʼ���
	private double money;
	//�вι��죬�ڴ��������ʱ�򴫵�һ���û�
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
	//�û����Ƿ������֤
	public boolean accountNumberIsExist(User user,String accountNumber){
		boolean bool = false;
		if(accountNumber.equals(user.getAccountNumber())){
			bool = true;
		}else{
			bool = false;
		}
		return bool;
	}
	//��֤�����Ƿ����ʼ�������ʱ������һ��
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
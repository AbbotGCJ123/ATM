//������
public class ToolsBusiness{
	//���ȡ���100�ı���
	//��֤�����ȡ�����Ƿ���100�ı���
	public boolean verifyMulriple(int fetchMoney){
		boolean bool = false;
		if(fetchMoney % 100 == 0){
			bool = true;
		}else{
			bool = false;
		}
		return bool;
	}
	//��֤ȡ��Ľ���Ƿ������
	public boolean isNotSufficientFunds(User user,double fetchMoney){
		boolean bool = false;
		if(fetchMoney<=user.getMoney()){
			bool = true;
		}else{
			bool = false;
		}
		return bool;
	}
	//�˺ų�����֤
	public boolean verifyAccountNumber(String accountNumber){
		boolean bool = false;
		if(accountNumber.length() == 12){
			bool = true;
		}else{
			bool = false;
		}
		return bool;
	}
	//�û����Ƿ������֤
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
}
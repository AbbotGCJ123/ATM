public class LandVerification{

	//�жϵ�½
	public boolean landing(String cardNumber,String password,User user){
		
		//�ж��˻�����
		if (cardNumber.equals(user.getCardnum()) &&  password.equals(user.getPwd()) ) {
			return true;
		}else{
			return false;
		}
	}
}
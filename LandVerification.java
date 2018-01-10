public class LandVerification{

	//ÅĞ¶ÏµÇÂ½
	public boolean landing(String cardNumber,String password,User user){
		
		//ÅĞ¶ÏÕË»§ÃÜÂë
		if (cardNumber.equals(user.getCardnum()) &&  password.equals(user.getPwd()) ) {
			return true;
		}else{
			return false;
		}
	}
}
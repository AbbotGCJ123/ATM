
//Á÷³Ì¿ØÖÆ

public class ProcessControl{
	
	public void startATM(User user){
		LoginBusiness lb = new LoginBusiness();
		boolean b = true;
		while(b){
			
			boolean bool = lb.login(user);
			if(bool){
				MunuBusiness mb = new MunuBusiness();
				int num = mb.munu(user);
				if(num == 5){
					continue;
				}
				b = false;
			}else{
				b = true; 
			}
		}
	}
}

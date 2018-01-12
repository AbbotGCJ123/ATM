import java.util.Scanner;
//登陆
public class LoginBusiness{
	
	public boolean login(User user){
		boolean result  = false;
		boolean bool  = true;
		while(bool){
			System.out.println("请输入账号：");
			boolean accountNumberBool = true;
			while(accountNumberBool){
				Scanner sca = new Scanner(System.in);
				String accountNumber = sca.next();
				ToolsBusiness tb = new ToolsBusiness();
				//判断账号长度
				if(tb.verifyAccountNumber(accountNumber)){
					//判断这个账号是否正确
					if(tb.accountNumberIsExist(user,accountNumber)){
						System.out.println("请输入密码：");
						boolean passwordBool = true;
						while(passwordBool){
							String password = sca.next();
							//账号验证通过后验证密码是否正确
							if(tb.verifyPassword(user,password)){
								accountNumberBool = false;
								passwordBool = false;
								bool = false;
								result = true;
							}else{
								passwordBool = true;
								System.out.println("密码错误，请从新输入：");
							}
						}
					}else{
						accountNumberBool = true;
						System.out.println("账号错误，请从新输入：");
					}
				}else{
					bool = true;
					System.out.println("账号长度不合法，请重新输入！");
				}
			}
		}
		return result;
	}
}
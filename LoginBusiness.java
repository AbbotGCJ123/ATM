import java.util.Scanner;
//��½
public class LoginBusiness{
	
	public boolean login(User user){
		boolean result  = false;
		boolean bool  = true;
		while(bool){
			System.out.println("�������˺ţ�");
			boolean accountNumberBool = true;
			while(accountNumberBool){
				Scanner sca = new Scanner(System.in);
				String accountNumber = sca.next();
				ToolsBusiness tb = new ToolsBusiness();
				//�ж��˺ų���
				if(tb.verifyAccountNumber(accountNumber)){
					//�ж�����˺��Ƿ���ȷ
					if(tb.accountNumberIsExist(user,accountNumber)){
						System.out.println("���������룺");
						boolean passwordBool = true;
						while(passwordBool){
							String password = sca.next();
							//�˺���֤ͨ������֤�����Ƿ���ȷ
							if(tb.verifyPassword(user,password)){
								accountNumberBool = false;
								passwordBool = false;
								bool = false;
								result = true;
							}else{
								passwordBool = true;
								System.out.println("���������������룺");
							}
						}
					}else{
						accountNumberBool = true;
						System.out.println("�˺Ŵ�����������룺");
					}
				}else{
					bool = true;
					System.out.println("�˺ų��Ȳ��Ϸ������������룡");
				}
			}
		}
		return result;
	}
}
import java.util.Scanner;

public class Entrance{
	public static void main(String[] args) {
		String cardNumber = null;
		String password = null;
		boolean bool = false;
		boolean b = true; // kong zhi while xun hua
		//ATMqing jing mo ni 
		System.out.println("********* XXX A T M *********");
		Scanner sca = new Scanner(System.in);

		while(b){
			System.out.println("请输入卡号：");
			cardNumber = sca.next();
			System.out.println("请输入密码：");
			password = sca.next();

			LandVerification lvf = new LandVerification();
			User user = new User();
			bool = lvf.landing(cardNumber,password,user);
			if (bool) {
				b=false;
				break;	
			}
			else{
				b=true;
				System.out.println("账号或密码错误，请从新输入。。。");
				}
			}
			if (bool==true) {
				boolean b1 = true;
				while(b1){
					System.out.println("---------------------------------------------");
					System.out.println("1.查询  2.转账  3.取款  4.存款  5.退卡");
					System.out.println("请选择:");
					int num = sca.nextInt();
					BusinessProcessing bp = new BusinessProcessing();
					bp.judge(num);
					if (bp.getMethodReturns() == false) {
						b1 = false;
						break;
					}
				}
			}
		}
	}
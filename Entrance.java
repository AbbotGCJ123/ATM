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
			System.out.println("�����뿨�ţ�");
			cardNumber = sca.next();
			System.out.println("���������룺");
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
				System.out.println("�˺Ż����������������롣����");
				}
			}
			if (bool==true) {
				boolean b1 = true;
				while(b1){
					System.out.println("---------------------------------------------");
					System.out.println("1.��ѯ  2.ת��  3.ȡ��  4.���  5.�˿�");
					System.out.println("��ѡ��:");
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

import java.util.Scanner;
//ȡ�� 
public class WithdrawalBusiness{

	//ȷ��ȡ��
	//�Զ�ת��byte��short(char)��int��long��float��double
	/*
	public void widthdrawal(User user,int fetchMoney){
		double getmoney = user.getMoney();
		double setmoney = getmoney - fetchMoney;
		user.setMoney(setmoney);
	}
	*/
	public void widthdrawal(User user){
		Scanner sca = new Scanner(System.in);
		boolean b = true;
		while(b){
			System.out.println("������Ҫȡ��Ľ�");
			int fetchMoney = Integer.parseInt(sca.next());
			ToolsBusiness tb = new ToolsBusiness();
			//�ж������ȡ����Ŀ�Ƿ���100�ı���   ��
			if(tb.verifyMulriple(fetchMoney)){
				System.out.println("����100�ı���");
				//�ж�ȡ�����Ƿ�������  true ˵�� �������� ���Լ���ȡ��
				if(tb.isNotSufficientFunds(user,fetchMoney)){
					System.out.println("���������ȡ��");
					double getmoney = user.getMoney();
					double setmoney = getmoney - fetchMoney;
					user.setMoney(setmoney);
					System.out.println("ȡ��ɹ������ز˵�");
					
					MunuBusiness mb = new MunuBusiness();
					int a = mb.munu(user);
					b = false;
				}else{
					b = true;
					System.out.println("���㣬���������ȡ���");
				}
			}else{
				System.out.println("�����ȡ����Ϸ�����������룡");
				b = true;
			}
		}
	}
}
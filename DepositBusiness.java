
import java.util.Scanner;
//���

public class DepositBusiness {
	//ȷ������
	/*
	public void deposit(User user,int moneyNum){

		user.setMoney(user.getMoney() + moneyNum);
	}
	*/
	public void deposit(User user){
		Scanner sca = new Scanner(System.in);
		boolean b = true;
		while(b){
			System.out.println("������Ҫ����Ľ�");
			int moneyNum = Integer.parseInt(sca.next());
			ToolsBusiness tb = new ToolsBusiness();
			if(tb.verifyMulriple(moneyNum)){
				System.out.println("���������� 100 �ı���,���Դ��");
				user.setMoney(user.getMoney() + moneyNum);
				
				System.out.println("����ɹ����������ز˵�");
				MunuBusiness mb = new MunuBusiness();
				int a = mb.munu(user);
				b = false;
			}else{
				b = true;
				System.out.println("������Ϸ������������Ҫ����Ľ�");
			}
		}
	}
}
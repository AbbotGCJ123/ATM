
import java.util.Scanner;
//�˵�

public class MunuBusiness{
	
	public int munu(User user){
		System.out.println("1����ѯ  2��ת��  3��ȡ��  4�����  5���˿�");
		Scanner sca = new Scanner(System.in);
		int num = Integer.parseInt(sca.next());
		if(num == 1){
			//��ѯ
			QueryBusiness qb = new QueryBusiness();
			qb.query(user);
			
		}else if(num == 2){
			//2��ת��
			TransferAccounts ta = new TransferAccounts();
			ta.transfAccot(user);
			
			/*
			boolean b = true;
			while(b){
				System.out.println("������Է������п��ţ�");
				String user2AccountNumber = sca.next();
				ToolsBusiness tb = new ToolsBusiness();
				//�ж϶Է��ʺų���
				boolean bool = tb.verifyAccountNumber(user2AccountNumber);
				//bool = true ˵���Է��˻����ȺϷ�
				if(bool){
					System.out.println("���Լ�������");
					//ת�˿�����С��
					System.out.println("������ת�˽�");
					double sendMoney = Double.valueOf(sca.next());
					//�ж�ת�˽���Ƿ� С���˻����
					boolean sendMoneyBool = tb.isNotSufficientFunds(user,sendMoney);
					//sendMoneyBool = true ˵�� ���Լ���ת�� 
					if(sendMoneyBool){
						System.out.println("���Լ���ת��");
						System.out.println("1��ȷ��  2��������һ��  3�����ز˵�");
						
						b = false;  
					}else{
						b = true;
						System.out.println("ת�˽�����ǰ�û�������²���");
					}
					
				}else{
					b = false;
					System.out.println("�Է��˺Ų��Ϸ������������");
				}
			}
			*/
		}else if(num == 3){
			//3��ȡ��
			WithdrawalBusiness wd = new WithdrawalBusiness();
			wd.widthdrawal(user);
			/*
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
						WithdrawalBusiness wb = new WithdrawalBusiness();
						wd.widthdrawal(user,fetchMoney);
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
			*/
		}else if(num == 4){
			//4�����
			DepositBusiness db = new DepositBusiness();
			db.deposit(user);
			/*
			boolean b = true;
			while(b){
				System.out.println("������Ҫ����Ľ�");
				int moneyNum = Integer.parseInt(sca.next());
				ToolsBusiness tb = new ToolsBusiness();
				if(tb.verifyMulriple(moneyNum)){
					System.out.println("���������� 100 �ı���");
					DepositBusiness db = new DepositBusiness();	
					db.deposit(user,moneyNum);
					b = false;
				}else{
					b = true;
					System.out.println("������Ϸ������������Ҫ����Ľ�");
				}
			}
			*/
		}else if(num == 5){
			//5���˿�
			ProcessControl pc = new ProcessControl();
			pc.startATM(user);
		}else{
			System.out.println("ѡ�����");
		}
		return num;
	}
}
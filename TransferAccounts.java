import java.util.Scanner;
//ת��
//6.ת�˺� ,370120180104�˺ŵ����Ҫ����,ȡ���ҲҪ����,��������
// ת�˺�  �ڲ��˳���������Ҫ�˳���ǰ�û��ĵ�½,ʹ��ת���û���½
//,���ܲ��� ��ѯ,ת��,ȡ��,����ҵ��
public class TransferAccounts{
	
	public void transfAccot(User user){
		User secondUser = new User("��������","370120180108","123456789",0);
		
		Scanner sca  = new Scanner(System.in);
		MunuBusiness mb = new MunuBusiness();
		boolean b = true;
		while(b){
			System.out.println("������Է������п��ţ�");
			String secondUserAccountNumber = sca.next();
			ToolsBusiness tb = new ToolsBusiness();
			//�ж϶Է��ʺų���
			boolean bool = tb.verifyAccountNumber(secondUserAccountNumber);
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
					System.out.println("1��ȷ��  2����������  3�����ز˵�");
					int num = Integer.parseInt(sca.next());
					if(num == 1){
						System.out.println("�Է��ʺţ�" + secondUser.getAccountNumber());
						System.out.println("�Է��û�����" + secondUser.getUsername());
						System.out.println("ת�˽�" + sendMoney + "RMB");
						System.out.println("1��ȷ��ת��  2��������һ��  3�����ز˵�");
						int nextnum = Integer.parseInt(sca.next());
						if(nextnum == 1 ){
							//ת���û�Ǯ - �����ת�˽��
							user.setMoney(user.getMoney() - sendMoney);
							//����ת�˵��û� Ǯ + �����ת�˽�� 
							secondUser.setMoney(secondUser.getMoney() + sendMoney);
							System.out.println("ת�˳ɹ�");
							//�����ɹ��󷵻ص��˵�
							
							mb.munu(user);
							b = false;
						}else if(nextnum == 2){
							System.out.println("������һ��");
							transfAccot(user);
							//b = true;
							
						}else if(nextnum == 3){
							
							int a = mb.munu(user);
						}
					}else if(num == 2){
						transfAccot(user);
					}else if(num == 3){
						//���ز˵�
						
						int c = mb.munu(user);
					}
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
	}
}
import java.util.Scanner;
public class BusinessProcessing{

	private boolean methodReturns;

	public void setMethodReturns(boolean methodReturns){

		this.methodReturns = methodReturns;
	}

	public boolean getMethodReturns(){

		return methodReturns;
	}

	public void judge(int num){

		Menu menu = new Menu();
		User user = new User();
		boolean bo = true;
		while(bo){
		if (num == 1) {

			setMethodReturns(menu.display(user));

		}else if (num == 2) {
			
			boolean bool = true;
			while(bool){
			int b = menu.transferMoney(user);
			//����������1�ٶ��ʺŸ�ʽ�����ж�
			if (b == 1)  {
				//ȷ��
				String cn = user.getCardnum();
				String acn = user.getAccountNumber();
				if (cn.length() == acn.length()) {
					//�ж�ת���ʺų��ȣ��Ϸ����Խ���ת��
					bool = false;
					System.out.println("ת����Ϣ��");
					System.out.println("�Է��ʺţ�" + acn);
					System.out.println("�Է�������"+ user.getAccountName());
					System.out.println("ת�˽�"+ user.getHalfwayMoney());
					System.out.println("1��ȷ��ת��  2��������һ��  3���˿�");
					System.out.println("�� �˶� ת����Ϣ ��ѡ��");
					Scanner sca = new Scanner(System.in);
					int num1 = sca.nextInt();
					if (num1 == 1) {
						double result = user.getMoney() - user.getHalfwayMoney();
						user.setMoney(result);
						System.out.println("ת�˳ɹ�!!!");
						user.setAccountMoney(user.getAccountMoney() + user.getHalfwayMoney()) ;
					}else if (num1 == 2) {
							bo = false;
							bool = true;
							System.out.println("������һ����");
					}else if (num1 == 3) {
						bo = true;
						System.out.println("���ص��˵����˿���");
					}

				}else{
					bool = true;
					System.out.println("�ʺŴ��󣡣����������---");
					System.out.println();
				}
			
			}else if (b == 2) {
				//��������
				bo = false;
				bool = true;
				System.out.println("��������");

			}else if (b == 3) {
				//���ز˵�
				bo = true;
				System.out.println("���ز˵�");
			}
		}
	}

		else if (num == 3) {
			//ȡ��
			//setMethodReturns(menu.takeTheMoney());
			int number  = menu.takeTheMoney(user);
			if (number == 1) {
				System.out.println("ȷ��");
				if ((user.getMoney() - user.getHalfwayMoney()) >= 0) {
					System.out.println("ȡ��ɹ�");
					double res = user.getMoney() - user.getHalfwayMoney();
					user.setMoney(res);
				}else{
					System.out.println("�˻����㣬�޷�����ȡ����������������ȡ����----");
				}
				
			}else if (number == 2) {
				System.out.println("��������");
			}else if (number == 3) {
				System.out.println("���ز˵�");
			}

		}else if (num == 4) {
			//���
			//setMethodReturns(menu.saveMoney());
			int cnum  = menu.saveMoney(user);
			if (cnum == 1) {
				System.out.println("ȷ��");
				user.setMoney(user.getHalfwayMoney() + user.getMoney());
			}else if (cnum == 2) {
				System.out.println("��������");
			}else if (cnum == 3) {
				System.out.println("���ز˵�");
			}

		}else if (num == 5) {
			//�˳�
			setMethodReturns(menu.theBackCard());

		}
		}
	}
}

import java.util.Scanner;
//�˵��б�
public class Menu{
	//��ѯҳ��
	public boolean display(User user){
		System.out.println("��ǰҳ�棺��ѯ");
		System.out.println("��ǰ�û���"+user.getName());
		System.out.println("�˻���"+user.getMoney());
		System.out.println("1��������һ��");
		System.out.println("��ѡ��");
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		boolean b = false;
		if (num == 1) {
			b= true;
		}
		return b;
	}
	public int transferMoney(User user){
		System.out.println("��ǰҳ�棺ת��");
		Scanner sca = new Scanner(System.in);
		System.out.println("������Է����п��ţ�");
		String forCardnum = sca.next();
		user.setAccountNumber(forCardnum);
		System.out.println("����ת�˽�");
		double forMoney = sca.nextDouble();
		user.setHalfwayMoney(forMoney);

		System.out.println("1��ȷ��  2����������  3�����ز˵�");
		System.out.println("��ѡ��");
		int num = sca.nextInt();
		return num;
	}
	public int takeTheMoney(User user){
		System.out.println("��ǰҳ�棺ȡ��");
		Scanner sca = new Scanner(System.in);
		System.out.println("������ȡ���");
		double money = sca.nextDouble();
		user.setHalfwayMoney(money);
		System.out.println("1��ȷ��  2����������  3�����ز˵�");
		System.out.println("��ѡ��");
		int num = sca.nextInt();
		return num;

	}
	public int saveMoney(User user){
		System.out.println("��ǰҳ�棺���");
		Scanner sca = new Scanner(System.in);
		System.out.println("���������");
		double money = sca.nextDouble();
		user.setHalfwayMoney(money);
		System.out.println("1��ȷ��  2����������  3�����ز˵�");
		System.out.println("��ѡ��");
		int num = sca.nextInt();
		return num;

	}
	public boolean theBackCard(){
		System.out.println("��ǰҳ�棺�˿�");
		return false;

	}
}

import java.util.Scanner;
//��ѯ

public class QueryBusiness{
	public void query(User user){
		System.out.println("�û�����" + user.getUsername());
		System.out.println("��" + user.getMoney());
		System.out.println("1��������һ��");
		Scanner sca = new Scanner(System.in);
		int num = Integer.parseInt(sca.next());
		if(num == 1){
			MunuBusiness mb = new MunuBusiness();
			mb.munu(user);
		}else{
			System.out.println("ѡ�����");
		}
	}
}
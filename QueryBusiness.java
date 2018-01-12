
import java.util.Scanner;
//查询

public class QueryBusiness{
	public void query(User user){
		System.out.println("用户名：" + user.getUsername());
		System.out.println("余额：" + user.getMoney());
		System.out.println("1、返回上一级");
		Scanner sca = new Scanner(System.in);
		int num = Integer.parseInt(sca.next());
		if(num == 1){
			MunuBusiness mb = new MunuBusiness();
			mb.munu(user);
		}else{
			System.out.println("选择错误！");
		}
	}
}
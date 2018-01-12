
public class Test{
	public static void main(String[] args){
		User user = new User("–°÷Ì≈Â∆Ê","370120180104","123456",1000);

		ProcessControl pc = new ProcessControl();
		pc.startATM(user);
	}
}
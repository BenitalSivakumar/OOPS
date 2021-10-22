package oopsAssignments;
public class AxisBank extends Bankinfo  {
	@Override
	public void deposit() {
		System.out.println("Deposit from child");
	}
	
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
		
	}
}
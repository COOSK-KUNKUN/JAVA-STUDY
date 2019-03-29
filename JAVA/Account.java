public class Account{

	private String actno;
	private double balance;

	public Account(){
		System.out.println("Account 的无参数构造方法");
	}

	public Account(String actno, double balance){
		this.actno = actno;
		this.balance = balance;
	}

	public void setActno(String actno){
		this.actno = actno;
	}

	public String getActno(){
		return actno;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public String getBalance(){
		return actno;
	}
}
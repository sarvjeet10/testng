package exception;

public class Account {
	private int bal;
	public Account(int bal){
		this.bal=bal;
	}
	public int getbalance(){
		return bal;
	}
	public void deposit(int amt){
		bal+=amt;
	}
	
	/**
	 * 
	 * @param amt
	 * @throws insufficientbalanceexception
	 */
	public void withdraw(int amt) throws insufficientbalanceexception{
		if(bal>=amt){
			bal-=amt;
		}
		else{
			String s="Alert insufficient balance";
			throw new insufficientbalanceexception(s);
		}
	}

}

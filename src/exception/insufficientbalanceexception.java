package exception;

public class insufficientbalanceexception extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String errmsg;
	insufficientbalanceexception(String errmsg){
		this.errmsg=errmsg;
	}
	public String getMessage(){
		return errmsg;
	}

}

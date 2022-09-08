package Demo;

public class Amt {
	
	Integer balance;
	
	
	
	
	 public Integer getBalance() {
		return balance;
	}




	public void setBalance(Integer balance) {
		this.balance = balance;
	}




	public static void main(String args[]){  
		
		Amt amount = new Amt();
		amount.setBalance(1000);
		Integer c =amount.getBalance();
		System.out.println(c);
		
		
		 
		 
		 
	 }
	

	}
	


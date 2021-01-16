package exception_handling;

class Amount{
	String currency;
	int amount;
	public Amount(String currency, int amount) {
		this.currency=currency;
		this.amount=amount;
	}
	
	void add_amount(Amount other_amount) throws Exception {
		if(!this.currency.equalsIgnoreCase(other_amount.currency)) {
			throw new Exception("Currency mismatch: "+this.currency+" & "+other_amount.currency);
		}
		System.out.println(this.amount+other_amount.amount);
	}
	
	@Override
	public String toString() {
		return currency+" "+amount;
	}
}
public class Demo_handle_exception {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Amount amount1=new Amount("USD", 20);
		Amount amount2=new Amount("EUR", 15);
		amount1.add_amount(amount2);
	}

}

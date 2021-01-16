package exception_handling;
class Amount_demo{
	String currency;
	int amount;
	public Amount_demo(String currency, int amount) {
		this.currency=currency;
		this.amount=amount;
	}
	
	void add_amount(Amount_demo other_amount) throws Exception {
		if(!this.currency.equalsIgnoreCase(other_amount.currency)) {
			throw new Currency_do_not_match("Currency mismatch: "+this.currency+" & "+other_amount.currency);
		}
		System.out.println(this.amount+other_amount.amount);
	}
	
	@Override
	public String toString() {
		return currency+" "+amount;
	}
}

class Currency_do_not_match extends Exception{
	Currency_do_not_match(String msg){
		super(msg);
	}
}
public class Custom_exception {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Amount_demo amt1=new Amount_demo("USD", 15);
		Amount_demo amt2=new Amount_demo("EUR", 20);
		amt1.add_amount(amt2);
			
	}

}

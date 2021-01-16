package udemy_java;

public class CharecterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChar charecter= new MyChar('z');
		System.out.println("check vowel: "+charecter.check_owel());
		System.out.println("check number: "+charecter.check_number());
		System.out.println("check alphabet: "+charecter.check_alphabet());
		System.out.println("check consonent: "+charecter.check_consonent());
//		System.out.println("all lowecase: "+charecter.all_lowercase(););
		charecter.all_lowercase();
		charecter.all_uppercase();
	}

}

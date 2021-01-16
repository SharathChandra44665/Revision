package udemy_java;

public class MyChar {
	char ch;
	public MyChar(char ch) {
		this.ch=ch;
	}
	
	boolean check_owel() {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			return true;
		}
		return false;
	}
	boolean check_number() {
		if(ch>=48 && ch<=57) {
			return true;
		}
		return false;
	}
	boolean check_alphabet() {
		if((ch>=97 && ch<=122) ||(ch>=65 && ch<=90))
			return true;
		return false;
	}
	
	boolean check_consonent() {
		//should be alphabet but not vowel
		if(check_alphabet() && !check_owel()) {
			return true;
		}
		return false;
	}
	
	void all_lowercase() {
		for(ch='a';ch<='z';ch++) {
			System.out.print(ch+"\t");
		}System.out.println();
	}
	void all_uppercase() {
		for(ch='A';ch<='Z';ch++) {
			System.out.print(ch+"\t");
			
		}System.out.println();
	}
}

package javaRev;

public class ExceptionHandlingDemo2 {
	static void validateAge(int age) throws Exception  {
		if(age<18) {
//			throw new Exception("cannot accept");
			throw new Error();
		}else {
			System.out.println("age: "+age+" is accepted");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
			validateAge(13);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		
	}

}

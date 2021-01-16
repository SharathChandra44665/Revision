package arrays_demo;


public class Days_of_week_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days_of_week= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		Days_of_week_runner obj=new Days_of_week_runner();
		obj.find_longest_string(days_of_week);
		for(int i=days_of_week.length-1;i>=0;i--) {
			System.out.println(days_of_week[i]);
		}
	}
	
	void find_longest_string(String[] week_days) {
		/*
		int[] a=new int[week_days.length];
		int big=0;
		String high_length_string=null;
		for(int i=0;i<week_days.length;i++) {
			a[i]=week_days[i].length();
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]>big) {
				big=a[i];
			}
		}
		for(int i=0;i<week_days.length;i++) {
			if(week_days[i].length()==big) {
				high_length_string=week_days[i];
			}
		}
		System.out.println(high_length_string);
	}*/
		String  bigday="";
		for(String day: week_days) {
			
			if(day.length()>bigday.length()) {
				bigday=day;
			}
		}
		System.out.println(bigday);
		
		
	}
}

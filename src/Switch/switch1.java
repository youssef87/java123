package Switch;

public class switch1 {

	public static void main(String[] args) {
		//we did the int day=10 and the program comes with invalid wee number
		//which means we dont have the day 10.
		//int day=10
		
		int day=5;
		switch (day)
		{
		case 1: System.out.println("sunday");break;
		case 2: System.out.println("monday");break;
		case 3: System.out.println("tuesday");break;
		case 4: System.out.println("wednsday");break;
		case 5: System.out.println("thursday");break;
		case 6: System.out.println("friday");break;
		case 7: System.out.println("saturday");break;
		default: System.out.println("invalid week number");
		
		}
		
		
	}

}

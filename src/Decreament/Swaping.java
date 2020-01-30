package Decreament;

public class Swaping {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		
		System.out.println("before Swapping");
		System.out.println("a is : " +a);
		System.out.println("a is : " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		System.out.println("After Swapping");
		System.out.println("a is : " +a);
		System.out.println("a is : " +b);
		
		
	}

}

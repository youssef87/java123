package jumpingstatments;

public class jumpingstatementdemo2 {

	public static void main(String[] args) {
		
		// the difference between break and continue that break stops in the first number
		// with continue it doesnt show the number in conditions.
	
		
		for(int a=1; a<=10;a++)
		{
			if(a==3 ||a==5||a==7 )
			{
		continue;
			}
			System.out.println(a);

		
		}
	
	}

}



public class ExceptionHandling {

	public static void main(String[] args)  {
 
		int[] num = {1,2,3,4,5};
		int length = 6;		
		
		try {
			for(int i=0;i<length;i++)
			{
				System.out.printf("%d  ",num[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}


public class ArrayExample {
	void displayArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.printf("%d  ",array[i]);
		}
	}

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6,7,8};
		ArrayExample myObj = new ArrayExample();
		myObj.displayArray(array);
		
	}

}


class Parent{
	void parentDisplay()
	{
		System.out.println("This method is passed from class Parent");
	}
}
class Child extends Parent{
	void childDisplay()
	{
		System.out.println("This method is passed from class Child");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		
		Child myObj = new Child();
		myObj.childDisplay();
		myObj.parentDisplay();
	}

}

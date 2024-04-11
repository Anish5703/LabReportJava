
public class StringMethods {

	public static void main(String[] args) {
	
		String fname = "Anish";
		String lname = "Paudel";
		System.out.println("Is fname and lname same? : "+fname.matches(lname));
		System.out.println("String after Concatation : "+fname.concat(lname));
		System.out.println(" Character at Position 3 of fname : "+fname.charAt(2));
		System.out.println("Does fname ends with ish : "+fname.endsWith("ish"));
		System.out.println("Length of fname : "+fname.length());
		System.out.println("Changing Poudel to "+lname.replace('o','a'));
		System.out.println("To UpperCase : "+fname.toUpperCase());
	    
		

	}

}

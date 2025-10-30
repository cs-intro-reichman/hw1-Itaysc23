// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double billAmount = Double.parseDouble(args[3]);
		double eachPays = billAmount / 3;
		double finalPayment = Math.ceil(eachPays);
		String reversedNames = name3 + ", " + name2 + ", and " + name1;
		String outputMessage = "Dear " + reversedNames + ": pay " + finalPayment + " Shekels each.";
		System.out.println(outputMessage);
	}
}

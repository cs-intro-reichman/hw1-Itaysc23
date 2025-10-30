// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentAmount = Integer.parseInt(args[0]);
		double ratePercent = Double.parseDouble(args[1]);
		double rate = ratePercent / 100.0;
		int years = Integer.parseInt(args[2]);
		double futureValue = currentAmount * Math.pow((1 + rate), years);
		System.out.println("After " + years + " years at " + ratePercent + "%, the investment will be worth " + futureValue + " Shekels.");

	}
}
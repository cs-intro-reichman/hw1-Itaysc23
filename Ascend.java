// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * (lim));
		int b = (int)(Math.random() * (lim));
		int c = (int)(Math.random() * (lim));
		int big = Math.max(Math.max(a,b), c); 
		int small = Math.min(Math.min(a,b), c); 
		int i = Math.max(a,b);
		int j = Math.max(b,c);
		int k = Math.max(c,a);
		int mid = Math.min(Math.min(i,j),k);
		System.out.println(a + " " + b + " " + c);
		System.out.println(small + " " + mid + " " + big);
	}
}

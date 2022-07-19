package RecurssionAndBacktracking;

public class L_FindNthFbibonacchiUsingREcurssion {
	public static void main(String[] args) {
		int n =7;
		System.out.println(fib(n));
	}

	private static int fib(int n) {
		if(n<=1)
			return n;
		int last = fib(n-1);
		int slast =fib(n-2);
		return last+slast;
	}
}

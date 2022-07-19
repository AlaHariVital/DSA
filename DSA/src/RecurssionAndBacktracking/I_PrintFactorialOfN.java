package RecurssionAndBacktracking;

public class I_PrintFactorialOfN {
	public static void main(String[] args) {
		int n =4;
		System.out.println(fun(n));
	}

	private static int fun(int n) {
		if(n==1 || n<1)
			return 1;
		return n*fun(n-1);
	}
}

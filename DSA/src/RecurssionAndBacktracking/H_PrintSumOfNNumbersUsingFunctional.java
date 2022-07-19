package RecurssionAndBacktracking;

public class H_PrintSumOfNNumbersUsingFunctional {
	public static void main(String[] args) {
		int n=5;
		System.out.println(fun(n));
	}

	private static int fun(int n) {
		if(n==0)
			return 0;
		return (n+fun(n-1));
	}
}

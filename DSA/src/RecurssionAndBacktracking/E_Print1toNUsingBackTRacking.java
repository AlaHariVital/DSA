//Here we are using backtracking technique.
package RecurssionAndBacktracking;

public class E_Print1toNUsingBackTRacking {
	public static void main(String[] args) {
		int n=5;
		fun(n);
	}

	private static void fun(int n) {
		if(n<=0)
			return;
		fun(n-1);
		System.out.println(n);
	}
}

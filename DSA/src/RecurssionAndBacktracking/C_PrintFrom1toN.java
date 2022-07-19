
package RecurssionAndBacktracking;

public class C_PrintFrom1toN {
	public static void main(String[] args) {
		int n = 5;
		fun(1,n);
	}

	private static void fun(int i, int n) {
		if(i>n)
			return;
		System.out.println(i);
		fun(i+1,n);
	}
}

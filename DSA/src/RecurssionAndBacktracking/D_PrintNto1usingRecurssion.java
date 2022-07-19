
package RecurssionAndBacktracking;

public class D_PrintNto1usingRecurssion {
	public static void main(String[] args) {
		int n =5;
		fun(n);
	}

	private static void fun(int n) {
		if(n==0)
			return;
		System.out.println(n);
		fun(n-1);
	}
	
}

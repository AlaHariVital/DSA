package RecurssionAndBacktracking;

public class A_Print1toNUsingREcurssion {
	public static void main(String[] args) {
		int n = 1;
		fun(n);
	}

	private static void fun(int n) {
		if(n>5)
			return;
		System.out.println(n);
		n++;
		fun(n);
	}
}

package RecurssionAndBacktracking;

public class F_PrintNto1UsingBackTracking {
	public static void main(String[] args) {
		int n=5;
		fun(1,n);
	}

	private static void fun(int i,int n) {
		if(i>n)
			return;
		fun(i+1,n);
		System.out.println(i);
	}
}

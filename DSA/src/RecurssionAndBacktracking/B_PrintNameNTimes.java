package RecurssionAndBacktracking;

public class B_PrintNameNTimes {
	public static void main(String[] args) {
		int n = 5;
		fun(0,n);
	}

	private static void fun(int i, int n) {
		if(i>n)
			return;
		System.out.println("Hari");
		fun(i+1,n);
	}
}

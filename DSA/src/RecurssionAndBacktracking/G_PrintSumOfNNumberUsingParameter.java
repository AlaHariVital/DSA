package RecurssionAndBacktracking;

public class G_PrintSumOfNNumberUsingParameter {
	public static void main(String[] args) {
		int n=5,sum=0;
		fun(n,sum);
	}

	private static void fun(int n, int sum) {
		if(n<1) {
			System.out.println(sum);
			return;
		}
		fun(n-1,sum+n);
	}
}

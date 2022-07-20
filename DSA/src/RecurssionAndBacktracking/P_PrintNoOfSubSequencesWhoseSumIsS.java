package RecurssionAndBacktracking;

public class P_PrintNoOfSubSequencesWhoseSumIsS {
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int Sum=3,S=0;
		System.out.println(fun(0,arr,Sum,S));
	}

	private static int fun(int index,int[] arr, int sum, int s) {
		if(s>sum ) return 0;
		if(index>=arr.length) {
			if(s==sum)
				return 1;
			else
				return 0;
		}
		s+=arr[index];
		int l =fun(index+1, arr, sum, s);
		s-=arr[index];
		int r = fun(index+1, arr, sum, s);
		return l+r;
	}
}

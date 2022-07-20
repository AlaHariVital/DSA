package RecurssionAndBacktracking;

import java.util.ArrayList;

public class O_PrintOneSubSequenceWhoseSumIsS {
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int sum=4;
		ArrayList<Integer> ans = new ArrayList<>();
		find(0,arr,sum,ans,0);
		for(int i:ans) {
			System.out.print(i);
		}
	}

	private static boolean find(int index,int[] arr, int sum, ArrayList<Integer> ans, int S) {
		if(index>=arr.length) {
			if(S==sum) 
				return true;
			else 
				return false;
		}
		ans.add(arr[index]);
		S+=arr[index];
		if(find(index+1, arr, sum, ans, S))
			return true;
		ans.remove(ans.size()-1);
		S-=arr[index];
		if(find(index+1, arr, sum, ans, S))
			return true;
		return false;
	}
}

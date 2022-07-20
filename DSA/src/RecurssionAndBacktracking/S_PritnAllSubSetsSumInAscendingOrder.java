//Here we will find sum of each and every subset and we will return sums in ascending order.
package RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.Collections;

public class S_PritnAllSubSetsSumInAscendingOrder {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		ArrayList<Integer> ans = new ArrayList<>();
		fun(0,arr,0,ans);
		Collections.sort(ans);;
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}

	private static void fun(int i, int[] arr, int sum, ArrayList<Integer> ans) {
		if(i>=arr.length) {
			ans.add(sum);
			return;
		}
		//Pick the element
		fun(i+1, arr, sum+arr[i], ans);
		//do not pick the element.
		fun(i+1, arr, sum, ans);
	}
}

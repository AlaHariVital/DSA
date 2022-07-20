//find combinations whose sum forms S.
//we can pick an element any no of times and and form a combination
//	 {2,3,6,7}
//	Target Sum is 7
//	Combinations that form are
//	{2,2,3},{7}


package RecurssionAndBacktracking;

import java.util.ArrayList;

public class Q_FindCombinationWhoseSumIsS {
	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		int target = 7;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		find(0,arr,target,new ArrayList<Integer>(),ans);
		for(ArrayList<Integer> i:ans) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void find(int i, int[] arr, int target, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {
		if(i>=arr.length) {
			if(target==0) {
				ans.add(new ArrayList<>(temp));
				return;
			}
			return;
		}
		
		if(arr[i]<=target) {
			temp.add(arr[i]);
			target-=arr[i];
			find(i, arr, target, temp, ans);
			target+=arr[i];
			temp.remove(temp.size()-1);
		}
		find(i+1, arr, target, temp, ans);
	}
}

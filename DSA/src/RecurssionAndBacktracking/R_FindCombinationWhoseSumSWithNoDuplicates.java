//Here combinations need to find without duplicate combinations 
//i.e two similar elements must not be considered as different
//	[10,1,2,7,6,1,5] with target sum 4.
//	[[1,1,6],[1,2,5],[1,7],[2,6]]
//Another condition here is,an element need to be picked only once.



package RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;

public class R_FindCombinationWhoseSumSWithNoDuplicates {
	public static void main(String[] args) {
		int[] arr= {10,1,2,7,6,1,5};
		int target = 8;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		//We need to sort the array to find the combinations,so that we can identify if two elements are same easily
		Arrays.sort(arr);
		find(0,arr,target,new ArrayList<Integer>(),ans);
		for(ArrayList<Integer> i:ans) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void find(int i, int[] arr,int target, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {
		
		if(target==0) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		for(int index =i;index<arr.length;index++) {
			if(i<index && arr[index]==arr[index-1])
				continue;
			if(target>=arr[index]) 
				break;
			temp.add(arr[index]);
			find(index+1, arr, target-arr[index], temp, ans);
			temp.remove(temp.size()-1);
		}
	}
}

package RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;

public class T_PrintAllSubSetsWithoutDuplicateSubsets {
	public static void main(String[] args) {
		int[] arr = {1,2,2};
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		Arrays.sort(arr);
		
		fun(0,arr,new ArrayList<>(),ans);
		for(ArrayList<Integer> i:ans) {
			System.out.println(i);
		}
	}

	private static void fun(int index, int[] arr, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {
//		if(index>=arr.length) {
//			ans.add(new ArrayList<>(temp));
//			return;
//		}
		ans.add(new ArrayList<>(temp));
		for(int i=index;i<arr.length;i++) {
			if(i!=index && arr[i]==arr[i-1]) continue;
			temp.add(arr[i]);
			fun(i+1, arr, temp, ans);
			temp.remove(temp.size()-1);
		}
	}
}

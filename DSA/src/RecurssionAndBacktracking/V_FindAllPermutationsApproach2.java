//It is optimized solution to find all permutations.
package RecurssionAndBacktracking;

import java.util.ArrayList;

public class V_FindAllPermutationsApproach2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		fun(0,arr,ans);
		for(ArrayList<Integer> i : ans) {
			System.out.println(i);
		}
	}

	private static void fun(int index, int[] arr, ArrayList<ArrayList<Integer>> ans) {
		if(index==arr.length) {
			ArrayList<Integer> temp = new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
				temp.add(arr[i]); 
			}
			ans.add(new ArrayList<>(temp));
			return;
		}
		for(int i=index;i<arr.length;i++) {
			swap(arr,index,i);
			fun(index+1, arr, ans);
			swap(arr,index,i);
		}
	}

	private static void swap(int[] arr, int i, int x) {
		int temp= arr[i];
		arr[i]=arr[x];
		arr[x]=temp;
	}
}

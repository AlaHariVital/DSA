//Here we are using no extra spaces to find the permutations ,we are using the same array
//Here we are finding the Permutations for given array with less space complexity.

package RecurssionAndBacktracking;

import java.util.ArrayList;

public class W_AllPermutationsWithLessSpaceComplexity {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		Solution22 obj = new Solution22();
		ArrayList<ArrayList<Integer>> ans = obj.permutations(arr);
		for( ArrayList<Integer> a : ans ) {
			for(int b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}

class Solution22{
	public ArrayList<ArrayList<Integer>> permutations(int[] arr) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		findPermutations(0,arr,ans);
		return ans;
	}
	private void findPermutations(int index, int[] arr, ArrayList<ArrayList<Integer>> ans) {
		if(index == arr.length) {
			ArrayList<Integer> temp = new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
				temp.add(arr[i]);
			}
			ans.add(new ArrayList<>(temp));
			return;
		}
		for(int i=index;i<arr.length;i++) {
			swap(i,index,arr);
			findPermutations(index+1, arr, ans);
			swap(i,index,arr);
		}
	}
	private void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

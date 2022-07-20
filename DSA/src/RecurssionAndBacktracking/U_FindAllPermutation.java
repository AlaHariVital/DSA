//Permutations are noting but selecting all elements from a set where the order of picking is important.
//once picked element cannot be picked again.
//here we are using frequency data structure to see whether 
package RecurssionAndBacktracking;

import java.util.ArrayList;

public class U_FindAllPermutation {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		boolean[] freq = new boolean[arr.length];
		
		fun(arr,freq,new ArrayList<>(),ans);
		
		for(ArrayList<Integer> i:ans) {
			System.out.println(i);
		}
		
	}

	private static void fun(int[] arr, boolean[] freq, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {
		if(temp.size()==arr.length) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(!freq[i]) {
				freq[i]=true;
				temp.add(arr[i]);
				fun( arr, freq, temp, ans);
				freq[i]=false;
				temp.remove(temp.size()-1);
			}
		}
	}
}

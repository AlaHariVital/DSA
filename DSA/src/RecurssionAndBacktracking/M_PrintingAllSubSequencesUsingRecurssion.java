//A sub sequence is contiguous/non-contiguous sequence which follow the order of the given array.
//for every index in array we can pick or unpick an element to form sub sequence.  
//We can pick an element only once
package RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class M_PrintingAllSubSequencesUsingRecurssion {
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		findSubSequences(0,arr,ans,temp);
		for(List<Integer> i:ans) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	private static void findSubSequences(int index,int[] arr, List<List<Integer>> ans, List<Integer> temp) {
		if(index>=arr.length) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		temp.add(Integer.valueOf(arr[index]));
		findSubSequences(index+1, arr, ans, temp);
		temp.remove(temp.size()-1);
		findSubSequences(index+1, arr, ans, temp);
	}
}

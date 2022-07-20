package RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class N_PrintSubSequenceWhoseSunIsS {
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		int sum = 3;
		findSubSequences(0,arr,ans,temp,sum,0);
		for(List<Integer> i:ans) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	private static void findSubSequences(int index,int[] arr, List<List<Integer>> ans, List<Integer> temp,int sum,int s) {
		if(index>=arr.length) {
			if(s==sum) {
				ans.add(new ArrayList<>(temp));
				return;
			}
			return;
		}
		temp.add(Integer.valueOf(arr[index]));
		s+=arr[index];
		findSubSequences(index+1, arr, ans, temp,sum,s);
		temp.remove(temp.size()-1);
		s-=arr[index];
		findSubSequences(index+1, arr, ans, temp,sum,s);
	}
}

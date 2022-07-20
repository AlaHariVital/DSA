//Here we are given a string and we need to partition the string into all possible lists of sub strings ,
//where every sub string in each list is palindrome
//	[aabb]-->{
//		[a,a,b,b]
//		[a,a,bb]
//		[aa,b,b]
//		[aa,bb]
//	}

package RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class ZB_PartitioningIntoPalindromeStrings {
	public static void main(String[] args) {
		String s = "aabb";
		List<List<String>> ans = partitons(s);
		System.out.println("The palindrome partitions are :");
		System.out.print("[ ");
		for(int i=0;i<ans.size();i++) {
			System.out.print("[ ");
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j)+" ");
			}
			System.out.print("]");
		}
		System.out.print(" ]");
	}

	static List<List<String>> partitons(String s) {
		List<List<String>> res = new ArrayList<>();
		List<String> path = new ArrayList<>();
		fun(0,s,path,res);
		return res;
	}

	static void fun(int index, String s, List<String> path, List<List<String>> res) {
		if(index == s.length()) {
			res.add(new ArrayList<>(path));
			return;
		}
		for(int i=index;i<s.length();++i) {
			if(isPalindrome(s,index,i)) {
				path.add(s.substring(index, i+1));
				fun(i+1, s, path, res);
				path.remove(path.size()-1);
			}
		}
		
	}

	private static boolean isPalindrome(String s, int index, int i) {
		while(index<=i) {
			if(s.charAt(index++)!=s.charAt(i--))
				return false;
		}
		return true;
	}
}
















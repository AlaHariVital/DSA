package RecurssionAndBacktracking;

public class K_CheckPalindromeUsingRecurssion {
	public static void main(String[] args) {
		String str = "madam";
		if(fun(str,0,str.length()-1))
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}

	private static boolean fun(String str, int i, int j) {
		if(i>=j) 
			return true;
		if(str.charAt(i)!=str.charAt(j))
			return false;
		return fun(str,i+1,j-1);
	
	}
}

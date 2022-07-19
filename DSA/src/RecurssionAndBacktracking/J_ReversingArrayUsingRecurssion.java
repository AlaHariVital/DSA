//Here we reverse the array.
package RecurssionAndBacktracking;

public class J_ReversingArrayUsingRecurssion {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		fun(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.println(i);
		}
	}

	private static void fun(int[] arr, int i, int length) {
		if(i>=length) return;
		int temp = arr[i];
		arr[i]=arr[length];
		arr[length]=temp;
		fun(arr,i+1,length-1);
	}
	
}

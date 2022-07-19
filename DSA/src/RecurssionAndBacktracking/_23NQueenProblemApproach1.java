//We need to place N-Queens in n*n chess board by following the following conditions.
//every column must contain one Queen
//every row must contain one Queen
//no two queens must attack each other.

package RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class _23NQueenProblemApproach1 {
	public static void main(String[] args) {
		int n = 4;
		List<List<String>> ans = solveNQueens(n);
		int i =1;
		for(List<String> S:ans) {
			System.out.println("Arrangement :"+ i);
			for(String s:S ) {
				System.out.println(s);
			}
			System.out.println();
			i+=1;
		}
		
	}
	
	//This method is just used to take the parameters given by main method and return answer.
	//This method adds required parameters and call the method that solves the problem.
	private static List<List<String>> solveNQueens(int n) {
		char[][] board = new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='.';
			}
		}
		List<List<String>> ans = new ArrayList<List<String>>();
		placeQueens(0,board,ans);
		return ans;
	}
	
	
	//This method checks for all the possible placements using recursion.
	private static void placeQueens(int col, char[][] board, List<List<String>> ans) {
		if(col == board.length) {
			ans.add(construct(board));
			return;
		}
		for(int row=0;row<board.length;row++) {
			if(validatePosition(board,row,col)) {
				board[row][col]='Q';
				placeQueens(col+1, board, ans);
				board[row][col]='.';
			}
		}
		return;
	}
	
	
	//This method is used to check whether queen can be place in particular position or not.
	private static boolean validatePosition(char[][] board, int row, int col) {
		int tempRow = row;
		int tempCol = col;
		while(row>=0 && col>=0) {
			if(board[row][col]=='Q')
				return false;
			row--;
			col--;
		}
		
		row = tempRow;
		col = tempCol;
		while(col>=0) {
			if(board[row][col]=='Q') 
				return false;
			col--;
		}
		
		row = tempRow;
		col = tempCol;
		while(row<board.length && col>=0) {
			if(board[row][col]=='Q')
				return false;
			row++;
			col--;
		}
		
		return true;
	}

	
	//This method converts the completely filed N Queen board(nested array) into a list(each element is one row of board). 
	private static List<String> construct(char[][] board) {
		List<String> res = new ArrayList<String>();
		for(int i=0;i<board.length;i++) {
			String s = new String(board[i]);
			res.add(s);
		}
		return res;
	}
}

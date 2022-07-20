

package RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Y_NQueenProblemApproach2 {
	public static void main(String[] args) {
		int n = 5;
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
	
	private static List<List<String>> solveNQueens(int n) {
		char[][] board = new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='.';
			}
		}
		List<List<String>> ans = new ArrayList<List<String>>();
		int[] leftRow = new int[board.length];
		int[] upperDiagonal = new int[2*board.length-1];
		int[] lowerDiagonal = new int[2*board.length-1];
		placeQueens(0,board,ans,leftRow,upperDiagonal,lowerDiagonal);
		return ans;
	}

	private static void placeQueens(int col, char[][] board, List<List<String>> ans, int[] leftRow, int[] upperDiagonal,
			int[] lowerDiagonal) {
		if(col == board.length) {
			ans.add(construct(board));
			return;
		}
		for(int row=0;row<board.length;row++) {		
			if(leftRow[row] == 0 && lowerDiagonal[row+col]==0 && upperDiagonal[board.length-1+col-row]==0) {
				board[row][col]='Q';
				leftRow[row]=1;
				lowerDiagonal[row+col]=1;
				upperDiagonal[board.length-1+col-row]=1;
				placeQueens(col+1, board, ans, leftRow, upperDiagonal, lowerDiagonal);
				board[row][col]='.';
				leftRow[row]=0;
				lowerDiagonal[row+col]=0;
				upperDiagonal[board.length-1+col-row]=0;
			}
		}
	}
	private static List<String> construct(char[][] board) {
		List<String> res = new ArrayList<String>();
		for(int i=0;i<board.length;i++) {
			String s = new String(board[i]);
			res.add(s);
		}
		return res;
	}

	
}
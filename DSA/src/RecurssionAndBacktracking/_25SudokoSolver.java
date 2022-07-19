//This is a sudoko solver program 
//this program find the possible condition
package RecurssionAndBacktracking;

public class _25SudokoSolver {
	public static void main(String[] args) {
		char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
                };
		solve(board);
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static boolean solve(char[][] board) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]=='.') {
					
					for(char c='1';c<='9';c++) {
						if(isValid(board,i,j,c)) {
							board[i][j]=c;
							
							if(solve(board))
								return true;
							else
								board[i][j]='.';
						}
					}
					return false;
				}
			}
		}
		
		return true;	
	}

	private static boolean isValid(char[][] board, int row, int col, char c) {
		for(int x=0;x<9;x++) {
			//This condition check the if selected character is in the col
			if(board[x][col]==c)
				return false;
			//This condition check the if selected character is in the row
			if(board[row][x]==c)
				return false;
			
			//this condition is to check whether selected character is in particular 3*3 table
			
			if(board[3 * (row / 3) + x / 3][3 * (col / 3) + x % 3]==c)  
				return false;
		}
		
		return true;
	}
}

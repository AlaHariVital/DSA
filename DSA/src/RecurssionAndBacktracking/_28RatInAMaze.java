//A rat is traveling in a maze and and need to move from 0*0 position to n*m 
//it can move in only D,L,R,U directions 
//a visited cell in a maze cannot be visited again for a path.
// finding the no of possible paths for the rat to travel.

package RecurssionAndBacktracking;

import java.util.ArrayList;

public class _28RatInAMaze {
	public static void main(String[] args) {
		int n=4;
		int[][] maze = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
		ArrayList<String> res = findPath(maze, n);
	    if (res.size() > 0) {
	      for (int i = 0; i < res.size(); i++)
	        System.out.println(res.get(i) + " ");
	    }
	    else {
	    	System.out.println("not possible");
	    }
	}

	private static ArrayList<String> findPath(int[][] maze, int n) {
		int[][] visit = new int[4][4];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				visit[i][j]=0;
			}
		}
		//DLRU
		int[] movei= {1,0,0,-1};
		int[] movej= {0,-1,1,0};
		ArrayList<String> ans = new ArrayList<>();
		if(maze[0][0]==1)
			find(0,0,maze,n,"",visit,ans,movei,movej);
		return ans;
	}
	private static void find(int i,int j,int[][] maze,int n,String move,int[][] visit,ArrayList<String> ans,int[] movei,int[] movej) {
		if(i==n-1&&j==n-1) {
			ans.add(move);
		}
		String dir = "DLRU";
		for(int index=0;index<n;index++) {
			int nexti = i+movei[index];
			int nextj = j+movej[index];
			if(nexti>=0 && nextj>=0 &&nexti<n && nextj<n && visit[nexti][nextj]==0 && maze[nexti][nextj]==1) {
				visit[i][j]=1;
				find(nexti, nextj, maze, n, move+dir.charAt(index), visit, ans, movei, movej);
				visit[i][j]=0;
			}	
		}
	}
}

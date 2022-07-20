//here we are given with a undirected graph with n nodes,
//we need to find whether it is possible to color n nodes with m colors ,so that no two adjacent nodes are given same color.


package RecurssionAndBacktracking;

import java.util.ArrayList;

public class ZA_GraphColouringWithMColors {
	public static void main(String[] args) {
		int n=4;
		int m=2;
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] G = new ArrayList[n];
		for(int i=0;i<n;i++) {
			G[i]=new ArrayList<>();
		}
		G[0].add(1);
        G[1].add(0);
        G[1].add(2);
        G[2].add(1);
        G[2].add(3);
        G[3].add(2);
        G[3].add(0);
        G[0].add(3);
        G[0].add(2);
        G[2].add(0);
		
		int[] color = new int[n];
		
		boolean bool = find(0,n,m,G,color);
		if(bool)
			System.out.println("Possible");
		else System.out.println("not possible");
	}

	private static boolean find(int node,int n, int m, ArrayList<Integer>[] g, int[] color) {
		if(node == n) 
			return true;
		for(int i=1;i<=m;i++) {
			if(isSafe(node,g,color,i)) {
				color[node] = i;
				return find(node+1, n, m, g, color);
			}
		}
		
		return false;
	}

	private static boolean isSafe(int node, ArrayList<Integer>[] g, int[] color,int col) {
		for(int it: g[node]) {
			if(color[it]==col)
				return false;	
		}
		return true;
	}
}

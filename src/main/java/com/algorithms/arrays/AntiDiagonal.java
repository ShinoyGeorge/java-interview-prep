package com.algorithms.arrays;

import java.util.ArrayList;

public class AntiDiagonal {

	public ArrayList<ArrayList<Integer>> printAntiDiagonal() {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
		int top = 0, left = A.size()-1;
		while(top<A.size()) {
			for(int j=0; j<=left; j++) {
				if(top == 0) r.add(new ArrayList<Integer>());
				r.get(j+top).add(A.get(top).get(j));
			}			
			top++;
			
			for(int j=top; j<A.size(); j++) {
				if(left == A.size() -1) r.add(new ArrayList<Integer>());				
				r.get(j+left).add(A.get(j).get(left));
			}
			left--;
		}
		
		return r;
	}
}
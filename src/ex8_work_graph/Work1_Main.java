package ex8_work_graph;

import java.util.Random;

public class Work1_Main {
	public static void main(String[] args) {
		
		// 0 ~ 9 사이의 난수 100개를 저장하는 배열 만들고, 해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 하라.
		
		// 2039509720740....
		// 0의 갯수 : ###### (6)
		// ........
		// 9의 갯수 : ############ (12)
		
		
		
		int[] cntArr = new int[10];
		
		for(int i = 0; i < 100; i++) {
			int r = new Random().nextInt(9) + 0;
			System.out.print(r);
			cntArr[r]++;		
		}
		
		System.out.println();
		
		Graph w = new Graph();
		w.printGraph(cntArr);
		
		
		
		
	} // main

}

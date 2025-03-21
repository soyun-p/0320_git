package ex8_work_graph;

public class Graph {
	
	public void printGraph( int[] cntArr) {
		
		
		
		for(int i = 0; i < cntArr.length; i++) {
			
			System.out.printf("%d의 갯수 : ", i);
			
			for(int j = 0; j < cntArr[i]; j++) {
				
				System.out.print("#");
			}
			
			System.out.printf(" (%d)\n", cntArr[i]);
			
		}
		
		
	}

}

package ex1_list_work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex2_list {
	public static void main(String[] args) {
		
		// 리스트 두 개 생성 후, 1~5 사이 난수를 5개 추가
		// 두 리스트 값 비교하여 교집합 출력
		
		// list1 = [ 5, 3, 5, 1, 5 ]
		// list2 = [ 2, 3, 1, 1, 3 ]
		// 교집합 : [ 3, 1 ]
		
		
		Random rnd = new Random();
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		Set<Integer> cmn = new HashSet<Integer>();
		
		
		/* 선생님 풀이 : 더 간결
		 for(int i = 0; i < 5; i++) {
		     list1.add(rnd.nextInt(5) + 1);
		     list2.add(rnd.nextInt(5) + 1);    
		 }
		 */
		
		while( true ) {
			
			int n1 = rnd.nextInt(5) + 1;
			list1.add(n1);
			
			int n2 = rnd.nextInt(5) + 1;
			list2.add(n2);
			
			if( list1.size() == 5 && list2.size() == 5 ) {
				break;
			} // if
		} // while
		
		
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		
		
		/* 선생님 풀이 : set을 안 쓸 때
		 List<Integer> resList = new ArrayList<Integer>();
		 
		 for(int n : list1 ) {
		     if( list2.contains(n) && !resList.contains(n) ) {
		         resList.add(n);
		     } // if
		 } // for
		 */
		
		
		
		for( int num : list1 ) {
			
			if( list2.contains(num) ) {
				cmn.add(num);
			} // if
			
		} // for
		
		System.out.println("교집합 : " + cmn);
		
		
		
		
		
		
		
	} // main

}

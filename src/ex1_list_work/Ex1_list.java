package ex1_list_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_list {
	public static void main(String[] args) {
		
		// 숫자를 입력하세요(입력종료 : 0)
		// 45
		// 17
		// 20
		// 21
		// 0   (입력 종료)
		
		// 원하는 숫자 범위를 입력하세요
		// 시작 : 15
		// 끝 : 20
		
		// 범위 내의 숫자들
		// 17 20
		
		
		// 입력한 숫자를 저장할 리스트
		List<Integer> list = new ArrayList<Integer>();
		
		
		// 숫자 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요(입력 종료 : 0)");
		
		while( true ) {
			
			int num = sc.nextInt();
			list.add(num);
			
			if( num == 0 ) {
				break;
			} // if
			
		} // while
		
		
		// 원하는 숫자 범위 입력
		System.out.println("원하는 숫자 범위를 입력하세요");
		
		System.out.print("시작 : ");
		int start = sc.nextInt();
		
		System.out.print("끝 : ");
		int end = sc.nextInt();
		
		
		// 범위 내 숫자 출력
		System.out.println("---범위 내의 숫자들---");
		
		
		for(int i = 0; i < list.size(); i++) {  // 개선된 for문 사용 가능 : for( int n : list )
			
			if( list.get(i) >= start && list.get(i) <= end ) {
				System.out.print(list.get(i) + " ");
			} // if
			
		} // for
		
		
		
		
		
		
		
		
		
		
	} // main

}

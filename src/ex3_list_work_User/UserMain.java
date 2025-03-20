package ex3_list_work_User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		// 이름 : hong
		// 나이 : 12
		// hong / 12
		// 이름 : Kim
		// 나이 : 22
		// hong / 12
		// Kim / 22
		// 이름 : 


		Scanner sc = new Scanner(System.in);

		List<User> arr = new ArrayList<User>();

		
		

		
		// 이름과 나이 입력 후 리스트에 저장
		while( true ) {
			
			User u = new User();  // 반복할 때마다 메모리 할당을 새로 받고, 새로 메모리 할당 받을 때마다 기존 메모리는 잊어버린다.

			System.out.print("이름 : ");
			u.setName(sc.next());

			System.out.print("나이 : ");
			u.setAge(sc.nextInt());

			arr.add(u); // 이름과 나이 모두 리스트에 저장
			
			
			// 입력했던 이름과 나이가 누적되어 출력
			for(int i = 0; i < arr.size(); i++) { // User aa : arr  -> 유저 타입으로 받는 개선된 for문 가능
				
				System.out.println(arr.get(i). getName() + " / " + arr.get(i).getAge() );
				
			} // for
			
			System.out.println("\n-----------------");

		} // while




	} // main

}

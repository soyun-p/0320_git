package ex4_list_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Studentmain {
	public static void main(String[] args) {

		// 학생들의 이름, 국어, 영어, 수학 성적을 저장하고 아래와 같은 결과 출력

		// 학생 수 : 2
		// 이름 : hong
		// 국어 : 99
		// 영어 : 87
		// 수학 : 84
		// -------------
		// 이름 : park
		// 국어 : 75
		// 영어 : 97
		// 수학 : 80
		// -------------
		// hong - 국어:99, 영어:87, 수학:84, 총점:270, 평균:90.0
		// park - 국어:75, 영어:97, 수학:80, 총점:252, 평균:84.0


		Scanner sc = new Scanner(System.in);

		List<Student> list = new ArrayList<Student>();

		System.out.print("학생 수 : ");
		int stuNum = sc.nextInt();
		



		// 
		for(int i = 0; i < stuNum; i++) {

			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("국어 : ");
			int korea = sc.nextInt();

			System.out.print("영어 : ");
			int eng = sc.nextInt();

			System.out.print("수학 : ");
			int math = sc.nextInt();

			Student s = new Student( name, korea, eng, math );
			list.add(s);
			
			System.out.println("-------------");

		} // for
		
		
		 
		for(int i = 0; i < stuNum; i++) {
			
			System.out.printf("%s - 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.1f\n",
					list.get(i).getName(),
					list.get(i).getKorea(), list.get(i).getEng(), list.get(i).getMath(),
					list.get(i).total(), list.get(i).avg() );
			
		} // for





	} // main

}

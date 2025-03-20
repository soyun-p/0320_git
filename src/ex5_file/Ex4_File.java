package ex5_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = "C:/java_jyh/abcd/aaa";
		
		File f = new File(path);
		
		
		// path 경로에 존재 여부 확인
		if( !f.exists() ) { // if( f.exists == true ) : 경로 존재하지 않음
			System.out.println("폴더를 생성");
			f.mkdirs();  // make directory(s) : 폴더 생성. 뒤에 s 붙이면 여러 개 폴더 생성 가능.
		}else {
			System.out.println("이미 존재하는 폴더");
		}
		
		// 
		
		
		
	} // main

}

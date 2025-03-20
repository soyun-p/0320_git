package ex5_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		// IO(Input, Output) : 입출력 스트림
		
		// 스트림 : 데이터를 입력, 또는 출력하기 위한 방법(데이터가 왔다갔다 하는 일종의 통로 개념)
		// JVM에서 콘솔로 값을 보내면 Output, 콘솔에서 값을 JVM에서 읽을 때는 Input.
		
		
		String path = "c:/java_jyh/test.txt";  // path => 경로. '\\'를 / 대신에 써도 가능.
		
		// File 생성
		File f = new File(path);
		
		// File클래스의 생성 경로가 파일구조인 경우
		if( f.isFile() ) { // 경로 마지막이 파일 구조인지 폴더(디렉토리)인지 확인
			System.out.println("파일의 크기 : " + f.length() + "byte");
			
		}
		
		
		
		
		
	} // main

}

package ex5_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "C:/java_jyh/work";
		
		File f = new File(path);
		
		// path 경로에 하위 요소를 File[] 구조로 받으면, 인덱스를 통해 파일의 존재 여부, 디렉토리 구별 등의 기능을 함께 사용 가능하다.
		File[] f2 = f.listFiles();
		
		for(int i = 0; i < f2.length; i++) {
			
			if( f2[i].isFile() ) { //
				System.out.println( f2[i].getName() );
			}
			
		}
		
		
		
	} // main

}

package ex5_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/java_jyh/work";
		
		File f = new File(path);
		
		if( f.isDirectory() ) {// 해당 패스의 파일이 폴더, 즉 디렉토리인지 확인.
			
			// 폴더 안의 하위요소들의 이름을 배열구조로 모두 가져온다.
			String[] names = f.list();  
			
			for(int i = 0; i < names.length; i++) {
				System.out.println(names[i]);  // 폴더의 하위요소들의 이름을 모두 출력
			}
			
		} // if
		
		
	} // main

}

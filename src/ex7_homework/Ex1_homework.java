package ex7_homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex1_homework {
	public static void main(String[] args) {
		
		// exam.txt의 내용(111abc2)을 읽어서 숫자들의 합만 출력
		
		// 결과 : 5
		
		String path = "C:/java_jyh/exam.txt";
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		
		
		if( f.exists() ) {
			
			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream(f);
				
				fis.read(read);  // 읽어온 파일 내용을 read(바이트 기반 배열)에 저장.
				String res = new String(read);  // read배열에 파일 내용을 스트링 타입으로 바꿔서 저장.
				
				
				int sum = 0;  // 숫자 더할 변수
				
				for(int i = 0; i < res.length(); i++) {
					
					if( res.charAt(i) < '9' && res.charAt(i) > '0' ) {
						sum += res.charAt(i)-'0';		
					} // if
				
				} // for
				
				System.out.println("결과 : " + sum);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} // finally
			
			
		} // if
		
		
		
		
		
		
		
	} // main

}

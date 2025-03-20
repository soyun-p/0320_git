package ex6_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		// ...Stream : byte 기반의 스트림
		// ...Writer, ...Reader : char 기반의 스트림. 최대 2바이트까지 읽어 오거나 내보낼 수 있다.
		// 따라서 바이트 기반의 스트림을 많이 사용한다.
		
		
		String path = "C:/java_jyh/test.txt";
		File f = new File(path);
		
		// 배열의 길이는 파일의 length()를 이용해서 생성. 
		// 이때 파일 길이는 long 타입을 쓰기 때문에 앞에 int 형 변환을 해줘야 한다.
		byte[] read = new byte[(int)f.length()];
		
		
		if( f.exists() ) {
			
			FileInputStream fis = null;  
			// 트라이와 파이널리는 지역 변수이기 때문에 fis를 두곳에서 다 사용하려면 전역으로 선언해줘야 한다.
			
			try { // 경로가 없을 수도 있기 때문에 트라이-캐치 구문 사용
				 fis = new FileInputStream(f);
				
				// fis가 읽어 온 내용을 read[] 안에 담는다.
				fis.read(read);
				
				// byte 배열을 String 구조로 변환
				String res = new String( read );
				
				System.out.println(res);
				
				// fis.close();  -> 만약 오류나면 닫지를 못하기 때문에 오류 나든 말든 반드시 들르는 파이널리 영역에 넣어줘야 한다.
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		
	} // main

}

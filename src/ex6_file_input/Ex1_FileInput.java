package ex6_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path = "C:/java_jyh/test.txt";
		
		File f = new File(path);
		
		if( f.exists() ) {
			
			// 파일과 연결된 입력 스트림 생성 : File은 문자열을 받지 못하기 때문?
			try { 
				FileInputStream fis = new FileInputStream(f);   // 접근 가능
				// FileInputStream : try-catch구문 필요. 
				// 그러나 아래 구문 실행할 때 오류날 수 있다. 오류 유형을 전부를 포괄하는 Exception e로 써준다.
				
				int code = 0;
				
				// 스트림은 더이상 읽을 것이 없다면 -1을 반환한다.
				// 반복문을 통해서 파일의 내용을 일고 더이상 읽을 것이 없는 파일의 끝(-> EndOfFile(EOF))인 -1을 만나면 중단된다.
				while( ( code = fis.read() ) != -1 ) { 
					// read() : 접근한 파일의 문서 안의 내용을 읽어온다.
					// 그러나 2바이트 짜리 문자를 읽어올 수 없고, 쪼개서 읽어오기 때문에 한글을 쪼개서 가져온다.
					// 따라서 출력 결과는 ¾È³çÇÏ¼¼¿äabc. 영어 a,b,c만 정상적으로 읽어온다.
					
					System.out.print( (char)code );
					
				} // while
				
				// 스트림 사용 후에는 반드시 close()를 이용하여 닫아줘야 한다. 필수!!
				fis.close();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}

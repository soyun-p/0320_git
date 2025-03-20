package ex7_homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_homework {
	public static void main(String[] args) {

		// exam.txt 의 내용이 회문인지 판단.

		// 111abc2 은(는) 안 회문

		String path = "C:/java_jyh/exam.txt";
		File f = new File(path);

		byte[] read = new byte[(int)f.length()];

		if( f.exists() ) {
			
			FileInputStream fis = null;

			try {
				fis = new FileInputStream(f);
				fis.read(read);
				
				String res = new String(read);
				String rev = "";
				
				for(int i = res.length(); i <= 0; i--) {
					rev += res.charAt(i);
				} // for
				
				if( res.equals(rev) ) {
					System.out.println(res + " 은(는) 회문입니다.");
				}else {
					System.out.println(res + " 은(는) 회문이 아닙니다.");
				}
				

			} catch ( Exception e ) {
				// TODO Auto-generated catch block
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

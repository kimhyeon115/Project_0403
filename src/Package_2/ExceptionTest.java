package Package_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		}catch(FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
		}
			System.out.println("finally");
		}
		System.out.println("end");
	}
}
package kr.hs.dgsw.student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileCopyMain {
	public static void main(String[] args) throws Exception{
		File f1 = new File("D:\\aa.jpg");
		FileInputStream fis = new FileInputStream(f1);
		
		FileOutputStream fos = new FileOutputStream("D:\\a\\aa.jpg");
		
		byte[] bytes = new byte[1024];
		int readbit = 0;
		while((readbit = fis.read(bytes)) != -1){
			fos.write(bytes, 0, readbit);
		}
	}
}

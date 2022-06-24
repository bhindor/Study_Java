package kr.hs.dgsw.student.filecopy.client;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileCopyClient {
	public static void main(String[] args) throws Exception{
		Socket sc = new Socket("10.80.162.206", 5000);
		OutputStream os = sc.getOutputStream();
		BufferedOutputStream bor = new BufferedOutputStream(os);
		DataOutputStream dos = new DataOutputStream(bor);
		
		File f1 = new File("D:\\aa.jpg");
		   FileInputStream fis = new FileInputStream(f1);
		   
		   byte[] bytes = new byte[1024];
		   int readbit = 0;
		   dos.writeUTF(f1.getName());
		   while ((readbit = fis.read(bytes)) != -1) {
		       dos.write(bytes,0,readbit);
		   }
	}
}
 
package kr.hs.dgsw.student.filecopy.server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class fileCopyServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(5000);
		Socket sc = ss.accept();
		
		InputStream is = sc.getInputStream();
		BufferedInputStream bir = new BufferedInputStream(is);
		DataInputStream dis = new DataInputStream(bir);
			
		String filename = dis.readUTF();
		
		FileOutputStream fos = new FileOutputStream("D:\\a\\" + filename);
		
		byte[] bytes = new byte[1024];
		int readbit = 0;
		while((readbit = dis.read(bytes)) != -1)
			fos.write(bytes, 0, readbit);
		
	}
}

package com.sunyo.testexmple;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class fileIO_test {

	// ������ ���̳ʸ��� �����Ǿ� �ֱ� ������ IO�� 
    //����� ���� �ڷ����� ��κ� byte(unsigned char)�� ó����.
	
	public static void main(String[] args) throws IOException {
		String test = "hello world";
		// String Ÿ���� byte�������� ��ȯ
		byte[] binary = test.getBytes();
		//File �ν��Ͻ� ����
		File file = new File("d://test//test.txt");
		//Stream �ν��Ͻ� ����
		OutputStream stream = new FileOutputStream(file);
		//OutputStream�� test�� ���̳ʸ��� �ۼ�
		stream.write(binary);
		stream.close();
	}

}

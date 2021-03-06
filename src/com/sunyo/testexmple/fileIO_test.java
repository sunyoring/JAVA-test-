package com.sunyo.testexmple;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class fileIO_test {

	// 파일은 바이너리로 구성되어 있기 때문에 IO를 
    //사용할 때의 자료형은 대부분 byte(unsigned char)로 처리됨.
	
	public static void main(String[] args) throws IOException {
		String test = "hello world";
		// String 타입을 byte형식으로 변환
		byte[] binary = test.getBytes();
		//File 인스턴스 생성
		File file = new File("d://test//test.txt");
		//Stream 인스턴스 생성
		OutputStream stream = new FileOutputStream(file);
		//OutputStream에 test의 바이너리를 작성
		stream.write(binary);
		stream.close();
	}

}

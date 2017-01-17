package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream( "dooly.jpg" );
			fos = new FileOutputStream( "dooly2.jpg" );
			
			int data = 0;
			while( (data = fis.read() ) != -1 ) {
				fos.write( data );
			}

		} catch( FileNotFoundException e ) {
			System.out.println( "파일이 없습니다-" + e );
		} catch( IOException e ) {
			System.out.println( "I/O 오류 - " + e );
		} finally {
			//자원 정리
			try {
				if( fis != null ){
					fis.close();
				}
				
				if( fos != null ) {
					fos.close();
				}
			} catch( IOException e ) {
				e.printStackTrace();
			}
		}

	}

}

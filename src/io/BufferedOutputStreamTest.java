package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream( 
					new FileOutputStream( "1234.txt" ), 
					5 );
			
			for( int i = '0'; i < '9'; i++ ) {
//			for( int i = 48; i < 57; i++ ) {
				bos.write( i );
				bos.flush(); // 강제로 버퍼를 비움(디스크에 씀)
			}

		} catch ( FileNotFoundException e ) {
			System.out.println( "파일 열기 실패:" + e );
		} catch ( IOException e ) {
			System.out.println( "파일 I/O 실패:" + e );
		} finally {
			try {
				if( bos != null ) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

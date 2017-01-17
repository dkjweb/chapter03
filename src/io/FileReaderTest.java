package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileInputStream fis = null;
		try {
			// 문자 단위로 읽음
			int count = 0;
			fr = new FileReader( "test.txt" );
			int data = -1;
			while( (data = fr.read()) != -1 ) {
				count++;
				System.out.print( (char)data );
			}
			System.out.println( "\n읽은 횟수:" + count );
			System.out.println( "=============" );
			
			// 바이트 단위로 읽음
			count = 0;
			fis = new FileInputStream( "test.txt" );
			while( (data = fis.read() ) != -1 ) {
				count++;
				System.out.print( (char)data );
			}
			System.out.println( "\n읽은 횟수:" + count );
			
		} catch( FileNotFoundException e ) {
			System.out.println( "파일이 없습니다.:" + e );
		} catch( IOException e ) {
			System.out.println( "읽기오류:" + e);
		} finally {
			try {
				if( fr != null ) {
					fr.close();
				}
				if( fis != null ) {
					fis.close();
				}
			} catch( IOException e ) {
				e.printStackTrace();
			}
		}
		
	}

}

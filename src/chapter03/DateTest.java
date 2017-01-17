package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date(); //현재 시간
		printDate( now );
		printDate2( now );
		
		// 년(-1900), 월(0~11), 일
		Date d1 = new Date( 100, 0, 16 ); //deprecated
		printDate( d1 );
		
		//년 (-1900), 월(0~11), 일, 시, 분, 초
		Date d2 = new Date( 100, 0, 16, 13, 25, 30 ); //deprecated
		printDate( d2 );

		//1970년 1월 1일  00:00:00.000 이후에
		//milliseconds 값을 세팅
		long milliseconds = 24L*60*60*1000*365*30;
		Date d3 = new Date( milliseconds );
		printDate( d3 );
		
	}
	
	public static void printDate( Date d ){
		SimpleDateFormat sdf =
			new SimpleDateFormat( "yyyy년 MM월 dd일 hh시mm분ss초" );
		
		System.out.println( sdf.format( d ) );
	}

	public static void printDate2( Date d ) {
		//년도 + 1900
		int year = d.getYear(); //deprecated, 사용하지 말것
		
		//월 (0~11)
		int month = d.getMonth();
		
		//일
		int date = d.getDate();
		
		//시
		int hour = d.getHours();
		
		//분
		int minutes = d.getMinutes();
		
		//초
		int seconds = d.getSeconds();
		
		System.out.println( 
			(year+1900) + "년 " +
			(month+1) + "월 " +
			date + "일 " +
			hour + "시 " +
			minutes + "분 " +
			seconds + "초 " );
	}
}

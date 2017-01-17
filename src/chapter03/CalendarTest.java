package chapter03;

import java.util.Calendar;
import java.util.Vector;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//지금
		printDate( cal );
		
		//특정 날짜 세팅하기
		cal.set( Calendar.YEAR, 2007 );   //2007년
		cal.set( Calendar.MONTH, 10 );    //11월
		cal.set( Calendar.DATE, 12 );     //12일
		
		//기념일
		cal.set( 2007, 10, 12 );  //2007-11-12 -> 기념일
		cal.add( Calendar.DATE, 10000 ); //10000일 째 되는 날
		printDate( cal );
	}

	public static void printDate( Calendar cal ){
		String[] days = 
			{ "일", "월", "화", "수", "목", "금", "토" }; 
		int year = cal.get( Calendar.YEAR );
		int month = cal.get( Calendar.MONTH );
		int date = cal.get( Calendar.DATE );
		//1(일) ~ 7(토)
		int day = cal.get(Calendar.DAY_OF_WEEK); 
		int hour = cal.get( Calendar.HOUR );
		int min = cal.get( Calendar.MINUTE );
		int sec = cal.get( Calendar.SECOND );
		
		System.out.println(
		year + "-" + (month+1) + "-" + date + 
		"(" + days[ day-1 ] + ") " +
		hour + ":" + min + ":" + sec);
	}
}

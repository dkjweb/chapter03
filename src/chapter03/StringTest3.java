package chapter03;

public class StringTest3 {

	public static void main(String[] args) {
		String s = "aBcAbCabcABC";
		
		//charAt
		System.out.println( s.charAt( 2 ) );
		
		//indexOf
		System.out.println( s.indexOf( "abc" ) );
		System.out.println( s.indexOf( "xyz" ) );
		
		//length()
		System.out.println( s.length() );
		
		//replace : 치환
		System.out.println( s.replace('a', 'R') );
		System.out.println( s );
		
		//replaceAll : 치환
		System.out.println( s.replaceAll( "abc", "123"));
	
		//substring
		System.out.println( s.substring(0, 3));
		
		//toLowerCase()
		System.out.println( s.toLowerCase() );
		
		
		String str1 = " ab cd";
		String str2 = ",efg ";
		
		//concat : 문자열
		str1 = str1.concat( str2 );
		System.out.println( str1 );
		
		//trim : 공백제거 단, 앞 뒤에 공백만 제거
		System.out.println( "-" + str1 + "-" );
		str1 = str1.trim();
		System.out.println( "-" + str1 + "-" );
		
		//split 문자열 분리
		String[] result = str1.split( "," );
		for( String str : result ) {
			System.out.println( str );
		}
		
		//Split 예외
		String str5 = "abcdef";
		String[] result5 = str5.split( "," );
		for( String str : result5 ){
			System.out.println( str );
		}
		
	}

}

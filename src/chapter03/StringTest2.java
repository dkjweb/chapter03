package chapter03;

public class StringTest2 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "cde";
		String str3 = str2;
		
		str2 = str1.toUpperCase();
		System.out.println( str1 );
		System.out.println( str2 );
		System.out.println( str3 );
		
		String str4 = str2.concat( "??" );
		System.out.println( str2 );
		System.out.println( str4 );
		
		//method chain
		String str5 = "!".concat( str2 ).concat( "@" );
		//String s1 = "!";
		//String s2 = s1.concat( str2 );
		//String str5 = s2.concat( "@" );
		System.out.println( str2 );
		System.out.println( str5 );
		
		
		

	}

}

package chapter03;

public class StringTest {

	public static void main(String[] args) {
		
		//escape 문자 " -> 출력
		String s = "I say \"hello\" ";
		System.out.println( s );
		
		// 문자형에서 ' -> 출력
		char c = '\'';
		
		// C:\dowork 출력
		String s1 = "c:\\dowork";
		System.out.println( s1 );
		
		// \t, \n, \r\n
		System.out.print("\n");

		// + 연산이 가능하다.
		String s2 = "Hello" +  "Java";
		System.out.println( s2 );
		System.out.println( s2.charAt(5) );
	}

}

package chapter03;

public class PointTest {

	public static void main(String[] args) {
		Point pt = new Point(100, 200);
		
		System.out.println( pt.getClass() );
		System.out.println( pt.hashCode() );
		
		//pt.getClass().getName() + "@" + pt.hashCode()
		System.out.println( pt.toString() );
		System.out.println( pt );
		
		//비교 String 객체
		String s = new String( "hello" );
		System.out.println( s.getClass() );
		System.out.println( s.hashCode() );
		System.out.println( s.toString() );
	}

}

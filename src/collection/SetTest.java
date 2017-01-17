package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Value> set = new HashSet<Value>();

		Value v1 = new Value(10);
		Value v2 = new Value(5);
		Value v3 = new Value(1);
		Value v4 = new Value(10);
		Value v5 = v4;
		
		set.add( v1 );
		set.add( v2 );
		set.add( v3 );
		set.add( v4 );
		set.add( v5 );
		
		Iterator<Value> it = set.iterator();
		while( it.hasNext() ) {
			Value v = it.next();
			System.out.println( v );
		}
		
	}

}

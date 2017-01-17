package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
		Set<Gugudan> set = new HashSet<Gugudan>(); 
		
		set.add( new Gugudan(2, 3) );
		set.add( new Gugudan(9, 9) );
		set.add( new Gugudan(2, 7) );
		set.add( new Gugudan(3, 2) );
		set.add( new Gugudan(2, 3) );
		
		Iterator<Gugudan> it = set.iterator();
		while( it.hasNext() ) {
			Gugudan g = it.next();
			System.out.println( g );
		}
		
	}

}

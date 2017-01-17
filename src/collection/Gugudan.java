package collection;

public class Gugudan {
	private int a;
	private int b;
	
	public Gugudan( int a, int b ) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Gugudan [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		//result = prime * result + a;
		//result = prime * result + b;
		
		result = prime * result + (a*b);
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gugudan other = (Gugudan) obj;
		if (a*b != other.a * other.b)
			return false;
//		if (b != other.b)
//			return false;
		return true;
	}
	
	
}

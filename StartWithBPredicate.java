// Predicate testing whether a String starts with a 'B'
// The Predicate interface has only ONE abstract method, test.


import java.util.function.*;


public class StartWithBPredicate<T> implements Predicate<T> {
	
	public boolean test(T t) {
		if (!(t instanceof String)) {
			return false;
		}
		else {
			String s = (String) t;
			return s.charAt(0) == 'B';
		}
		}
	}

// Because the Predicate interface contains only one abstract  
// method that must be implemented, it is a functional interface

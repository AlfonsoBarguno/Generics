package ejercicio4;

public class Variablendefinida <T> {
	
	public void f(T...v) {
		
		for(int i = 0; i < v.length; i++) {
			
			System.out.println(v[i]);
		}
		
		
	}

}

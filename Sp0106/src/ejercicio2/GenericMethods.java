package ejercicio2;

public class GenericMethods {
	/*Crea una classe anomenada GenericMethods amb un
	 *  m�tode gen�ric anomenat f() que accepti tres arguments 
	 *  de tipus gen�ric. Realitza al main() diferents crides  
	 *  d'aquest m�tode amb diferents tipus de parametres. 
	 *  Comprova que es poden posar qualsevol tipus de variable.
	 */
	
	public static <T, K, V> void f(T t, K k, V v) {
		
		String resultado = "Lo par�metros " + t + " , " + k + " , " + v + " son diferentes.";
		
		System.out.println(resultado);
		}
	
}

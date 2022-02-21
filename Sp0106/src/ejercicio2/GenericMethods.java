package ejercicio2;

public class GenericMethods {
	/*Crea una classe anomenada GenericMethods amb un
	 *  mètode genèric anomenat f() que accepti tres arguments 
	 *  de tipus genèric. Realitza al main() diferents crides  
	 *  d'aquest mètode amb diferents tipus de parametres. 
	 *  Comprova que es poden posar qualsevol tipus de variable.
	 */
	
	public static <T, K, V> void f(T t, K k, V v) {
		
		String resultado = "Lo parámetros " + t + " , " + k + " , " + v + " son diferentes.";
		
		System.out.println(resultado);
		}
	
}

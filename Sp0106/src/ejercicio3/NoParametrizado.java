package ejercicio3;

public class NoParametrizado {
	
	public static <T,K> void noParam(T t, K k, boolean a) {
		
		String resultado = "El �ltimo elemento, " + a + ", no est� parametrizado.";
		
		System.out.println(resultado);
	}

}

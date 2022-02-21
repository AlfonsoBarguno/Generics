package ejercicio3;

public class NoParametrizado {
	
	public static <T,K> void noParam(T t, K k, boolean a) {
		
		String resultado = "El último elemento, " + a + ", no está parametrizado.";
		
		System.out.println(resultado);
	}

}

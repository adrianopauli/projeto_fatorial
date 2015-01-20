public class Fatorial{

	public static void main(String [] agrs){
		System.out.println(calculaFatorial(5));
	}

	public static int calculaFatorial(int n){
		int resultado = 1;
		for(int i = 2 ; i <=n; i++){
			resultado *=i;
		}
		return resultado;
	
	}
}
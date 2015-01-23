public class Fatorial{
	// Versao iterativa do calclo do fatorial, incluido o teste n =0
	public int calculaFatorial(int n) throws IllegalArgumentException{
		if(n < 0 )
			throw new IllegalArgumentException("Não existe fatorial de numeros negativos");
		int resultado = 1;
		if(n != 0){
			for(int i = 2 ; i <=n; i++){
				resultado *=i;
			}
		}
		return resultado;
	}
}
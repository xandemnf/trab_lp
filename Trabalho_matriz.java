import java.util.Random;

public class Trabalho_matriz{
	
	public static void main(String[] args){

		//tamanho da matriz N x N
		//int n=20;
		//int n =100;
		//int n = 1000;
		int n = 2000;
		int count = 0;

		//instanciando classe randomica
		Random r = new Random();

		//criando o objeto vetor de inteiros
		int matrizA[][] = new int[n][n];
		int matrizB[][] = new int[n][n];
		long matrizMultiplicada[][] = new long[n][n];
		long somatorio = 0;
		double media = 0;
		double desvioPadrao = 0;
		double somatorioVariancia = 0;
		double variancia = 0;

		
		double tempo[] = new double[30];

		//while(count != 30){
		//preencher as matrizes
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrizA[i][j] = (int) r.nextInt(100);
				matrizB[i][j] = (int) r.nextInt(100);
			}
		}

		//multiplica as matrizes A e B
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int p=0;p<n;p++){
					matrizMultiplicada[i][j] = (matrizA[i][j] * matrizB[p][j]);	
				}
			}
		}

		//somar todos os valores
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				somatorio += matrizMultiplicada[i][j];
				
			}
		}

		media = somatorio/(Math.pow(n,2));

		//calcular variancia
		//somatorio
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				somatorioVariancia += Math.pow((matrizMultiplicada[i][j] - media), 2);				
			}
		}

		variancia = somatorioVariancia/(n*n);
		
		//calcular Desvio Padrao
		desvioPadrao = Math.sqrt(variancia);
		System.out.println("Tamanho da Matriz: " + n + " x " + n);
		System.out.println("Soma dos Valores: " + somatorio);
		System.out.println("Media dos Valores: " + media);
		System.out.println("Desvio Padrao: " + desvioPadrao);

	//}



	}
}	   				
import java.util.Random;

public class Trabalho_vetor{
	
	public static void main(String[] args){

			int count = 0;
			int tamanhoVetor = 10000;
			int media = 0;
			double variancia = 0;
			double desvioPadrao = 0;
			long somador = 0;
			long tempoInicio = System.currentTimeMillis();
			double f = 0;
			double somaVariancia = 0;
			double somaTempo = 0;
			double mediaTempo = 0;
			double desvioPadraoTempo = 0;
			double somaVarianciaTempo =0;
					
			//criando o objeto vetor de inteiros
			int array[] = new int[tamanhoVetor];
			int array_variancia[] = new int[tamanhoVetor];
			double tempo[] = new double[30];

			Random r = new Random();


		while(count != 30){
			
			
			
			//VETOR DE 1000
			for (int i = 0; i <= tamanhoVetor-1; i++) {
	   			array[i] = (r.nextInt())%100;
	   				
	   				//corrige os numeros negativos encontrados na random
	   				if(array[i]<0){
	   					 array[i] = array[i]*(-1);
	   				}

	   			//teste de valores Randomicos
	   			//System.out.println(array[i]);

	   			array_variancia[i] = array[i];
					
					array[i] = array[i] * array[i];
					
					somador += array[i];
			
				if(i == tamanhoVetor-1){

					media = (int) (somador/tamanhoVetor);
					
					for(int j = 0; j < tamanhoVetor-1; j++){
						
						somaVariancia += (Math.pow((array_variancia[j] - media), 2));

					}
					
					variancia = somaVariancia/tamanhoVetor;

					desvioPadrao = Math.sqrt(variancia);

					
				}
			}

			tempo[count] = ((double) ((System.currentTimeMillis()-tempoInicio)))/1000;
			somaTempo += tempo[count]; 
			count++;
		}
		//Imprime os topos de cada execusao
		for(int z=0;z<30;z++){
			System.out.println("Tempo Total: " + tempo[z] + " segundos");
		}

			System.out.println("Soma Tempo: " + somaTempo);
		mediaTempo = somaTempo/30;
		System.out.println("Media Tempo: " + mediaTempo);

		for(int a=0; a<=29;a++){
			somaVarianciaTempo += Math.pow((tempo[a] - mediaTempo), 2);
		}

		desvioPadraoTempo = (Math.sqrt(somaVarianciaTempo))/30;

		System.out.println("Vetor de tamanho: " + tamanhoVetor);
		System.out.println("Soma Total: " + somador);
		System.out.println("Media: " + media);
		System.out.println("Media do tempo: " + mediaTempo);
		System.out.println("Desvio Padrão do tempo: " + (desvioPadraoTempo));
		System.out.println("\n");

	}
}
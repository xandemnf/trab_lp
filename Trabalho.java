import java.util.Random;

public class Trabalho{
	
	public static void main(String[] args){

		int tamanhoVetor = 1000;
		int media = 0;
		double variancia = 0;
		double desvioPadrao = 0;
		long somador = 0;
		long tempoInicio = System.currentTimeMillis();
				
		//criando o objeto vetor de inteiros
		int array[] = new int[tamanhoVetor];
		int array_variancia[] = new int[tamanhoVetor];
		
		Random r = new Random();
		
		//VETOR DE 1000
		for (int i = 0; i <= tamanhoVetor-1; i++) {
   			array[i] = (r.nextInt())%100;
   			array_variancia[i] = array[i];
			array[i] = array[i] * array[i];
			somador += array[i];
		
			//System.out.println(array[i]);
			if(i == tamanhoVetor-1){
				media = (int) (somador/tamanhoVetor);
				for(int j = 0; j < tamanhoVetor-1; j++){
					variancia += Math.pow((array_variancia[j] - media), 2);
				}
				desvioPadrao = Math.sqrt(variancia/tamanhoVetor);
			}
		}

		double f = ((double) ((System.currentTimeMillis()-tempoInicio)))/1000;
		System.out.println("\n");
		System.out.println("Vetor de tamanho: " + tamanhoVetor);
		System.out.println("Tempo Total: " + f + "segundos");
		System.out.println("Soma Total: " + somador);
		System.out.println("Media: " + media);
		System.out.println("Desvio Padrão: " + (desvioPadrao-media));
		//System.out.println("\n");
		
		//VETOR DE 10.000
		tamanhoVetor = 10000;
		media = 0;
		variancia = 0;
		desvioPadrao = 0;
		somador = 0;
		tempoInicio = System.currentTimeMillis();

		//criando o objeto vetor de inteiros
		int array2[] = new int[tamanhoVetor];
		int array_variancia2[] = new int[tamanhoVetor];
		
		for (int i = 0; i <= tamanhoVetor-1; i++) {
   			array2[i] = (r.nextInt())%100;
   			array_variancia2[i] = array2[i];
			array2[i] = array2[i] * array2[i];
			somador += array2[i];
		
			//System.out.println(array[i]);
			if(i == tamanhoVetor-1){
				media = (int) (somador/tamanhoVetor);
				for(int j = 0; j < tamanhoVetor-1; j++){
					variancia += Math.pow((array_variancia2[j] - media), 2);
				}
				desvioPadrao = Math.sqrt(variancia/tamanhoVetor);
			}
		}

		f = ((double) ((System.currentTimeMillis()-tempoInicio)))/1000;
		System.out.println("\n");
		System.out.println("Vetor de tamanho: " + tamanhoVetor);
		System.out.println("Tempo Total: " + f + "segundos");
		System.out.println("Soma Total: " + somador);
		System.out.println("Media: " + media);
		System.out.println("Desvio Padrão: " + (desvioPadrao-media));
		//System.out.println("\n");

		//VETOR DE 100.000
		tamanhoVetor = 100000;
		media = 0;
		variancia = 0;
		desvioPadrao = 0;
		somador = 0;
		tempoInicio = System.currentTimeMillis();

		//criando o objeto vetor de inteiros
		int array3[] = new int[tamanhoVetor];
		int array_variancia3[] = new int[tamanhoVetor];
		
		for (int i = 0; i <= tamanhoVetor-1; i++) {
   			array3[i] = (r.nextInt())%100;
   			array_variancia3[i] = array3[i];
			array3[i] = array3[i] * array3[i];
			somador += array3[i];
		
			//System.out.println(array[i]);
			if(i == tamanhoVetor-1){
				media = (int) (somador/tamanhoVetor);
				for(int j = 0; j < tamanhoVetor-1; j++){
					variancia += Math.pow((array_variancia3[j] - media), 2);
				}
				desvioPadrao = Math.sqrt(variancia/tamanhoVetor);
			}
		}

		f = ((double) ((System.currentTimeMillis()-tempoInicio)))/1000;
		System.out.println("\n");
		System.out.println("Vetor de tamanho: " + tamanhoVetor);
		System.out.println("Tempo Total: " + f + "segundos");
		System.out.println("Soma Total: " + somador);
		System.out.println("Media: " + media);
		System.out.println("Desvio Padrão: " + (desvioPadrao-media));
		//System.out.println("\n");

		//VETOR DE 100.000.000
		tamanhoVetor = 100000000;
		media = 0;
		variancia = 0;
		desvioPadrao = 0;
		somador = 0;
		tempoInicio = System.currentTimeMillis();

		//criando o objeto vetor de inteiros
		int array4[] = new int[tamanhoVetor];
		int array_variancia4[] = new int[tamanhoVetor];
		
		for (int i = 0; i <= tamanhoVetor-1; i++) {
   			array4[i] = (r.nextInt())%100;
   			array_variancia4[i] = array4[i];
			array4[i] = array4[i] * array4[i];
			somador += array4[i];
		
			//System.out.println(array[i]);
			if(i == tamanhoVetor-1){
				media = (int) (somador/tamanhoVetor);
				for(int j = 0; j < tamanhoVetor-1; j++){
					variancia += Math.pow((array_variancia4[j] - media), 2);
				}
				desvioPadrao = Math.sqrt(variancia/tamanhoVetor);
			}
		}

		f = ((double) ((System.currentTimeMillis()-tempoInicio)))/1000;
		System.out.println("\n");
		System.out.println("Vetor de tamanho: " + tamanhoVetor);
		System.out.println("Tempo Total: " + f + "segundos");
		System.out.println("Soma Total: " + somador);
		System.out.println("Media: " + media);
		System.out.println("Desvio Padrão: " + (desvioPadrao-media));
		
		}


}
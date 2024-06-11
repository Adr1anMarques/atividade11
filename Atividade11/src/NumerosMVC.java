import java.util.Arrays;
import java.util.Scanner;

public class NumerosMVC {
	 private int[] numeros;
	    private Scanner scanner;

	    public NumerosMVC() {
	        numeros = new int[10];
	        scanner = new Scanner(System.in);
	    }

	    public void setNumeros() {
	        // Definir os números a serem armazenados
	        numeros = new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
	        // Ordenar o array para a busca binária
	        Arrays.sort(numeros);
	    }

	    public void buscarNumero() {
	        // Solicitar o número a ser buscado
	        System.out.print("Digite um número a ser buscado: ");
	        int numero = scanner.nextInt();

	        // Realizar a busca binária
	        int posicao = buscaBinaria(numero);

	        // Mostrar o resultado
	        if (posicao != -1)
	            System.out.println("O número foi encontrado na posição: " + posicao);
	        else
	            System.out.println("O número não foi encontrado.");
	    }

	    private int buscaBinaria(int numero) {
	        int inicio = 0;
	        int fim = numeros.length - 1;

	        while (inicio <= fim) {
	            int meio = inicio + (fim - inicio) / 2;

	            // Verificar se o número está no meio do array
	            if (numeros[meio] == numero)
	                return meio;

	            // Se o número for menor que o do meio, procurar na metade esquerda
	            if (numeros[meio] < numero)
	                inicio = meio + 1;
	            // Caso contrário, procurar na metade direita
	            else
	                fim = meio - 1;
	        }
	        // Retornar -1 se o número não for encontrado
	        return -1;
	    }

	    public static void main(String[] args) {
	        NumerosMVC numerosMVC = new NumerosMVC();
	        numerosMVC.setNumeros();
	        numerosMVC.buscarNumero();
	    }

}

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int vetor[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
	
		System.out.print("Digite o número a ser pesquisado: ");
		int n = leitor.nextInt();
		
		pesquisarValor(vetor, n);
		leitor.close();
		
					
		
	}
	
	private static void pesquisarValor(int vetor[], int n) {
		
		boolean encontrado = false;
		
		for (int i = 0; i< vetor.length; i++) {
			if (vetor[i] == n) encontrado = true;
			
		}
		if (encontrado) {
			System.out.printf("O número %d existe no vetor", n);
		}else {
			System.out.printf("O número %d não existe no vetor", n);
		}
	}
	
}

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int vetor[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
		
		System.out.print("Digite o numero a ser pesquisado: ");
		int n = leitor.nextInt();
		
		pesquisarValor(vetor, n);
		
		leitor.close();
		
	}

	private static void pesquisarValor(int vetor[], int n) {
		
		int cont = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == n) cont++; 
		}
		
		if (cont > 0) {
			System.out.printf("O número %d aparece %d vez(es) no vetor", n, cont);
		} else {
			System.out.printf("O número %d não existe no vetor", n);
		
		}
	
	}

}

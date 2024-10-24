/*Contagem de Números Positivos e Negativos: Leia 10 números e conte quantos 
 * são positivos e quantos são negativos.
 */
// Realizado por Caio Alves

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont_posi = 0;
		int cont_nega = 0;
		int[] nums = new int[10];

		for (int i = 0; i <= 9; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			nums[i] = sc.nextInt();
			if (nums[i] > 0) {
				cont_posi++;
			} else if (nums[i] < 0) {
				cont_nega++;
			}
		}
		System.out.printf("Quantidade de números positivos: %d%n", cont_posi);
		System.out.printf("Quantidade de números negativos: %d%n", cont_nega);
		System.out.println("\nOBS: O 0 (zero) é neutro, por isso não se adequa aos requerimentos do exercício.");

		sc.close();
	}

}

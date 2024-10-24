/*Simulação de Loteria: Gere 6 números aleatórios entre 1 e 60 e imprima-os.
 */
// PC 5 - Caio Alves

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("Números sorteados: ");
		for (int i = 1; i <= 6; i++) {
			int loteria = random.nextInt(60);
			System.out.println(loteria);
		}
	}

}

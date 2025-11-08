public class App {
    public static void main(String[] args) throws Exception {

		boolean correcto = false;
		int altura = 0;

		do {
			try {
				System.out.print("Por favor, introduce la altura del árbol: ");
				altura = Integer.parseInt(System.console().readLine());
				correcto = altura >= 4;
				if (!correcto) System.out.println("Lo siento, la altura debe ser mayor o igual a 4");
			}
			catch (NumberFormatException e) {
				System.out.println("El número debe ser un entero.");
			}
			catch (Exception e) {
				System.out.println("Ha ocurrido un error inesperado.");
			}
		} while (!correcto);

		for (int i = 1; i <= altura; i++) {
			int j = 1;
			while (i == 1 && j <= altura - 2) {
				System.out.print(j < altura - 2 ? " " : "*");
				j++;
			}
			while (j <= (altura - 2) * 2 - 1) {
				System.out.print((i == altura - 1 || j == altura - (i - 1) - 2 || j == altura + (i - 1) - 2) ? "^" : " ");
				j++;
			}
			while (j <= altura - 2) {
				System.out.print(j < altura - 2 ? " " : "Y");
				j++;
			}
			System.out.println();
		}
		

		/* for (int i = 1; i <= altura; i++) {
			if (i == 1) {
				for (int j = 1; j <= altura - 2; j++)
					System.out.print(j < altura - 2 ? " " : "*");	
				System.out.println();
			}

			for (int j = 1; j <= (altura - 2) * 2 - 1; j++)
				System.out.print((i == altura - 2 || j == altura - (i - 1) - 2 || j == altura + (i - 1) - 2) ? "^" : " ");
			System.out.println();

			if (i == altura - 2) {
				for (int j = 1; j <= altura - 2; j++)
					System.out.print(j < altura - 2 ? " " : "Y");
				System.out.println();
			}
		} */

	}
}

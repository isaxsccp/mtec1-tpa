import java.util.Scanner;
public class Ex1 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       final int TAM = 20;
       int[] A = new int[TAM];
       int[] B = new int[TAM];
       int par = 0;
       int impar = TAM - 1;
       System.out.println("Digite os numeros do vetor A:");
       for (int i = 0; i < TAM; i++) {
           System.out.print("Nuemro " + (i + 1) + ": ");
           A[i] = scanner.nextInt();
       }
       for (int i = 0; i < tamanho; i++) {
           if (A[i] % 2 == 0) {
               B[par] = A[i];
               par++;
           } else {
               B[impar] = A[i];
               impar--;
           }
       }
       System.out.print("Vetor B (pares e ímpares): ");
       for (int i = 0; i < tamanho; i++) {
           System.out.print(B[i] + " ");
       }
   }
}

import java.util.Scanner;
public class Ex2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a[]; //cria vetor a
        a = new int[10]; //vetor a recebe valor de 10 posições
        for (int i = 0; i < 10; i++) { //abre o laço q inicia o contador e enquanto o numero digitado for menor q 10 ele incrementa
            System.out.println("Digite o numero " + (i + 1) + ": ");
            a[i] = scanner.nextInt(); //leu e incrementou tudo blz
            if (a[i] <= 1) { //se os valores digitados forem menor ou igual a 1..
                System.out.println(a[i] + " não é primo");
            } else {
                int j; //senao (caso for maior)
                for (j = 2; j < a[i]; j++) { //outo laço pra calcular se é primo
                    if (a[i] % j == 0) { //se os valores digitados forem divisíveis por j..
                        System.out.println(a[i] + " não é primo");
                        break;
                    }
                }
                if (j == a[i]) {
                    System.out.println(a[i] + " é primo"); //se j for igual ao numero digitado, tb é primo
                }
            }
        }
    }
}

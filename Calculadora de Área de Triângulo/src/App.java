import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int area;
        int base;
        int altura;

        System.out.println("Digite o valor da base: ");
        base = entrada.nextInt();

        System.out.println("Digite o valor da altura: ");
        altura = entrada.nextInt();

        area = base*altura/2;

        System.out.println("Sua area é " + area + "\n");

        entrada.close();
    }
}
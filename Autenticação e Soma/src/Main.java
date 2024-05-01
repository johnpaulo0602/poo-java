import java.util.Scanner;

public class Main {
    public static void main(String[] args) {     
        Scanner entrada = new Scanner(System.in);
        Processamento p = new Processamento();
     
        System.out.println("Digite sua senha:");
        String senha = entrada.nextLine();
        System.out.println("Sua senha foi criada com sucesso!");

        System.out.println("Digite o primeiro número:"); 
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número:"); 
        int numero2 = entrada.nextInt();

        String inputSenha;
        do {
            System.out.println("Digite sua senha para visualizar o resultado"); 
            inputSenha = entrada.next();
            if (!p.compararSenhas(senha, inputSenha)) {
                System.out.println("Senha incorreta. Digite novamente:");
            }
        } while (!p.compararSenhas(senha, inputSenha));

        System.out.println("Senha correta. Resultado da soma:");
        System.out.println(p.soma(numero1, numero2));

        entrada.close();
    }
}
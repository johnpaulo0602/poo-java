import java.util.Scanner;

public class Main {
    public static void main(String[] args){     
        Scanner entrada = new Scanner(System.in);
        Processamento p = new Processamento();
        // System.out.println("Digite sua senha:"); 
        // String senha = entrada.nextLine();
        p.senha();
       
        System.out.println("Sua senha foi criada com sucesso!");  

        System.out.println("Digite o primeiro numero:"); 
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo numero:"); 
        int numero2 = entrada.nextInt();


        System.out.println(p.soma(numero1, numero2));

    }
}
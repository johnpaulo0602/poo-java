import java.util.Scanner;

public class Processamento {

    public static int soma(int numero1 , int numero2){
        return numero1 + numero2;
    }

    public static String senha(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua senha:"); 
        String senha = entrada.nextLine();

        return senha;
    }

}

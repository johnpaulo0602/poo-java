import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int novoSalario = calcularSalario(6000);
        System.out.println(novoSalario);
    }

    public static int reajuste(int salario){
        int reajuste;
        
        if (salario <= 280) {
            reajuste = 20;
        }else if (salario > 280 && salario <= 700) {
            reajuste = 15;
        }else if (salario > 700 && salario <= 1500) {
            reajuste = 10;
        }else {
            reajuste = 5;
        };        

        return reajuste;
    }

    public static int calcularSalario(int salario){
        int reajuste = reajuste(salario);
        int aumento = salario * reajuste / 100;
        int novoSalario = salario + aumento;
        return novoSalario;
    }
}
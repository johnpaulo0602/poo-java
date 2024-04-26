import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o seu salário:");
        Double salarioInicial = entrada.nextDouble();
        
        Double[] resultados = calcularSalario(salarioInicial);
        
        Double salarioAntesReajuste = resultados[0];
        Double percentualAumento = resultados[1];
        Double valorAumento = resultados[2];
        Double novoSalario = resultados[3];
        Double aumentoRealDescontandoInflacao = resultados[4];
        
        Locale ptBr = new Locale("pt", "BR");
        
        String salarioFormatado = NumberFormat.getCurrencyInstance(ptBr).format(salarioAntesReajuste);
        System.out.println("Salário antes do reajuste: " + salarioFormatado);
        
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        
        String aumentoFormatado = NumberFormat.getCurrencyInstance(ptBr).format(valorAumento);
        System.out.println("Valor do aumento: " + aumentoFormatado);
        
        String novoSalarioFormatado = NumberFormat.getCurrencyInstance(ptBr).format(novoSalario);
        System.out.println("Novo salário após o aumento: " + novoSalarioFormatado);
        
        String aumentoRealFormatado = NumberFormat.getCurrencyInstance(ptBr).format(aumentoRealDescontandoInflacao);
        System.out.println("Aumento real descontando a inflação: " + aumentoRealFormatado);
        
        entrada.close();
    }

    public static Double[] calcularSalario(Double salario){
        Double reajuste = reajuste(salario);
        Double aumento = salario * reajuste / 100;
        Double novoSalario = salario + aumento;
        Double taxaInflacao = 0.038;

        // Formula para descobrir o aumento real do salario = (1 + N) = (1 + R) * (1 + i) ou R = (1 + N) / (1 + i) - 1
        Double aumentoRealDescontandoInflacao = (1 + aumento) / (1 + taxaInflacao) - 1;
        Double[] resultados = {salario, reajuste, aumento, novoSalario, aumentoRealDescontandoInflacao};
        
        return resultados;
    }

    public static Double reajuste(Double salario){
        Double reajuste;
        
        if (salario <= 280) {
            reajuste = 20.0;
        }else if (salario > 280 && salario <= 700) {
            reajuste = 15.0;
        }else if (salario > 700 && salario <= 1500) {
            reajuste = 10.0;
        }else {
            reajuste = 5.0;
        }
        
        return reajuste;
    }
}
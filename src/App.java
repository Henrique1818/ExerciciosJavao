import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner _entradaDados = new Scanner(System.in);
        int _numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        
        System.out.println("\t\t\t ===== Adivinhar números aleatórios =====");
        System.out.println("Digite um número no intervalo de 0 a 100:");
        int numeroEntrada = _entradaDados.nextInt();

        while(true)
        {
            if (numeroEntrada == 0 || numeroEntrada > 100) {
                System.out.println("Valor de entrada fora do intervalo!");
                break;
            }
            else {
                if (numeroEntrada < _numeroAleatorio)
                {
                    System.out.println("\nO número de entrada é menor do que o número secreto!");
                    System.out.println("\n==== Digite um número no intervalo de 0 a 100:");
                    numeroEntrada = _entradaDados.nextInt();
                    tentativas++;
                }
                else if (numeroEntrada > _numeroAleatorio) {
                    System.out.println("\nO número de entrada é maior do que o número secreto!");
                    System.out.println("\n==== Digite um número no intervalo de 0 a 100:");
                    numeroEntrada = _entradaDados.nextInt();
                    tentativas++;
                }
                else{
                    System.out.println(String.format("\nParabéns você acertou o número secreto. Você acertou após %s tentativas.", tentativas));
                    break;
                }
            }
        }

        _entradaDados.close();
    }
}

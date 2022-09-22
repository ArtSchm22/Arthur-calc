import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual operação você deseja fazer: \n" +
                "1 - Soma\n" +
                "2 - Substração\n" +
                "3 - Divisão\n" +
                "4 - Multiplicação\n" +
                "5 - Potência\n" +
                "6 - Raiz Quadrada\n" +
                "7 - Porcentagem\n" +
                "8 - Sair da calculadora");

        int opcao = sc.nextInt();

        switch (opcao){
            case(1) -> {
                Soma calc = new Soma();
                System.out.println("Quantos valores você deseja somar: ");
                int valoresASomar = sc.nextInt();

                for (int i = 0; valoresASomar > i; i++){
                    System.out.println("Digite um número a somar: ");
                    double num = sc.nextDouble();
                    calc.somar(num);
                }

                System.out.println("Resultado: " + calc.getResultado());
                break;
            }
            case(2) -> {
                Subtracao calc = new Subtracao();

                System.out.println("Quantos valores você deseja subtrair: ");
                int valoresASubtrair = sc.nextInt();

                for (int i = 0; valoresASubtrair > i; i++){
                    System.out.println("Digite um número a subtrair: ");
                    double valor = sc.nextDouble();
                    calc.subtrair(valor);
                }

                System.out.println("Resultado: " + calc.getResultado());
                break;
            }
            case(3) -> {
                Divisao calc = new Divisao();

                System.out.println("Digite o número a ser dividido: ");
                double dividendo = sc.nextDouble();
                System.out.println(dividendo + " dividido por: ");
                double divisor = sc.nextDouble();

                calc.dividir(dividendo, divisor);

                System.out.println("Resultado: " + calc.getResultado());
                break;
            }
            case (4) -> {
                Multiplicacao calc = new Multiplicacao();

                System.out.println("Digite o primeiro fator: ");
                double fator = sc.nextDouble();

                System.out.println("Digite o segundo fator: ");
                double fator2 = sc.nextDouble();

                calc.multiplicar(fator, fator2);

                System.out.println("Resultado: " + calc.getResultado());
                break;
            }
            case(5) -> {
                Potencia calc = new Potencia();

                System.out.println("Qual a base da sua potencia: ");
                double base = sc.nextDouble();

                System.out.println("Qual a potencia: ");
                double potencia = sc.nextDouble();

                calc.potenciar(base, potencia);

                System.out.println("Resultado: " +  calc.getResutaldo());
                break;
            }
            case(6) -> {
                RaizQuadrada calc = new RaizQuadrada();

                System.out.println("Deseja saber a raiz quadrada de qual número: ");
                double base = sc.nextDouble();

                calc.raizar(base);

                System.out.println("Resultado: " + calc.getResultado());
                break;
            }
            case(7) -> {
                Porcentagem calc = new Porcentagem();

                System.out.println("Qual o total: ");
                double total = sc.nextDouble();

                System.out.println("Qual a sua quantia: ");
                double quantia = sc.nextDouble();

                calc.fazerPorcentagem(total, quantia);

                System.out.println("Resultado: " + calc.getResultado());
                break;
            }
            default -> {
                System.out.println("Essa operacao nao existe. Beijos <3");
                System.exit(0);
            }
        }
    }
}

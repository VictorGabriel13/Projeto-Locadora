import java.util.Scanner;
// Feito Pela Lenda: Victor Gabriel;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro("Ferrari", "296 GTB", 2025, 1500.0, 2);
        Moto moto = new Moto("Yamaha", "MT 07", 2023, 350.0, 310);

        System.out.println("Seja-Bem Vindo a Locadora");
        System.out.println("Escolha o Veiculo para Alugar");

        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.print("Escolher: ");
        int escolha = scanner.nextInt();

        System.out.print("Quantos dias deseja alugar? ");
        int dias = scanner.nextInt();

        if (escolha == 1) {
            carro.exibirInformacoes();
            double valor = carro.CalcularAluguel(dias);
            System.out.println("Valor Total: R$" + valor);
        }
        else if (escolha == 2) {
            moto.exibirInformacoes();
            double valor = moto.CalcularAluguel(dias);
            System.out.println("Valor Total: R$" + valor);
        }
        else {
            System.out.println("Opção Inválida");
        }
    }
}
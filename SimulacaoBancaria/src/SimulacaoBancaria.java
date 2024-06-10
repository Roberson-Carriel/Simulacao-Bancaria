import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double saque = 0;
        boolean continuar = true;

        while (continuar) {
            Scanner menu = new Scanner (System.in);
            
            System.out.print("|-----------------------------|\n");
            System.out.print("|             Menu            |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Depositar         |\n"); 
            System.out.print("| Opção 2 - Sacar             |\n");
            System.out.print("| Opção 3 - Consultar Saldo   |\n");
            System.out.print("| Opção 0 - Encerrar          |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");
            int opcao = menu.nextInt();
            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    //1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
                    System.out.print("\nOpção Depositar Selecionado\n");
                    System.out.print("\nQual valor a ser depositado ?\n");
                    saldo = scanner.nextInt() + saldo;
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    // O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
                    System.out.print("\nOpção Sacar Selecionado\n");
                    System.out.print("\nQual valor a ser Sacado ?\n");
                    saque = scanner.nextInt();
                        if (saldo > saque) {
                            saldo = saldo-saque;
                            System.out.println("Saldo atual: " + saldo);
                            System.out.println("Programa encerrado.");
                            continuar = false;
                        } else{
                            System.out.print("Saldo insuficiente");
                            System.out.println("Programa encerrado.");
                            continuar = false;
                        }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    // O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
                    System.out.print("\nOpção Consultar Saldo Selecionado\n");
                    System.out.print("Saldo atual: " + saldo);
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

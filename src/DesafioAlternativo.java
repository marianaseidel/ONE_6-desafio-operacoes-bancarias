import java.util.Scanner;

// SOLUÇÃO CASO O DESAFIO FOSSE PARA QUE O CLIENTE DIGITASSE OS DADOS ANTES DA ESCOLHA DAS OPERAÇÕES.

public class DesafioAlternativo {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String name;
        String accountType;
        double balance;

        System.out.println("Digite seu nome.");
        name = leitura.nextLine();
        System.out.println("Digite o tipo da sua conta.");
        accountType = leitura.nextLine();
        System.out.println("Digite seu saldo inicial.");
        balance = leitura.nextDouble();

        int option = 0;
        double valueToReceive = 0;
        double valueToTransfer = 0;

        System.out.println("***********************");
        System.out.println("Nome do cliente: " + name);
        System.out.println("Tipo conta: " + accountType);
        System.out.println("Saldo atual: " + balance);
        System.out.println("***********************");

        String menu = """
                
                Operações dispoíveis:
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;


        while (option != 4) {
            System.out.println(menu);
            option = leitura.nextInt();

            if (option == 1) {
                System.out.println("Seu saldo atual é de R$ " + balance);
            } else if (option == 2) {
                System.out.println("Informe o valor a receber:");
                valueToReceive = leitura.nextDouble();
                balance += valueToReceive;
                System.out.println("Saldo atualizado R$ " + balance);
            } else if (option == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                valueToTransfer = leitura.nextDouble();
                if (valueToTransfer > balance) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    balance -= valueToTransfer;
                    System.out.println("Saldo atualizado R$ " + balance);
                }
            } else if (option == 4) {
                System.out.println("Operação encerrada com sucesso!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}

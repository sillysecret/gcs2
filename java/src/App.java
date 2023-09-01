import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Controle controle = new Controle();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Verificar total de clientes");
            System.out.println("3. Verificar distribuição por gênero");
            System.out.println("4. Buscar cliente por CPF");
            System.out.println("5. Registrar saída de cliente");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a linha restante

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o CPF do cliente: ");
                    int cpf = scanner.nextInt();

                    System.out.print("Digite a idade do cliente: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();  // Consumir a linha restante

                    System.out.print("Digite o gênero do cliente (m/f): ");
                    char genero = scanner.nextLine().charAt(0);

                    controle.adicionaCliente(nome, cpf, idade, genero);
                    break;

                case 2:
                    System.out.println("Total de clientes no bar: " + controle.getNumeroTotalClientes());
                    break;

                case 3:
                    controle.getPercentualGenero('m');  // Isso imprimirá o percentual de clientes masculinos e femininos
                    break;

                case 4:
                    System.out.print("Digite o CPF do cliente que deseja buscar: ");
                    int cpfBusca = scanner.nextInt();
                    scanner.nextLine();  // Consumir a linha restante

                    controle.buscaClienteCPF(cpfBusca);
                    break;

                case 5:
                    System.out.print("Digite o CPF do cliente que está saindo: ");
                    int cpfSaida = scanner.nextInt();
                    scanner.nextLine();  // Consumir a linha restante

                    controle.saidaCliente(cpfSaida);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

public class Controle {
    private int capacidade = 100;
    private Cliente[] clientes;
    private int num_cliente;

    public Controle() {
        clientes = new Cliente[capacidade];
        num_cliente = 0;
    }

    public void adicionaCliente(String nome, int cpf, int idade, char genero) {
        if (num_cliente < capacidade) {
            Cliente cliente = new Cliente(idade, cpf, nome, genero);
            clientes[num_cliente] = cliente;
            num_cliente++;
            System.out.println("Cliente adicionado");
        }
        else{
            System.out.println("Capacidade máxima atingida!");
        }
    }

    public void buscaClienteCPF(int cpf) {
        for (int i = 0; i < num_cliente; i++) {
            if (clientes[i].getCpf() == cpf) {
                System.out.println (clientes[i]);
            }
        }
    }

    public int getNumeroTotalClientes() {
        return num_cliente;
    }

    public void getPercentualGenero(char genero) {
        int cont_m= 0;
        int cont_f= 0;
        for (int i = 0; i < num_cliente; i++) {
            if(clientes[i].getGenero()=='m'){
                cont_m ++;
            }
            else{if(clientes[i].getGenero()=='f'){
                cont_f ++;
            }}
        }
        int total = cont_m + cont_f;
        double percentual_m =  (double) cont_m / num_cliente * 100;
        double percentual_f =  (double) cont_f / num_cliente * 100;
        
        System.out.println("Percentual de clientes masculinos: " + percentual_m + "%");
        System.out.println("Percentual de clientes femininos: " + percentual_f + "%");
    }

    public void saidaCliente(int cpf) {
        for (int i = 0; i < num_cliente; i++) {
            if (clientes[i].getCpf() == cpf) {
                System.out.println("Saída registrada para o cliente: " + clientes[i].getNome());
                // Reorganizando o array para remover o cliente
                for (int j = i; j < num_cliente - 1; j++){
                    clientes[j] = clientes[j+1];
                }
                clientes[num_cliente - 1] = null; // Limpa a última posição
                num_cliente--;
                return;
            }
        }
        System.out.println("Cliente com CPF" + cpf + "não encontrado.");
    }
}
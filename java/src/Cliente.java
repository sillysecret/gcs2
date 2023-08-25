public class Cliente{
    private int cpf;
    private String nome;
    private int idade;
    private String genero;

    public Cliente(int idade,int cpf,String nome,String genero){
        this.setGenero(genero);
        this.setCpf(cpf);
        this.setNome(nome);
        this.setIdade(idade);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }






}

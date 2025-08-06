public class Cliente {
    String nome;
    String cpf;
    String cnpj;

    public Cliente(){}

    //metodo construtor da classe Cliente
    public Cliente(String nome, String cpf, String cnpj){
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;

    }

    @Override
    public String toString() {
        return "Cliente: \n" +
                "Nome = " + nome + "\n" +
                "Cpf = " + cpf + "\n" +
                "Cnpj = " + cnpj + "\n";
    }

}


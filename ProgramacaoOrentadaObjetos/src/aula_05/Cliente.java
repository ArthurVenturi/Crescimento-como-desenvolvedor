package aula_05;

public class Cliente {

    private String cpf;
    private int anoNascimento;
    private String nome;
    private String email;

    public void mostrarCliente() { // método

        System.out.println("Tabela de clientes");
        System.out.println("----------------------");
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Email: " + email);
    }

    public Cliente(String obj_cpf, int obj_anoNascimento, String obj_nome, String obj_email) { // método construtpr
        this.cpf = obj_cpf;
        this.anoNascimento = obj_anoNascimento;
        this.nome = obj_nome;
        this.email = obj_email;
    }

    public Cliente(String obj_cpf, int obj_anoNascimento, String obj_nome) { // método construtor
        this.cpf = obj_cpf;
        this.anoNascimento = obj_anoNascimento;
        this.nome = obj_nome;
    }

    public Cliente() { //Metodo construtor padrão

    }

    public String getCpf() { //método get
        return cpf;
    }

    public void setCpf(String cpf) { //método set
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Cliente cpf = " + cpf + ", anoNascimento = " + anoNascimento + ", nome = " + nome + ", email = " + email;

    }


}

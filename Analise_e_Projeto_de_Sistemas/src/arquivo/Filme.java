package arquivo;

public class Filme {

    private String nome;
    private double duracao;
    private String genero;
    private String classificacao;

    public Filme(String nome, double duracao, String genero, String classificacao) {
        this.nome = nome;
        this.duracao = duracao;
        this.genero = genero;
        this.classificacao = classificacao;
    }
    
    public Filme() {

    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public String toString() {
		return "Filme [nome=" + nome + ", duracao=" + duracao + ", genero=" + genero + ", classificacao="
				+ classificacao + "]" + "\n";
	}

   
}

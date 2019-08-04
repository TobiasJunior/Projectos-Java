
package sistema;

public class Sala {
    private String nome;
    private String numeroDaSala;
    private String capacidade;
    

    public Sala(String nome, String numeroDaSala, String capacidade) {
        this.nome=nome;
        this.numeroDaSala = numeroDaSala;
        this.capacidade = capacidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(String numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String toString() {
        return nome + "-" +numeroDaSala + "-"+capacidade;
    }
   
}

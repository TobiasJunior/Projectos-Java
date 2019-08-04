
package sistema;

/**
 *
 * @author Mateus
 */
public class Elenco {
    private String codigo;
    private String nome;
    private String codigoFilme;

    public Elenco(String codigo, String nome, String codigoFilme) {
        this.codigo = codigo;
        this.nome = nome;
        this.codigoFilme = codigoFilme;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFilme() {
        return codigoFilme;
    }

    public void setCodigoFilme(String codigoFilme) {
        this.codigoFilme = codigoFilme;
    }

    public String toString() {
        return codigo + "-" + nome + "-" + codigoFilme;
    }
   
}

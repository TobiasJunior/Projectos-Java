
package sistema;

/**
 *
 * @author tsaman.sumbane
 */
public class Produtora {
    private String codigo;
    private String nome_produtora;
    private String endereco;

    public Produtora(String codigo, String nome_produtora, String endereco) {
        this.codigo = codigo;
        this.nome_produtora = nome_produtora;
        this.endereco = endereco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome_produtora() {
        return nome_produtora;
    }

    public void setNome_produtora(String nome_produtora) {
        this.nome_produtora = nome_produtora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return codigo + "-" + nome_produtora + "-" + endereco;
    }
    
    
}

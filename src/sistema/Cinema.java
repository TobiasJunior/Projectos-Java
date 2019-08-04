
package sistema;

/**
 *
 * @author tsaman.sumbane
 */
public class Cinema {
    private String codigo;
    private String nome_cinema;
    private String endereco;
    private String contacto;

    public Cinema(String codigo, String nome_cinema, String endereco, String contacto) {
        this.codigo = codigo;
        this.nome_cinema = nome_cinema;
        this.endereco = endereco;
        this.contacto = contacto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome_cinema() {
        return nome_cinema;
    }

    public void setNome_cinema(String nome_cinema) {
        this.nome_cinema = nome_cinema;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    
    public String toString() {
        return codigo + "-" + nome_cinema + "-" + endereco + "-" + contacto;
    }
    
    
}

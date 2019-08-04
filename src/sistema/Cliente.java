
package sistema;

public class Cliente {
    private String codigo;
    private String bi;
    private String nome;
    private String contacto;

    public Cliente(String codigo, String bi, String nome,String contacto) {
        this.codigo=codigo;
        this.bi = bi;
        this.nome = nome;
        this.contacto = contacto;
    }

    public String getCodigo () {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    

    public String toString() {
        return  codigo + "-"+ bi + "-" + nome + "-" + contacto;
    }
    
   
}

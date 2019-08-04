
package sistema;

public class Reservas {
        private String codigo;
        private String bi;
	private String nomeCliente;
	private String nomeFilme;
	private String generoFilme;
	private int contactoCliente;
        private String nomeDaSala;
        private String sala;

    public Reservas(String codigo, String bi, String nomeCliente, String nomeFilme, String generoFilme, int contactoCliente, String nomeDaSala, String sala) {
        this.codigo = codigo;
        this.bi = bi;
        this.nomeCliente = nomeCliente;
        this.nomeFilme = nomeFilme;
        this.generoFilme = generoFilme;
        this.contactoCliente = contactoCliente;
        this.nomeDaSala = nomeDaSala;
        this.sala = sala;
    }

    public String getCodigo() {
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

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public int getContactoCliente() {
        return contactoCliente;
    }

    public void setContactoCliente(int contactoCliente) {
        this.contactoCliente = contactoCliente;
    }

    public String getNomeDaSala() {
        return nomeDaSala;
    }

    public void setNomeDaSala(String nomeDaSala) {
        this.nomeDaSala = nomeDaSala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String toString() {
        return codigo + "-" + nomeCliente + "-" + nomeFilme + "-" + generoFilme + "-" + contactoCliente + "-" + nomeDaSala + "-" + sala;
    }
        


}
 


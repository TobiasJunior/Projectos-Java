
package sistema;

public class Sessao {
        private String codigo;
        private String codigo_filme;
	private String data;
        private String sala;
	private String generoFilme;
        private String ano;
        private String horario; 

    public Sessao(String codigo, String codigo_filme, String data, String sala, String generoFilme, String ano, String horario) {
        this.codigo = codigo;
        this.codigo_filme = codigo_filme;
        this.data = data;
        this.sala = sala;
        this.generoFilme = generoFilme;
        this.ano = ano;
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo_filme() {
        return codigo_filme;
    }

    public void setCodigo_filme(String codigo_filme) {
        this.codigo_filme = codigo_filme;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String toString() {
        return codigo + "-" + codigo_filme + "-" + data + "-" + sala + "-" + generoFilme + "-" + ano  + "-" + horario;
    }

   
}

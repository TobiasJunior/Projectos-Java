
package sistema;

public class Sessao {
  private int codigo;
	private int hora;
	private int data;
	private String nomeFilme;
	private String generoFilme;
	
public Sessao(int codigo, int hora, int data, String nomeFilme,
			String generoFilme) {
		
		this.codigo = codigo;
		this.hora = hora;
		this.data = data;
		this.nomeFilme = nomeFilme;
		this.generoFilme = generoFilme;
	}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public int getHora() {
	return hora;
}

public void setHora(int hora) {
	this.hora = hora;
}

public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
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

public String toString() {
	return "Sessao [codigo=" + codigo + ", hora=" + hora + ", data=" + data
			+ ", nomeFilme=" + nomeFilme + ", generoFilme=" + generoFilme + "]";
    }

}

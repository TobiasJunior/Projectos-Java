
package sistema;

public class Reservas {
   private int codigo;
	private String nomeCliente;
	private String nomeFilme;
	private String generoFilme;
	private int contactoCliente;
	
public Reservas(int codigo, String nomeCliente, String nomeFilme,
			String generoFilme, int contactoCliente) {
	
		this.codigo = codigo;
		this.nomeCliente = nomeCliente;
		this.nomeFilme = nomeFilme;
		this.generoFilme = generoFilme;
		this.contactoCliente = contactoCliente;
	}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
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

public String toString() {
	return "Reservas [codigo=" + codigo + ", nomeCliente=" + nomeCliente
			+ ", nomeFilme=" + nomeFilme + ", generoFilme=" + generoFilme
			+ ", contactoCliente=" + contactoCliente + "]";
	}

}
 


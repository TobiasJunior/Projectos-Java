
package sistema;

public class Funcionario {
   private int codigo;
	private String nome;
	private int contacto;
	private String departamento;
	
public Funcionario(int codigo, String nome, int contacto,
			String departamento) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.contacto = contacto;
		this.departamento = departamento;
	}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getContacto() {
	return contacto;
}

public void setContacto(int contacto) {
	this.contacto = contacto;
}

public String getDepartamento() {
	return departamento;
}

public void setDepartamento(String departamento) {
	this.departamento = departamento;
}

public String toString() {
	return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", contacto="
			+ contacto + ", departamento=" + departamento + "]";
	
	}
}
 


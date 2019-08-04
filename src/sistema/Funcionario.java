
package sistema;

public class Funcionario {
   private String codigo;
	private String nome;
	private String contacto;
        private String sexo;
	private String departamento;

    public Funcionario(String codigo, String nome, String contacto, String sexo, String departamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.contacto = contacto;
        this.sexo = sexo;
        this.departamento = departamento;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
	


public String toString() {
	return codigo + "-" + nome + "-"
			+ contacto + "-"  +sexo +"-"+ departamento;
	
	}
}
 


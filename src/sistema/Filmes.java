
package sistema;

public class Filmes {
    private String codigo;
	private String nome;
	private String genero;
	private String ano;
        private String codigoProdutora;
	
public Filmes (String codigo, String nome, String genero, String ano, String codigoProdutora) {
	
		this.codigo = codigo;
		this.nome = nome;
		this.genero = genero;
		this.ano = ano;
                this.codigoProdutora = codigoProdutora;
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

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public String getAno() {
	return ano;
}

public void setAno(String ano) {
	this.ano = ano;
}
public String getCodigoProdutora() {
	return codigoProdutora;
}

public void setCodigoProdutora(String CodigoProdutora) {
	this.codigoProdutora = codigoProdutora;
}

public String toString() {
	return  codigo + "-" + nome + "-" + genero
			+ "-" + ano + "-" + codigoProdutora;
}
	
}



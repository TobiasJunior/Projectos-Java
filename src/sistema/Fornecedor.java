/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author Edson Nhampossa
 */
public class Fornecedor {
    private String codigo;
    private String nome;
    private String titulo;
    private String genero;
    private String ano;
    private String contacto;

    public Fornecedor(String codigo, String nome, String titulo, String genero, String ano, String contacto) {
        this.codigo = codigo;
        this.nome = nome;
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.contacto = contacto;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String toString() {
        return codigo + "-" + nome + "-" + titulo + "-" + genero + "-" + ano + "-" + contacto;
    }

   
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author tsaman.sumbane
 */
public class Departamento {
    private String codigo_departamento;
    private String nome_departamento;

    public Departamento(String codigo_departamento, String nome_departamento) {
        this.codigo_departamento = codigo_departamento;
        this.nome_departamento = nome_departamento;
    }

    public String getCodigo_departamento() {
        return codigo_departamento;
    }

    public void setCodigo_departamento(String codigo_departamento) {
        this.codigo_departamento = codigo_departamento;
    }

    public String getNome_departamento() {
        return nome_departamento;
    }

    public void setNome_departamento(String nome_departamento) {
        this.nome_departamento = nome_departamento;
    }

    public String toString() {
        return codigo_departamento + "-" + nome_departamento;
    }
    
    
}

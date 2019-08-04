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
public class Atendimento {
    
   private String codigo_func;
   private String codigo_cliente;
   private String data, hora;
   private String servicos;

    public Atendimento(String codigo_func, String codigo_cliente, String data, String hora, String servicos) {
        this.codigo_func = codigo_func;
        this.codigo_cliente = codigo_cliente;
        this.data = data;
        this.hora = hora;
        this.servicos = servicos;
    }

    public String getCodigo_func() {
        return codigo_func;
    }

    public void setCodigo_func(String codigo_func) {
        this.codigo_func = codigo_func;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getServicos() {
        return servicos;
    }

    public void setServicos(String servicos) {
        this.servicos = servicos;
    }

    public String toString() {
        return codigo_func + "-" + codigo_cliente + "-" + data + "-" + hora + "-" + servicos;
    }

   
   
}

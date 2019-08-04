/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author it Solution
 */
public class Bilhete {
    private String cinema;
    private String nib;
    private String data;
    private String sala;
    private String endereco;

    public Bilhete(String cinema, String nib, String data, String sala, String endereco) {
        this.cinema = cinema;
        this.nib = nib;
        this.data = data;
        this.sala = sala;
        this.endereco = endereco;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public String getNib() {
        return nib;
    }

    public void setNib(String nib) {
        this.nib = nib;
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
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco= endereco;
    }

    public String toString() {
        return cinema + "-" + nib + "-" + data + "-" + sala + "-" + endereco;
    }
    
    
    
    
}

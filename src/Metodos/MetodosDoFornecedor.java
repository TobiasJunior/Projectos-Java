/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import sistema.Fornecedor;
import sistema.Fornecedor;

/**
 *
 * @author Edson Nhampossa
 */
public class MetodosDoFornecedor {
    static Scanner sc = new Scanner (System.in);
public static void adicionarFornecedor (String codigo, String nome, String titulo,String genero, String ano, String contacto) throws IOException {
       FileWriter file = new FileWriter("dadosDoFornecedor.txt", true );
       BufferedWriter escrever = new BufferedWriter(file);
       
       Fornecedor fn = new Fornecedor(codigo, nome, titulo, genero, ano, contacto);
       escrever.newLine();
       escrever.close();
       file.close();
}

public static int linhasDoFicheiro() throws IOException {
    FileReader file = new FileReader ("dadosDoFornecedor.txt");
    BufferedReader escrever = new BufferedReader(file);
    
    String linha = escrever.readLine();
    int k = 0;
    
        while (linha!=null && !linha.equals("")) {
            k++;
            linha = escrever.readLine();
        }
        escrever.close();
        file.close();
        return k;
    
}
public static Vector<Fornecedor>  listaDoAtendimento() throws IOException{
	
	Vector <Fornecedor> fr = new Vector <>(linhasDoFicheiro());
	
	FileReader ficheiro = new FileReader ("dadosDoFornecedor.txt");
	BufferedReader escrever = new BufferedReader (ficheiro);
	
	String codigo, nome,titulo,  genero, ano,contacto;
	
	String [] elementosDoFornecedor;
	
	String linha = escrever.readLine();
	
	int k= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDoFornecedor = linha.split("-");
		codigo =elementosDoFornecedor[0];
                nome =elementosDoFornecedor[1];
		titulo = elementosDoFornecedor[2];
		genero= elementosDoFornecedor[3];
                ano= elementosDoFornecedor[4];
                contacto = elementosDoFornecedor[5];
	

		fr.add(new Fornecedor(codigo, nome, titulo, genero, ano, contacto));
		
		linha = escrever.readLine();	
		k++;
	}
	
	escrever.close();
	ficheiro.close();	
	
	return fr; 
}

}

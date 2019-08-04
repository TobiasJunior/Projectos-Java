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
import sistema.Cliente;
import sistema.Cliente;

/**
 *
 * @author tsaman.sumbane
 */
public class MetodosDoCliente {
    
    static Scanner sc = new Scanner (System.in);
    
   public static void adicionarCliente(String codigo, String bi, String nome, String contacto) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoCliente.txt", true);
		BufferedWriter escrever = new BufferedWriter (ficheiro);
	
		Cliente cl = new Cliente (codigo, bi, nome, contacto);
		escrever.write(cl .toString());
		escrever.newLine();
		escrever.close();
		ficheiro.close();
	}
   
     public static int linhasDoFicheiro() throws IOException{
	
		
		FileReader ficheiro = new FileReader ("dadosDoCliente.txt");
		BufferedReader escrever = new BufferedReader (ficheiro);
		
		
		String linha = escrever.readLine();
		int linhas = 0;
		
		while(linha != null && !linha.equals("")){
			linhas++;
			linha = escrever.readLine();	
			
		}
		
		escrever.close();
		ficheiro.close();
		
		return linhas;
	}
    public static Vector<Cliente>  listaDoCliente() throws IOException{
	
	Vector <Cliente> cl = new Vector <>(linhasDoFicheiro());
	
	FileReader ficheiro = new FileReader ("dadosDoCliente.txt");
	BufferedReader escrever = new BufferedReader (ficheiro);
	
	
	String codigo, nome, bi, contacto;
	
	String [] elementosDoCliente;
	
	String linha = escrever.readLine();
	
	int k= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDoCliente = linha.split("-");
                codigo = elementosDoCliente[0];
		bi= elementosDoCliente[1];
		nome = elementosDoCliente [2];
                contacto= elementosDoCliente[3];

		cl.add( new Cliente(codigo, bi, nome, contacto));
		
		linha = escrever.readLine();	
		k++;
	}
	
	escrever.close();
	ficheiro.close();	
	
	return cl;
        
}
    public static void atualizarCliente (Vector<Cliente> cl1, String bi, String nome, String contacto) throws IOException {
	
	
	for (int i=0;i< cl1.size();i++)
	{
            if(bi.equalsIgnoreCase(cl1.get(i).getBi()))
		{
		
                cl1.get(i).setNome(nome);
                cl1.get(i).setContacto(contacto);
                }
	}
	
	for(int k=0;k< cl1.size();k++)
	{
		escreverNoFicheiroDepoisDeActualizar(cl1);
	}	
}
    
    public static void escreverNoFicheiroDepoisDeActualizar(Vector<Cliente> cl1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoCliente.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<cl1.size();i++)
		{
			escrever.write(cl1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
    
     public static void remover(Vector <Cliente> cl1,String bi)throws IOException
	{
		FileWriter criarFicheiro= new FileWriter("ClientesRemovidos.txt", true);
		BufferedWriter escreverFicheiro= new BufferedWriter(criarFicheiro);
		for(int i=0;i<cl1.size();i++)
		{
			
			if(bi==cl1.get(i).getBi());
			{
				
				cl1.remove(i);
			}
		}
               for(int i=0;i<cl1.size();i++) {
                   escreverNoFicheiroDepoisDeRemover(cl1);
               }
		escreverFicheiro.close();
		criarFicheiro.close();
		
	}
    public static void escreverNoFicheiroDepoisDeRemover(Vector<Cliente> cl1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoCliente.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<cl1.size();i++)
		{
			escrever.write(cl1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
}

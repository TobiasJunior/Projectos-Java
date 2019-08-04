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
import sistema.Bilhete;

/**
 *
 * @author it Solution
 */
public class MetodosDoBilhete {
     static Scanner sc = new Scanner (System.in);
    public static void adicionarSessaoNoFicheiro (String cinema, String nib, String data, String sala, String endereco) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoBilhete.txt", true);
		BufferedWriter escrever = new BufferedWriter (ficheiro);
	
		Bilhete bt = new Bilhete(cinema, nib, data, sala, endereco);
		escrever.write(bt .toString());
		escrever.newLine();
		escrever.close();
		ficheiro.close();
	}
    
    public static int linhasDoFicheiro() throws IOException{
	
		
		FileReader ficheiro = new FileReader ("dadosDoBilhete.txt");
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
    
    public static Vector<Bilhete>  listaDoBilhete() throws IOException{
	
	Vector <Bilhete> bt = new Vector <>(linhasDoFicheiro());
	
	FileReader ficheiro = new FileReader ("dadosDoBilhete.txt");
	BufferedReader escrever = new BufferedReader (ficheiro);
	
	String cinema, nib, data, sala, endereco;
	
	String [] elementosDoBilhete;
	
	String linha = escrever.readLine();
	
	int k= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDoBilhete = linha.split("-");
		cinema =elementosDoBilhete[0];
                nib =elementosDoBilhete[1];
		data = elementosDoBilhete[2];
		sala= elementosDoBilhete[3];
                endereco= elementosDoBilhete[4];

		bt.add(new Bilhete (cinema, nib, data, sala, endereco));
		
		linha = escrever.readLine();	
		k++;
	}
	
	escrever.close();
	ficheiro.close();	
	
	return bt; 
}
    public static void atualizarBilhete (Vector<Bilhete> bt1, String cinema,
		 String nib, String data, String sala) throws IOException {
	
	
	for (int i=0;i< bt1.size();i++)
	{
		if(nib.equalsIgnoreCase(bt1.get(i).getNib()))
		{
		bt1.get(i).setData(data);
		bt1.get(i).setCinema(cinema);
		bt1.get(i).setSala(sala);
		
		}
	}
	
	for(int k=0;k< bt1.size();k++)
	{
		escreverNoFicheiroDepoisDeActualizar(bt1);
	}	
	}
	
	public static void escreverNoFicheiroDepoisDeActualizar(Vector<Bilhete> bt1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoBilhete.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<bt1.size();i++)
		{
			escrever.write(bt1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
        
        public static void remover(Vector <Bilhete> bt1,String nib)throws IOException
	{
		FileWriter criarFicheiro= new FileWriter("BilhetesRemovidos.txt", true);
		BufferedWriter escreverFicheiro= new BufferedWriter(criarFicheiro);
		for(int i=0;i<bt1.size();i++)
		{
			
			if(nib.equalsIgnoreCase(bt1.get(i).getNib()));
			{
				escreverFicheiro.write(bt1.get(i).toString());
				escreverFicheiro.newLine();
				bt1.remove(i);
			}
		}
		escreverFicheiro.close();
		criarFicheiro.close();
		
	}
            
            public static void escreverNoFicheiroDepoisDeRemover(Vector<Bilhete> bt1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoBilhete.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<bt1.size();i++)
		{
			escrever.write(bt1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}

    
}

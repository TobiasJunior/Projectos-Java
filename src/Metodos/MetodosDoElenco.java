
package Metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import sistema.Elenco;

public class MetodosDoElenco {
     static Scanner sc = new Scanner (System.in);
    public static void adicionarElencoNoFicheiro (String codigo, String nome, String codigoFilme) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoElenco.txt", true);
		BufferedWriter escrever = new BufferedWriter (ficheiro);
	
		Elenco el = new Elenco(codigo, nome, codigoFilme);
		escrever.write(el.toString());
		escrever.newLine();
		escrever.close();
		ficheiro.close();
	}
     public static int linhasDoFicheiro() throws IOException{
	
		
		FileReader ficheiro = new FileReader ("dadosDoElenco.txt");
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
     public static Vector<Elenco>  listaDoElenco() throws IOException{
	
	Vector <Elenco> el = new Vector <>(linhasDoFicheiro());
	
	FileReader ficheiro = new FileReader ("dadosDoElenco.txt");
	BufferedReader escrever = new BufferedReader (ficheiro);
	
	String codigo, nome, codigoFilme;
	
	String [] elementosDoElenco;
	
	String linha = escrever.readLine();
	
	int k= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDoElenco = linha.split("-");
		codigo =elementosDoElenco[0];
                nome =elementosDoElenco[1];
		codigoFilme = elementosDoElenco[2];

		el.add(new Elenco (codigo, nome, codigoFilme));
		
		linha = escrever.readLine();	
		k++;
	}
	
	escrever.close();
	ficheiro.close();	
	
	return el; 
}
}

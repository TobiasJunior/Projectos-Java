
package Metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import sistema.Cinema;
import sistema.Cinema;

/**
 *
 * @author tsaman.sumbane
 */
public class MetodosDoCinema {
    static Scanner sc= new Scanner (System.in);
    
public static void adicionarCinema (String codigo, String nome_cinema, String endereco, String contacto) throws IOException {
    FileWriter file = new FileWriter("dadosDoCinema.txt", true);
    BufferedWriter buffer = new BufferedWriter(file);
    
    Cinema cn = new Cinema (codigo, nome_cinema, endereco, contacto);
    buffer.write(cn.toString());
    buffer.newLine();
    buffer.close();
    file.close();
}    

public static int linhasDoFicheiro () throws IOException {
    FileReader file = new FileReader("dadosDoCinema.txt");
    BufferedReader buffer = new BufferedReader(file);
    
    String linha = buffer.readLine();
    int k =0;
    
    while (linha != null && !linha.equals("")) {
        k++;
        linha = buffer.readLine();
    }
    buffer.close();
    file.close();
    return k;
}

public static Vector <Cinema> listaDeCinema () throws IOException {
    Vector <Cinema> cn = new Vector <Cinema> (linhasDoFicheiro());
     FileReader file = new FileReader ("dadosDoCinema.txt");
	BufferedReader escrever = new BufferedReader (file);
	
        
	String codigo, nome_cinema, endereco, contacto;
	
	String [] elementosDoCinema;
	
	String linha = escrever.readLine();
	
	int j= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDoCinema = linha.split("-");
		codigo = elementosDoCinema[0];
		nome_cinema = elementosDoCinema[1];
                endereco = elementosDoCinema[2];
                contacto = elementosDoCinema[3];

		cn.add (new Cinema(codigo, nome_cinema, endereco, contacto));
		
		linha = escrever.readLine();	
		j++;
	}
	
	escrever.close();
	file.close();	
	
	return cn; 
    
    
}
    public static void atualizarCinema(Vector<Cinema> cn1, String codigo,
		String nome_cinema, String endereco, String contacto) throws IOException {
	
	
	for (int i=0;i< cn1.size();i++)
	{
		if(codigo.equalsIgnoreCase(cn1.get(i).getCodigo()))
		{
		cn1.get(i).setNome_cinema(nome_cinema);
                cn1.get(i).setEndereco(endereco);
                cn1.get(i).setContacto(contacto);
		
		}
	}
	
	for(int k=0;k< cn1.size();k++)
	{
		escreverNoFicheiroDepoisDeActualizar(cn1);
	}	
	}
            public static void escreverNoFicheiroDepoisDeActualizar(Vector<Cinema> cn1) throws IOException
	{
		
		FileWriter file = new FileWriter ("dadosDoCinema.txt");
		BufferedWriter escrever = new BufferedWriter(file);
	
		for(int i=0;i<cn1.size();i++)
		{
			escrever.write(cn1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		file.close();
	}
            
            public static void remover(Vector <Cinema> cn1,String codigo)throws IOException
	{
		FileWriter criarFicheiro= new FileWriter("CinemasRemovidos.txt", true);
		BufferedWriter escreverFicheiro= new BufferedWriter(criarFicheiro);
		for(int i=0;i<cn1.size();i++)
		{
			
			if(codigo.equalsIgnoreCase(cn1.get(i).getCodigo()));
			{
				escreverFicheiro.write(cn1.get(i).toString());
				escreverFicheiro.newLine();
				cn1.remove(i);
			}
		}
		escreverFicheiro.close();
		criarFicheiro.close();
		
	}
            
            public static void escreverNoFicheiroDepoisDeRemover(Vector<Cinema> cn1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoCinema.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<cn1.size();i++)
		{
			escrever.write(cn1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
}


package Metodos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import sistema.Filmes;
import sistema.Filmes;

public class MetodosDoFilme {
  public static Scanner a = new Scanner (System.in);
	
	public static void adicionarFilmeNoFicheiro(String codigo, String nome,
                String genero, String ano, String codigoProdutora) throws IOException
	{
		
		FileWriter file = new FileWriter ("dadosDoFilme.txt", true);
		BufferedWriter buffer = new BufferedWriter(file);
	
		String fn = codigo +"-"+ nome +"-"+ genero +"-"+ ano +"-"+ codigoProdutora;
		buffer.write(fn.toString());
		buffer.newLine();
		buffer.close();
		file.close();
	}
	
	public static int linhasDoFicheiro() throws IOException{
	
		
		FileReader file = new FileReader ("dadosDoFilme.txt");
		BufferedReader buffer = new BufferedReader (file);
		
		
		String linha = buffer.readLine();
		int linhas = 0;
		
		while(linha != null && !linha.equals("")){
			linhas++;
			linha = buffer.readLine();	
			
		}
		
		buffer.close();
		file.close();
		
		return linhas;
	}
	
	public static Vector<Filmes>  listaDeFilme() throws IOException{
		
	  Vector <Filmes> fn = new Vector <Filmes>(linhasDoFicheiro());
		
		FileReader file = new FileReader ("dadosDoFilme.txt");
		BufferedReader buffer = new BufferedReader (file);
		
		String nome, genero, ano, codigo, codigoProdutora;
		
		String [] elementosDoFilme;
		
		String linha = buffer.readLine();
		
		int k= 0;
		
		while(linha != null && !linha.equals("")){
			
			elementosDoFilme = linha.split("-");
			codigo= elementosDoFilme[0];
			nome = elementosDoFilme[1];
			genero = elementosDoFilme[2];
			ano = elementosDoFilme[3];
                        codigoProdutora = elementosDoFilme[4];
	
			fn.add( new Filmes (codigo,nome, genero, ano, codigoProdutora));
			
			linha = buffer.readLine();	
			k++;
		}
		
		buffer.close();
		file.close();	
		
		return fn; 
	}
	
	public static void atualizarFilme(Vector <Filmes> fn1,String codigo, String nome,
			String genero, String ano) throws IOException {
		
		
		for (int i=0;i< fn1.size();i++)
		{
			if(codigo.equalsIgnoreCase(fn1.get(i).getCodigo()))
			{
			
                            fn1.get(i).setNome(nome);
			fn1.get(i).setGenero(genero);
			fn1.get(i).setAno(ano);
			}
		}
		
		for(int k=0;k< fn1.size();k++)
		{
			escreverNoFicheiroDepoisDeActualizarFilme(fn1);
		}
		
	}
	
	public static void escreverNoFicheiroDepoisDeActualizarFilme(Vector <Filmes> fn1) throws IOException
	{
		
		FileWriter file = new FileWriter ("dadosDoFilme.txt");
		BufferedWriter buffer = new BufferedWriter(file);
	
		for(int i=0;i<fn1.size();i++)
		{
			buffer.write(fn1.get(i).toString());
			buffer.newLine();
		}
		
		buffer.close();
		file.close();
	}
	
	public static void removerFilme(Vector <Filmes>fn1,String nome)throws IOException
	{
		FileWriter criarFicheiro= new FileWriter("FilmesRemovidos.txt", true);
		BufferedWriter escreverFicheiro= new BufferedWriter(criarFicheiro);
		for(int i=0;i<fn1.size();i++)
		{
			
			if(nome.equalsIgnoreCase(fn1.get(i).getNome()))
			{
				escreverFicheiro.write(fn1.get(i).toString());
				escreverFicheiro.newLine();
				fn1.remove(i);
				
			}
		}
                for (int i=0;i<fn1.size();i++) {
                    escreverNoFicheiroDepoisDeRemoverFilme(fn1);
                }
		escreverFicheiro.close();
		criarFicheiro.close();
		
	}
	
	public static void escreverNoFicheiroDepoisDeRemoverFilme(Vector<Filmes> fn1) throws IOException
	{
		
		FileWriter file = new FileWriter ("dadosDoFilme.txt");
		BufferedWriter buffer = new BufferedWriter(file);
	
		for(int i=0;i<fn1.size();i++)
		{
			buffer.write(fn1.get(i).toString());
			buffer.newLine();
		}
		
		buffer.close();
		file.close();
	}
        
  
}

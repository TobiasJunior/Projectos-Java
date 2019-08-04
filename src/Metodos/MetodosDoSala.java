
package Metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import sistema.Sala;
import sistema.Sala;

public class MetodosDoSala {
    static Scanner sc = new Scanner (System.in);
    
public static void adicionarSala (String nome, String numeroDaSala, String capacidade) throws IOException {
    FileWriter ficheiro = new FileWriter("dadosDaSala.txt", true);
    BufferedWriter escrever = new BufferedWriter(ficheiro);
    Sala sa = new Sala (nome, numeroDaSala, capacidade);
    escrever.write(sa.toString());
    escrever.newLine();
    escrever.close();
    ficheiro.close();
    
}    

public static int linhasDoFicheiro () throws IOException {
    FileReader ficheiro = new FileReader("dadosDaSala.txt");
    BufferedReader escrever = new BufferedReader(ficheiro);
    
    String linha = escrever.readLine();
    int linhas = 0;
    
    while (linha != null && !linha.equals("")) {
        linhas++;
        linha = escrever.readLine();
    }
    escrever.close();
    ficheiro.close();
    
    return linhas;
}
    
    public static Vector <Sala> listaDeSala () throws IOException{
             Vector <Sala> sa = new Vector <Sala>(linhasDoFicheiro());
		
		FileReader ficheiro = new FileReader ("dadosDaSala.txt");
		BufferedReader escrever = new BufferedReader (ficheiro);
		
                String nome, numeroDaSala, capacidade; 

		String [] elementosDaSala;
		
		String linha = escrever.readLine();
		
		int k= 0;
		
		while(linha != null && !linha.equals("")){
			
			elementosDaSala = linha.split("-");
                        nome = elementosDaSala[0];
			numeroDaSala= elementosDaSala[1];
                        capacidade = elementosDaSala[2];
			
			sa.add( new Sala(nome, numeroDaSala, capacidade));
			
			linha = escrever.readLine();	
			k++;
		}
		
		escrever.close();
		ficheiro.close();	
		
		return sa; 
}
    public static void atualizarSala(Vector <Sala> sa1, String nome, String numeroDaSala, 
			String capacidade) throws IOException {
		
		
		for (int i=0;i< sa1.size();i++)
		{
                    
                    if (numeroDaSala.equalsIgnoreCase(sa1.get(i).getNumeroDaSala())) {
                        sa1.get(i).setNome(nome);
			sa1.get(i).setNumeroDaSala(numeroDaSala);
			sa1.get(i).setCapacidade(capacidade);
                    }
		}
		
		for(int k=0;k< sa1.size();k++)
		{
			escreverNoFicheiroDepoisDeActualizarSala(sa1);
		}
		
	}
    
    public static void escreverNoFicheiroDepoisDeActualizarSala(Vector<Sala> sa1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDaSala.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<sa1.size();i++)
		{
			escrever.write(sa1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
    
    public static void removerSala(Vector<Sala>sa1,String numeroDaSala)throws IOException
	{
		FileWriter criarFicheiro= new FileWriter("SalasRemovidas.txt", true);
		BufferedWriter escreverFicheiro= new BufferedWriter(criarFicheiro);
		for(int i=0;i<sa1.size();i++)
		{
			
			if(numeroDaSala.equalsIgnoreCase(sa1.get(i).getNumeroDaSala()))
			{
				
				sa1.remove(i);
				
			}
		}
                for(int i=0;i<sa1.size();i++)
		{
                    escreverNoFicheiroDepoisDeRemoverSala(sa1);
                }
		escreverFicheiro.close();
		criarFicheiro.close();
		
	}
    
    public static void escreverNoFicheiroDepoisDeRemoverSala(Vector<Sala> sa1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDaSala.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<sa1.size();i++)
		{
			escrever.write(sa1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
    
}
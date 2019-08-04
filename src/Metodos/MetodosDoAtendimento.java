
package Metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import sistema.Atendimento;
import sistema.Atendimento;

/**
 *
 * @author tsaman.sumbane
 */
public class MetodosDoAtendimento {
    static Scanner sc = new Scanner (System.in);
    public static void adicionarSessaoNoFicheiro (String codigo_func, String codigo_cliente, String data,  String hora, 
			String servicos) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoAtendimento.txt", true);
		BufferedWriter escrever = new BufferedWriter (ficheiro);
	
		Atendimento ate = new Atendimento(codigo_func, codigo_cliente, data, hora, servicos);
		escrever.write(ate .toString());
		escrever.newLine();
		escrever.close();
		ficheiro.close();
	}
    
    public static int linhasDoFicheiro() throws IOException{
	
		
		FileReader ficheiro = new FileReader ("dadosDoAtendimento.txt");
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
public static Vector<Atendimento>  listaDoAtendimento() throws IOException{
	
	Vector <Atendimento> ate = new Vector <>(linhasDoFicheiro());
	
	FileReader ficheiro = new FileReader ("dadosDoAtendimento.txt");
	BufferedReader escrever = new BufferedReader (ficheiro);
	
	String codigo_func, codigo_cliente, data, hora, servicos;
	
	String [] elementosDoAtendimento;
	
	String linha = escrever.readLine();
	
	int k= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDoAtendimento = linha.split("-");
		codigo_func =elementosDoAtendimento[0];
                codigo_cliente =elementosDoAtendimento[1];
		data = elementosDoAtendimento[2];
		hora= elementosDoAtendimento[3];
                servicos= elementosDoAtendimento[4];
	

		ate.add(new Atendimento (codigo_func, codigo_cliente, data, hora, servicos));
		
		linha = escrever.readLine();	
		k++;
	}
	
	escrever.close();
	ficheiro.close();	
	
	return ate; 
}
public static void atualizarAtendimento (Vector<Atendimento> ate1, String codigo_func,
		 String data, String hora, String servicos) throws IOException {
	
	
	for (int i=0;i< ate1.size();i++)
	{
		if(codigo_func==ate1.get(i).getCodigo_func())
		{
		ate1.get(i).setData(data);
		ate1.get(i).setHora(hora);
		ate1.get(i).setServicos(servicos);
		
		}
	}
	
	for(int k=0;k< ate1.size();k++)
	{
		escreverNoFicheiroDepoisDeActualizar(ate1);
	}	
	}
	
	public static void escreverNoFicheiroDepoisDeActualizar(Vector<Atendimento> ate1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoAtendimento.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<ate1.size();i++)
		{
			escrever.write(ate1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
}

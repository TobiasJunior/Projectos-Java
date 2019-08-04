
package Metodos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import sistema.Sessao;
import sistema.Sessao;

public class MetodosDaSessao {
    static Scanner sc = new Scanner (System.in);
    public static void adicionarSessaoNoFicheiro (String codigo, String codigo_filme, String data, String sala, String generoFilme, String ano, String horario)  throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDaSessao.txt", true);
		BufferedWriter escrever = new BufferedWriter (ficheiro);
	
		Sessao ss = new Sessao(codigo, codigo_filme, data, sala, generoFilme, ano, horario);
		escrever.write(ss .toString());
		escrever.newLine();
		escrever.close();
		ficheiro.close();
	}
	

public static int linhasDoFicheiro() throws IOException{
	
		
		FileReader ficheiro = new FileReader ("dadosDaSessao.txt");
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
public static Vector<Sessao>  listaDaSessao() throws IOException{
	
	Vector <Sessao> ss = new Vector <>(linhasDoFicheiro());
	
	FileReader ficheiro = new FileReader ("dadosDaSessao.txt");
	BufferedReader escrever = new BufferedReader (ficheiro);
	
	
	String codigo, codigo_filme, data, sala, generoFilme, ano, horario;
	
	String [] elementosDaSessao;
	
	String linha = escrever.readLine();
	
	int k= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDaSessao = linha.split("-");
		codigo= elementosDaSessao[0];
                codigo_filme= elementosDaSessao[1];
		generoFilme= elementosDaSessao[2];
                sala= elementosDaSessao[3];
		data = elementosDaSessao [4];
                ano= elementosDaSessao[5];
                horario= elementosDaSessao[6];
                
	ss.add(new Sessao(codigo, codigo_filme, data, sala, generoFilme, ano, horario));
		
		linha = escrever.readLine();	
		k++;
	}
	
	escrever.close();
	ficheiro.close();	
	
	return ss; 
}

public static void atualizarSessao(Vector<Sessao> ss1, String codigo, String data) throws IOException {
	
	
	for (int i=0;i< ss1.size();i++)
	{
		if(codigo.equalsIgnoreCase(ss1.get(i).getCodigo()))
		{
		
            	ss1.get(i).setData(data);
		
		}
	}
	
	for(int k=0;k< ss1.size();k++)
	{
		escreverNoFicheiroDepoisDeActualizar(ss1);
	}	
	}
	
	public static void escreverNoFicheiroDepoisDeActualizar(Vector<Sessao> ss1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDaSessao.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<ss1.size();i++)
		{
			escrever.write(ss1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
	
	public static void remover(Vector <Sessao> ss1,String codigo)throws IOException
	{
		FileWriter criarFicheiro= new FileWriter("ReservaRemovidos.txt", true);
		BufferedWriter escreverFicheiro= new BufferedWriter(criarFicheiro);
		for(int i=0;i<ss1.size();i++)
		{
			
			if(codigo.equalsIgnoreCase(ss1.get(i).getCodigo()))
			{
				ss1.remove(i);
				
			}
		}
		escreverFicheiro.close();
		criarFicheiro.close();
		
	}
	public static void escreverNoFicheiroDepoisDeRemover(Vector<Sessao> ss1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDaSessao.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<ss1.size();i++)
		{
			escrever.write(ss1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
}


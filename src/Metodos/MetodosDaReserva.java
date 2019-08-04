
package Metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import sistema.Reservas;
import sistema.Reservas;

public class MetodosDaReserva {
    static Scanner sc = new Scanner (System.in);
    public static void adicionarReservaNoFicheiro (String codigo, String nomeCliente, String nomeFilme, String generoFilme, int contactoCliente, String nomeDaSala, String sala) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDaReserva.txt", true);
		BufferedWriter escrever = new BufferedWriter (ficheiro);
	
		String rs = codigo +"-"+ nomeCliente +"-"+ nomeFilme +"-"+ generoFilme+"-"+ contactoCliente +""+ nomeDaSala +"-"+ sala;
		escrever.write(rs .toString());
		escrever.newLine();
		escrever.close();
		ficheiro.close();
	}
    
    public static int linhasDoFicheiro() throws IOException{
	
		
		FileReader ficheiro = new FileReader ("dadosDaReserva.txt");
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
    
    public static Vector<Reservas>  listaDaReserva() throws IOException{
	
	Vector <Reservas> rs = new Vector <>(linhasDoFicheiro());
	
	FileReader ficheiro = new FileReader ("dadosDaReserva.txt");
	BufferedReader escrever = new BufferedReader (ficheiro);
	
	int contactoCliente;
	String codigo, bi, nomeCliente,nomeFilme,generoFilme, nomeDaSala, sala;
	
	String [] elementosDaReserva;
	
	String linha = escrever.readLine();
	
	int k= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDaReserva = linha.split("-");
		codigo= elementosDaReserva[0];
                bi = elementosDaReserva[1];
		nomeCliente = elementosDaReserva [2];
		nomeFilme = elementosDaReserva [3];
		generoFilme = elementosDaReserva[4];
                contactoCliente= Integer.parseInt(elementosDaReserva[5]);
                sala = elementosDaReserva[6];
                nomeDaSala=elementosDaReserva[7];

		rs.add( new Reservas(codigo, bi, nomeCliente, nomeFilme, generoFilme, contactoCliente, nomeDaSala, sala));
		
		linha = escrever.readLine();	
		k++;
	}
	
	escrever.close();
	ficheiro.close();	
	
	return rs; 
}
    
    public static void atualizarReserva (Vector<Reservas> rs1, String codigo,String nomeCliente
		,String nomeFilme, String generoFilme, int contactoCliente) throws IOException {
	
	
	for (int i=0;i< rs1.size();i++)
	{
                    if((codigo.equalsIgnoreCase(rs1.get(i).getCodigo())))
		{
                rs1.get(i).setNomeCliente(nomeCliente);
		rs1.get(i).setNomeFilme(nomeFilme);
		rs1.get(i).setGeneroFilme(generoFilme);
                rs1.get(i).setContactoCliente(contactoCliente);
		}
	}
	
	for(int k=0;k< rs1.size();k++)
	{
		escreverNoFicheiroDepoisDeActualizar(rs1);
	}	
	}
    
    public static void escreverNoFicheiroDepoisDeActualizar(Vector<Reservas> rs1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDaReserva.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<rs1.size();i++)
		{
			escrever.write(rs1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
    public static void remover(Vector <Reservas> rs1,String codigo)throws IOException
	{
		FileWriter criarFicheiro= new FileWriter("ReservasRemovidas.txt", true);
		BufferedWriter escreverFicheiro= new BufferedWriter(criarFicheiro);
		for(int i=0;i<rs1.size();i++)
		{
			
			if((codigo.equalsIgnoreCase(rs1.get(i).getCodigo())))
			{
				escreverFicheiro.write(rs1.get(i).toString());
				escreverFicheiro.newLine();
				rs1.remove(i);
				System.out.println(rs1.get(i).toString());
			}
		}
		escreverFicheiro.close();
		criarFicheiro.close();
		
	}
    
    public static void escreverNoFicheiroDepoisDeRemover(Vector<Reservas> rs1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDaReserva.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<rs1.size();i++)
		{
			escrever.write(rs1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}

}

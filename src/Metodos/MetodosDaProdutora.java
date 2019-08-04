
package Metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import sistema.Produtora;
import sistema.Produtora;

/**
 *
 * @author tsaman.sumbane
 */
public class MetodosDaProdutora {
    static Scanner sc = new Scanner (System.in);
public static void adicionar (String codigo, String nome_produtora, String endereco) throws IOException {
    FileWriter file = new FileWriter("dadosDaProdutora.txt", true);
    BufferedWriter escrever = new BufferedWriter(file);
    
    Produtora pro = new Produtora(codigo, nome_produtora, endereco);
    escrever.write(pro.toString());
    escrever.newLine();
    escrever.close();
    file.close();
}   

 public static int linhasDoFicheiro() throws IOException{
	
		
		FileReader file = new FileReader ("dadosDaProdutora.txt");
		BufferedReader escrever = new BufferedReader (file);
		
		
		String linha = escrever.readLine();
		int linhas = 0;
		
		while(linha != null && !linha.equals("")){
			linhas++;
			linha = escrever.readLine();	
			
		}
		
		escrever.close();
		file.close();
		
		return linhas;
	}
 
 public static Vector<Produtora>  listaDaProdutora() throws IOException{
	
	Vector <Produtora> pro = new Vector <>(linhasDoFicheiro());
	
	FileReader file = new FileReader ("dadosDaProdutora.txt");
	BufferedReader escrever = new BufferedReader (file);
	
	String codigo, nome_produtora,endereco;
	
	String [] elementosDaProdutora;
	
	String linha = escrever.readLine();
	
	int k= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDaProdutora= linha.split("-");
		codigo =elementosDaProdutora[0];
                nome_produtora =elementosDaProdutora[1];
		endereco = elementosDaProdutora[2];

		pro.add(new Produtora(codigo, nome_produtora, endereco));
		
		linha = escrever.readLine();	
		k++;
	}
	
	escrever.close();
	file.close();	
	
	return pro; 
}
  public static void atualizarProdutora (Vector<Produtora> pro1, String codigo, String nome_produtora,
		 String endereco) throws IOException {
	
	
	for (int i=0;i< pro1.size();i++)
	{
		if(codigo.equalsIgnoreCase(pro1.get(i).getCodigo()))
		{
		pro1.get(i).setNome_produtora(nome_produtora);
		pro1.get(i).setEndereco(endereco);
		
		
		}
	}
	
	for(int k=0;k< pro1.size();k++)
	{
		escreverNoFicheiroDepoisDeActualizar(pro1);
	}	
	}  
  
  public static void escreverNoFicheiroDepoisDeActualizar(Vector<Produtora> pro1) throws IOException
	{
		
		FileWriter file = new FileWriter ("dadosDaProdutora.txt");
		BufferedWriter escrever = new BufferedWriter(file);
	
		for(int i=0;i<pro1.size();i++)
		{
			escrever.write(pro1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		file.close();
	}
  
  public static void RemoverProdutora (Vector <Produtora> pro1, String codigo) throws IOException {
            FileWriter file = new FileWriter("produtoraRemovida.txt", true);
            BufferedWriter escrever = new BufferedWriter(file);
            
            for (int i=0; i<pro1.size(); i++) {
                if (codigo.equalsIgnoreCase(pro1.get(i).getCodigo())) {
                    escrever.write(pro1.get(i).toString());
                    escrever.newLine();
                    pro1.remove(i);
                }
            }
            for (int i =0; i<pro1.size(); i++ ) {
                
                escreverDepoisDeRemover(pro1);
            }
            escrever.close();
            file.close();
            
        }
  public static void escreverDepoisDeRemover (Vector <Produtora> pro1) throws IOException {
            FileWriter file = new FileWriter("dadosDaProdutora.txt");
            BufferedWriter escrever = new BufferedWriter(file);
            
            for (int i =0; i<pro1.size(); i++) {
                escrever.write(pro1.get(i).toString());
                escrever.newLine();
                
            }
            escrever.close();
            file.close();
        }
}

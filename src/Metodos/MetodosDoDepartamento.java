
package Metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import sistema.Departamento;
import sistema.Departamento;

/**
 *
 * @author tsaman.sumbane
 */
public class MetodosDoDepartamento {
    static Scanner sc = new Scanner (System.in);
public static void adicionarDepartamento (String codigo_departamento, String nome_departamento) throws IOException{
    FileWriter file = new FileWriter("dadosDoDepartamento.txt", true);
    BufferedWriter escrever = new BufferedWriter(file);
    Departamento de = new Departamento(codigo_departamento, nome_departamento);
    
    escrever.write(de.toString());
    escrever.newLine();
    escrever.close();
    file.close(); 
    
    }

public static int linhasDoFicheiro () throws IOException {
    FileReader file = new FileReader("dadosDoDepartamento.txt");
    BufferedReader escrever = new BufferedReader(file);
    
    String linhas = escrever.readLine();
    int k =0;
        while (linhas != null && !linhas.equals("")) {
            linhas = escrever.readLine();
            k++;
        }
    escrever.close();
    file.close();
    return k;
}

public static Vector <Departamento> listaDeDepartamento() throws IOException {
     Vector <Departamento> de = new Vector <Departamento> (linhasDoFicheiro());
     FileReader file = new FileReader ("dadosDoDepartamento.txt");
	BufferedReader escrever = new BufferedReader (file);
	
	String codigo_departamento, nome_departamento;
	
	String [] elementosDoDepartamento;
	
	String linha = escrever.readLine();
	
	int j= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDoDepartamento = linha.split("-");
		codigo_departamento = elementosDoDepartamento[0];
		nome_departamento = elementosDoDepartamento[1];

		de.add (new Departamento (codigo_departamento, nome_departamento));
		
		linha = escrever.readLine();	
		j++;
	}
	
	escrever.close();
	file.close();	
	
	return de; 
    
}
public static void atualizarDepartamento(Vector<Departamento> de1, String codigo_departamento,
		String nome_departamento) throws IOException {
	
	
	for (int i=0;i< de1.size();i++)
	{
		if(codigo_departamento.equalsIgnoreCase(de1.get(i).getCodigo_departamento()))
		{
		de1.get(i).setNome_departamento(nome_departamento);
		
		}
	}
	
	for(int k=0;k< de1.size();k++)
	{
		escreverNoFicheiroDepoisDeActualizar(de1);
	}	
	}
            public static void escreverNoFicheiroDepoisDeActualizar(Vector<Departamento> de1) throws IOException
	{
		
		FileWriter file = new FileWriter ("dadosDoDepartamento.txt");
		BufferedWriter escrever = new BufferedWriter(file);
	
		for(int i=0;i<de1.size();i++)
		{
			escrever.write(de1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		file.close();
	}
            
            public static void removerDepartamento (Vector<Departamento> de1, String codigo_departamento) throws IOException {
                FileWriter file = new FileWriter("removerDepartamento.txt", true); 
                    BufferedWriter escrever = new BufferedWriter(file);
                    
                    for (int i =0;i<de1.size();i++ ) {
                        if (codigo_departamento.equalsIgnoreCase(de1.get(i).getCodigo_departamento())){
                           
                            de1.remove(i);
                        }
                        
                   
                    } 
                     for (int k =0;k<de1.size();k++) {
                        escreverDepoisDeRemover(de1);
                    
                }
                    escrever.close();
                    file.close();
                } 
            
            public static void escreverDepoisDeRemover (Vector<Departamento> de1) throws IOException {
                FileWriter file1 = new FileWriter("dadosDoDepartamento.txt");
                BufferedWriter escrever1 = new BufferedWriter(file1);
                
                for (int i =0;i<de1.size();i++) {
                   escrever1.write(de1.get(i).toString());
                   escrever1.newLine();
                }
                escrever1.close();
                file1.close();
            }
            
            }


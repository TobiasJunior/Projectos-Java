 
package Metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import sistema.Funcionario;
import sistema.Funcionario;

public class MetodosDoFuncionario {
 public static void adicionarFuncionarioNoFicheiro (String codigo, String nome, String contacto, String sexo, String departamento) throws  IOException
	{
		
		          FileWriter ficheiro = new FileWriter ("dadosDoFuncionario.txt", true);
		          BufferedWriter escrever = new BufferedWriter (ficheiro);
	
		Funcionario func = new Funcionario (codigo, nome, contacto, sexo, departamento);
		escrever.write( func.toString());
		escrever.newLine();
		escrever.close();
		ficheiro.close();
	}
	

public static int linhasDoFicheiro() throws IOException{
	
		
		  FileReader ficheiro = new FileReader ("dadosDoFuncionario.txt");
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
public static Vector <Funcionario>  listaDoFuncionario() throws IOException{
	
	   Vector <Funcionario> func = new Vector <>(linhasDoFicheiro());
	
	FileReader ficheiro = new FileReader ("dadosDoFuncionario.txt");
	BufferedReader escrever = new BufferedReader (ficheiro);
	
	
	String nome, departamento, codigo, sexo, contacto;
	
	String [] elementosDoFuncionario;
	
	String linha = escrever.readLine();
	
	int k= 0;
	
	while(linha != null && !linha.equals("")){
	
		elementosDoFuncionario = linha.split("-");
		codigo= elementosDoFuncionario[0];
		nome = elementosDoFuncionario[1];
		contacto = elementosDoFuncionario[2];
                departamento = elementosDoFuncionario[3];
		sexo = elementosDoFuncionario[4];

		func.add( new Funcionario(codigo, nome, contacto, sexo, departamento));
		
		linha = escrever.readLine();	
		k++;
	}
	
	escrever.close();
	ficheiro.close();	
	
	return func; 
}

public static void atualizarFuncionario (Vector <Funcionario> func1, String codigo,
		String nome, String contacto) throws IOException {
	
	
	for (int i=0;i< func1.size();i++)
	{
		if(codigo.equalsIgnoreCase(func1.get(i).getCodigo()))
		{
		func1.get(i).setNome(nome);
		func1.get(i).setContacto(contacto);
		
		}
	}
	
	for(int k=0;k< func1.size();k++)
	{
		escreverNoFicheiroDepoisDeActualizar(func1);
	}	
	}
	
	public static void escreverNoFicheiroDepoisDeActualizar(Vector<Funcionario> func1) throws IOException
	{
		
		FileWriter ficheiro = new FileWriter ("dadosDoFuncionario.txt");
		BufferedWriter escrever = new BufferedWriter(ficheiro);
	
		for(int i=0;i<func1.size();i++)
		{
			escrever.write(func1.get(i).toString());
			escrever.newLine();
		}
		
		escrever.close();
		ficheiro.close();
	}
	
	public static void RemoverFuncionario (Vector <Funcionario> func1, String codigo 
		 ) throws IOException {
            FileWriter ficheiro = new FileWriter("funcionariosRemovidos.txt", true);
            BufferedWriter escrever = new BufferedWriter(ficheiro);
            
            for (int i=0; i<func1.size(); i++) {
                if (codigo.equalsIgnoreCase(func1.get(i).getCodigo())) {
                    escrever.write(func1.get(i).toString());
                    escrever.newLine();
                    func1.remove(i);
                }
            }
            for (int i =0; i<func1.size(); i++ ) {
                
                escreverDepoisDeRemover(func1);
            }
            escrever.close();
            ficheiro.close();
            
        }
	
        public static void escreverDepoisDeRemover (Vector <Funcionario> func1) throws IOException {
            FileWriter ficheiro1 = new FileWriter("dadosDoFuncionario.txt" );
            BufferedWriter escrever1 = new BufferedWriter(ficheiro1);
            
            for (int i =0; i<func1.size(); i++) {
                escrever1.write(func1.get(i).toString());
                escrever1.newLine();
                
            }
            escrever1.close();
            ficheiro1.close();
        }
        
}


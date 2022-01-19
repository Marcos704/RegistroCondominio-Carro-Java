/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import views.telaProcurarVeiculo;

/**
 *
 * @author mark
 */
public class SalvarVeículo extends telaProcurarVeiculo{
    private String cod;
    private String placa;
    private String hora;
    private String data;
    private String veiculo;
    private String nome;
    private String fone;
    private String cpf;
    private String rg;
    private String tipo;
    
    public SalvarVeículo(String cod, String placa, String hora, String data, String veiculo, String nome, String fone, String cpf, String rg, String tipo){
      this.cod = cod;
      this.placa = placa;
      this.hora = hora;
      this.data = data;
      this.veiculo = veiculo;
      this.fone = fone;
      this.cpf = cpf;
      this.rg = rg;
      this.tipo = tipo;
      
    }
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
  
    public int SalvarDados( String nomeArq,
                            String cod, 
                            String placa, 
                            String hora, 
                            String data, 
                            String veiculo, 
                            String nome, 
                            String fone, 
                            String cpf,
                            String rg, 
                            String tipo){
        try{
            
            FileWriter  Arq = new FileWriter("Total.txt",true);
            PrintWriter B   = new PrintWriter(Arq);
            B.printf("%s\n",placa);
            B.close();
            
            FileWriter  arq = new FileWriter(nomeArq + ".txt",true);
            PrintWriter r   = new PrintWriter(arq);
            r.printf("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s",cod, placa, hora, data, veiculo, nome, tipo, fone, cpf, rg);
            r.close();
            arq.close();
            return 1;
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Erro ao salvar veículo!");
            System.exit(0);
        }
        return 0;
    }
    
    public String mostrarDados(String nomeArq,String cod, String placa, String hora, String data, String veiculo, String nome, String fone, String cpf, String rg, String tipo){
        String Nome;
        Nome = nomeArq +".txt";
        try{
           System.setIn(new FileInputStream(new File(Nome)));
        }catch(FileNotFoundException e){
            System.exit(0);
        }
    Scanner n = new Scanner(System.in);
    String linha;
    while(n.hasNext()){
        linha = n.next();
        return linha;
    }
        return "";
    }
    
}

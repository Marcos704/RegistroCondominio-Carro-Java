package functions;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import views.telaLogin;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Loguin extends telaLogin{
    private String UserName;
    private String PassWord;
    
    public Loguin(String Name, String Senha){
        this.UserName = Name;
        this.PassWord = Senha;
    }
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }
    public int mVerificarLoginUser(String userName){
             String nome = "usuarios.txt";
        try{
           System.setIn(new FileInputStream(new File(nome)));
        }catch(FileNotFoundException e){
            CriarData();
            System.exit(0);
        }
    Scanner n = new Scanner(System.in);
    String linha;
    while(n.hasNext()){
        linha = n.next();
        if(linha.equals(userName)){
            return 1;  
        }
    }
        return 0;
 }
    
    /**
     *
     * @param passWord
     * @return
     */
    public int VerificarLoginSenha(String passWord){
             String nome = "senha.txt";
        try{
           System.setIn(new FileInputStream(new File(nome)));
        }catch(FileNotFoundException e){
            System.exit(0);
            CriarData();
        }
    Scanner n = new Scanner(System.in);
    String linha;
    while(n.hasNext()){
        linha = n.next();
        if(linha.equals(passWord)){
            return 1;  
        }
    }
        return 0;
    }
    
    public int CriarData(){
        try{
            FileWriter Data = new FileWriter("usuarios.txt");
            Data.close();
            FileWriter Data1 = new FileWriter("senha.txt");
            Data1.close();
            JOptionPane.showMessageDialog(this, "**|Boya!|**\nDatas Inciciadas...\nReinicie o Sistema e cadastre um\nusuário");
            System.exit(0);
        }catch(HeadlessException | IOException r){
           System.exit(0);
        }
        return 0;
    }
}

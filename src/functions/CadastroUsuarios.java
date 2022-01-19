package functions;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import views.telaAdicionarUsuario;

public class CadastroUsuarios extends telaAdicionarUsuario{
    private String UserName;
    private String Password;

    public CadastroUsuarios(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }
    
    
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public int SalvarUsuario(String Nome){

        try{
            FileWriter arquivo = new FileWriter("usuarios.txt",true);
            PrintWriter data = new PrintWriter(arquivo);
            data.println(Nome);
            data.close();
            arquivo.close();
            return 1;
        }catch(IOException e){
            System.exit(0);
        }
        return 0;
    }
    public int SalvarSenha(String Senha){
        try{
            FileWriter  arq = new FileWriter("senha.txt",true);
            PrintWriter r   = new PrintWriter(arq);
            r.println(Senha);
            r.close();
            arq.close();
            return 1;
        }catch(IOException e){
            System.exit(0);
        }
        return 0;
    }   
}

package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ra170096
 */
public class BancoDados {

    /**
     * objeto de conexação com o bd
     */
    public Connection conn;
    
    /**
     * objeto de consulta do sql
     */
    public Statement stmt;
    
    /**
     * classe da api 
     */
    private ResultSet res;
    
    /**
     * inicia conexação com o bd
     */
    public void conexao(){
       try
       {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(
               "jdbc:postgresql://localhost:5432/TrabalhoFinal","postgres", "123");
        System.out.println("Conectado ao PostGreSQL.");        
        }catch(Exception e){
            System.out.println("Falha ao tentar a conexÃ£o");
            e.printStackTrace();
        }       
       try{
           stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);      
       }catch(Exception e){
           System.out.println("Falha no Cursor de ExecuÃ§Ã£o");
           e.printStackTrace();
       }
    }
    
    /**
     * 
     * @return obejto de conexão
     */
 public Connection getConnection(){
        return conn;
    }
    /**
     * 
     * @return consulta 
     */
    public Statement getStatement(){
        return stmt;
    }
    /**
     * desconecta do banco de dados
     */
    public void desconecta(){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException erro){
                erro.printStackTrace();
            }
            
        }
    }
}
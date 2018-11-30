package controle;
import modelo.ProfessorM;
import java.sql.ResultSet;

/**
 *
 * @author ra170938
 */
public class ProfessorC {
    BancoDados bd=new BancoDados();    
    ResultSet consulta;

    /**
     * SALVAR PROFESSOR NO BD
     * @param profM 
     */
    public void salvarProfessor(ProfessorM profM){
        try{
            bd.conexao();
            String sql="insert into professor values('"+profM.getCodigo()+"','"+profM.getNome()+"','"+profM.getCoord()+"')";            
            bd.getStatement().execute(sql);
            
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Professor Cadastrado");
            
            bd.desconecta();
        }catch(Exception sqlErro){
            sqlErro.getMessage();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "ERRO");       
        }
    } 
    /**
    * RETORNA BUSCA POR CODIGO CURSO
    * @param codigo
    * @return 
    */
    public ResultSet buscarProfessorPorCodigo(int codigo){
       try{
           bd.conexao();  
           String sql="SELECT nome, turno FROM curso WHERE cod_curso = "+codigo;        
           consulta = bd.getStatement().executeQuery(sql);    
           bd.desconecta();
       }catch(Exception erro){
           erro.getMessage();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
           aviso.showMessageDialog(null, "ERRO");
       }
       return consulta;
    }
    
    /**
     * RETONA ATUALIZAR TABELA CURSO
     * @return 
     */
    public ResultSet atualizaProfessor(){
        try{
            bd.conexao();
            //String sql="UPDATE curso SET ('"+CursoM.+"','"+clienteM.getsNome()+"','"+clienteM.getIdade()+"')";
            //consulta=bd.getStatement().executeQuery(sql);
            bd.desconecta();
        }catch(Exception erro){
            erro.getMessage();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "ERRO");
        }
       return consulta;
    }
}
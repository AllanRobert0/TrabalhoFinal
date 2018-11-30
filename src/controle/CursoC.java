package controle;
import modelo.CursoM;
import java.sql.ResultSet;
/**
 *
 * @author ra170938
 */
public class CursoC {
    BancoDados bd=new BancoDados();
    ResultSet consulta;

    /**
     * SALVAR NO BD
     * @param cd 
     */
    public void salvarCurso(CursoM cd){
        try{
           bd.conexao();
           String sql="insert into curso values('"+cd.getCodigo()+"','"+cd.getNome()+"','"+cd.getTurno()+"')";
           bd.getStatement().execute(sql); 
           javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
           aviso.showMessageDialog(null, "Curso Cadastrada");
           bd.desconecta();
        }catch(Exception erro){
            erro.getMessage();
              javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "ERRO");
        }
    }
    /**
     * RETORNA BUSCA POR CODIGO CURSO
     * @param codigo
     * @return 
     */
    public ResultSet buscarCursoPorCodigo(int codigo){
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
    public ResultSet atualizaCliente(){
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


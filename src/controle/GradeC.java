package controle;
import modelo.GradeM;
import java.sql.ResultSet;
/**
 *
 * @author ra170938
 */
public class GradeC {
    BancoDados bd=new BancoDados();
    ResultSet consulta;
    
    public void salvarGrade(GradeM gm){
        try{
            bd.conexao();
            String sql="insert into grade values('"+gm.getCodigo()+"','"+gm.getAno_inicio()+"','"+gm.getNome_curso()+"','"+gm.getCarga_horaria()+"','"+gm.getNum_semestre()+"','"+gm.getCh_semestre()+"')";            
            bd.getStatement().execute(sql);
            
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Grade  cadastrada");
            
            bd.desconecta();
        }catch(Exception sqlErro){
            sqlErro.getMessage();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "ERRO");       
        }
    } 
    /**
     * RETORNA BUSCA POR CODIGO 
     * @param codigo
     * @return 
     */
    public ResultSet buscarGradePorCodigo(int codigo){
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
     * RETONA ATUALIZAR TABELA 
     * @return 
     */
    public ResultSet atualizaGrade(){
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
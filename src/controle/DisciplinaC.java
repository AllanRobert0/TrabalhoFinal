package controle;
import java.sql.SQLException;
import modelo.DisciplinaM;
import java.sql.ResultSet;
/**
 *
 * @author ra170938
 */
public class DisciplinaC {
    BancoDados bd=new BancoDados();
    ResultSet consulta;
    
    public void salvarDisciplina(DisciplinaM discM){
        try{
            bd.conexao();
            String sql="insert into disciplina values('"+discM.getCodigo()+"','"+discM.getNome()+"','"+discM.getCarga_horaria()+"','"+discM.getSemestre()+"','"+discM.getProfessor()+"')";            
            bd.getStatement().execute(sql);
            
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Disciplina Cadastrado");
            
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
    public ResultSet buscaDisciplinaPorCodigo(int codigo){
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
    public ResultSet atualizaDisciplina(){
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
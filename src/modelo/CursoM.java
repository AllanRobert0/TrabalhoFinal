package modelo;

/**
 *
 * @author ra170938
 */
public class CursoM {
    private int codigo;
    private String nome;
    private String turno;

    /**
     * CONSTRUTOR
     * @param codigo
     * @param nome
     * @param turno 
     */
    public CursoM(int codigo, String nome, String turno) {
        this.codigo = codigo;
        this.nome = nome;
        this.turno = turno;
    }
    
    /**
     * GETTER AND SETTER
     * @return 
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}

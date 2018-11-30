package modelo;

/**
 *
 * @author ra170938
 */
public class DisciplinaM {

    private int codigo;    
    private String nome;
    private int carga_horaria;
    private int semestre;
    private String professor;

    /**
     * CONSTRUTOR
     * @param codigo
     * @param nome
     * @param carga_horaria
     * @param semestre
     * @param professor 
     */
    public DisciplinaM(int codigo, String nome, int carga_horaria, int semestre, String professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.semestre = semestre;
        this.professor = professor;
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

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    
    
}

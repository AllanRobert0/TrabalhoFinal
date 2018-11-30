package modelo;

/**
 *
 * @author ra170938
 */
public class GradeM {
    private int codigo;
    private int ano_inicio;
    private String nome_curso;
    private int carga_horaria;
    private int num_semestre;
    private int ch_semestre;

    public GradeM(int codigo, int ano_inicio, String nome_curso, int carga_horaria, int num_semestre, int ch_semestre) {
        this.codigo = codigo;
        this.ano_inicio = ano_inicio;
        this.nome_curso = nome_curso;
        this.carga_horaria = carga_horaria;
        this.num_semestre = num_semestre;
        this.ch_semestre = ch_semestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno_inicio() {
        return ano_inicio;
    }

    public void setAno_inicio(int ano_inicio) {
        this.ano_inicio = ano_inicio;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public int getNum_semestre() {
        return num_semestre;
    }

    public void setNum_semestre(int num_semestre) {
        this.num_semestre = num_semestre;
    }

    public int getCh_semestre() {
        return ch_semestre;
    }

    public void setCh_semestre(int ch_semestre) {
        this.ch_semestre = ch_semestre;
    }
    
        
}
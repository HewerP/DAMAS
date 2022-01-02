package Model;

public class Materia {
    private int id;
    private String nome;
    private Professor professor;
    private Turma turma;

    public Materia(String nome, Professor professor, Turma turma) {
        this.nome = nome;
        this.professor = professor;
        this.turma = turma;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}

package Model;

public class Notas {
    private int id;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float media;
    private float notaFinal;
    private float mediaFinal;

    private Aluno aluno;
    private Materia materia;

    public Notas(Aluno aluno, Materia materia) {
        this.aluno = aluno;
        this.materia = materia;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }
    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getMedia() {
        return media;
    }
    public void setMedia(float media) {
        this.media = media;
    }

    public float getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public float getMediaFinal() {
        return mediaFinal;
    }
    public void setMediaFinal(float mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Materia getMateria() {
        return materia;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}

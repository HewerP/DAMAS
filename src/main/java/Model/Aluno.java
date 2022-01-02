package Model;

import java.util.Date;

public class Aluno extends Pessoa{
    private Turma turma;

    public Aluno(String cpf, String rg, String nome, Endereco endereco, String telefone, String email, Date nascimento, String genero, String cor, String estadoCivil, Turma turma) {
        super(cpf, rg, nome, endereco, telefone, email, nascimento, genero, cor, estadoCivil);
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}

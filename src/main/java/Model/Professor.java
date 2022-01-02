package Model;

import java.util.Date;

public class Professor extends Pessoa{
    private String carteiraTrabalho;
    private double salario;

    public Professor(String cpf, String rg, String nome, Endereco endereco, String telefone, String email, Date nascimento, String genero, String cor, String estadoCivil, String carteiraTrabalho, double salario) {
        super(cpf, rg, nome, endereco, telefone, email, nascimento, genero, cor, estadoCivil);
        this.carteiraTrabalho = carteiraTrabalho;
        this.salario = salario;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }
    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

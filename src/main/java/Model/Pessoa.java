package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
    private int id;
    private String cpf;
    private String rg;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;
    private Date nascimento;
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String date = simpleDateFormat.format(new Date());
    private String genero;
    private String cor;
    private String estadoCivil;

    public Pessoa(String cpf, String rg, String nome, Endereco endereco, String telefone, String email, Date nascimento, String genero, String cor, String estadoCivil) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
        this.genero = genero;
        this.cor = cor;
        this.estadoCivil = estadoCivil;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}

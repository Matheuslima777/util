
package atvduti;

import java.time.LocalDate;
import java.time.Period;


public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected double salarioBase; 
    protected LocalDate dataNascimento;
    protected LocalDate dataAdmissao;

    public Funcionario(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
    }

    
    public int getIdade(){
    return Period.between(dataAdmissao, LocalDate.now()).getYears();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return  "\n NOME: " + nome +
                "\n CPF: " + cpf +
                "\n RG: " + rg +
                "\n GENERO: " + genero.texto + 
                "\n SALARIO BASE: " + Util.formatarMonetario(salarioBase) + 
                "\n SALARIO FINAL: " + Util.formatarMonetario(getSalarioFinal()) + 
                "\n DATA DE NASCIMENTO: " + Util.formatarData(dataNascimento) + 
                "\n DATA ADMISSAO: " + Util.formatarData(dataAdmissao) ;
    }
    
    
}

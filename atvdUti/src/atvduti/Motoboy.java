
package atvduti;

import java.time.LocalDate;


public class Motoboy extends Funcionario {
   
    private String placaMoto;

    public Motoboy(String placaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaMoto = placaMoto;
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }
    
    
    
}

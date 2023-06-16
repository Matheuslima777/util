
package atvduti;

import java.time.LocalDate;


public class Gerente extends CargoDeConfianca implements Autenticavel {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }

    

 
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getSalarioFinal() {
       return salarioBase + (salarioBase * super.bonificacao.GERENTE.valor);
    }
    
    
    
}


package atvduti;

import java.time.LocalDate;


public class Diretor extends CargoDeConfianca implements Autenticavel {
    
    protected final double PREMIO = 0.1;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }

   

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal() {
       return salarioBase + (salarioBase * PREMIO) + (salarioBase * super.bonificacao.DIRETOR.valor);
    }
    
    
    
}

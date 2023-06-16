
package atvduti;

import java.time.LocalDate;
import java.time.Month;


public class Main {

    public static void main(String[] args) {
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Matheus", "2312421", "12123123", Genero.MASCULINO, 1000, LocalDate.of(2019, Month.MARCH, 4), LocalDate.of(1999, Month.MARCH, 7));
        Gerente gerente = new Gerente(Bonificacao.DIRETOR, "SLA", "2312421", "12123123", Genero.MASCULINO, 1000, LocalDate.of(2018, Month.MARCH, 4), LocalDate.of(1999, Month.MARCH, 7));
        Motoboy ifood = new Motoboy("23h13", "Malhado", "21312312412", "2312341241", Genero.MASCULINO, 1000, LocalDate.of(2001, Month.MARCH, 7), LocalDate.of(2016, Month.MARCH, 9));
        
        if (gerente instanceof Autenticavel){
            System.out.println("Acesso Permitido");
        }else{
            System.out.println("ACESSO negado");
        }
        
        System.out.println(gerente.toString());
        
      
         if (diretor instanceof Autenticavel){
            System.out.println("Acesso Permitido");
        }else{
            System.out.println("ACESSO negado");
        }
         
          System.out.println(gerente.toString());
          
           if (ifood  instanceof Autenticavel){
            System.out.println("Acesso Permitido");
        }else{
            System.out.println("ACESSO negado");
            
            System.out.println(ifood.toString());
        }
    }
    
}

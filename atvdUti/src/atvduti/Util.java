
package atvduti;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Util {
    public static String formatarData(LocalDate  data){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return formatar.format(data);
    }
    
    public static String formatarMonetario(double valor){
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(valor);
    }
    
    public static String permissao(Gerente gerente, Diretor diretor){
    if(gerente instanceof Autenticavel ||  diretor instanceof Autenticavel){
        System.out.println("ACESSO PERMITIDO");
    }else{
        System.out.println("ACESSO NEGADO");
    }
        return null;
     
    }
}

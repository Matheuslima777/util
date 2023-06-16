/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvduti;


public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    protected String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getTexto() {
        return texto;
    }
    
    
}

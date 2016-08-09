/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acodsevec;

/**
 *
 * @author crisd
 */
public class Diagnostico {
    
    private long referencia;
    private String enfermedad;
    private String [] sintomas;
    
    public Diagnostico(long ref, String disease, String [] symptoms){
        this.referencia = ref;
        this.enfermedad = disease;
        this.sintomas = symptoms;
    }

    public long getReferencia() {
        return referencia;
    }

    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }
    
    public void imprimirSintomas(){
        for(String s : this.sintomas){
            System.out.print(s + ". ");
        }
    }
}

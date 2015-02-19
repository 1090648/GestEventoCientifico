/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author iazevedo
 */
public class Topico  implements Serializable {
    
    private String m_strDescricao;
    
    private String m_strCodigoACM;

   
    public void setDescricao(String strDescricao) {
        this.m_strDescricao = strDescricao;
    }



    public void setCodigoACM(String codigoACM) {
        this.m_strCodigoACM = codigoACM;
    }
    
    public boolean valida()
    {
        return true;
    }
        @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Topico) {
                Topico aux = (Topico) obj;
                 return this.m_strCodigoACM.equals(aux.m_strCodigoACM);
            } else {
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.m_strCodigoACM);
        return hash;
    }
    @Override
    public String toString()
    {
        return "\nCodigo: " + this.m_strCodigoACM +"\nDescrição: " + this.m_strDescricao;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */

public class Autor implements Serializable {
    /**
     * Variavel Utilizador
     */
    private Utilizador m_Utilizador;
    /**
     * Variavel Nome
     */
    private String m_strNome;
    /**
     * Variavel Afiliação
     */
    private String m_strAfiliacao;
    /**
     * Variavel Email
     */
    private String m_strEMail;
    
    /**
     * atribuicao null a m_utilizador
     */
    public Autor()
    {
        this.m_Utilizador = null;
    }
    /**
     * 
     * @param strNome 
     */
    public void setNome(String strNome)
    {
        this.m_strNome = strNome;
    }
    /**
     * 
     * @param strAfiliacao 
     */
    public void setAfiliacao(String strAfiliacao)
    {
        this.m_strAfiliacao = strAfiliacao;
    }
    /**
     * Atribuicao de m_strEmail 
     * @param strEMail 
     */
    public void setEMail(String strEMail)
    {
        this.m_strEMail = strEMail;
    }
    /**
     * atribuicao de m_Utilizador
     * @param utilizador 
     */
    
    public void setUtilizador(Utilizador utilizador)
    {
        this.m_Utilizador = utilizador;
    }
    /**
     * Metodo Validar 
     * @return 
     */
    public boolean valida()
    {
        return true;
    } 
    /**
     * Autores Correspondentes nao pode ser null
     * @return 
     */

    boolean podeSerCorrespondente() 
    {
        return (m_Utilizador != null);
    }
    /**
     * 
     * @return m_strNome, m_strAfiliacao, m_strEMAil
     */
    @Override
    public String toString()
    {
        return this.m_strNome + " - " + this.m_strAfiliacao +  " - " + this.m_strEMail; 
    }
    
    /**
     * Vai realizar a comepracao do Email do Autor
     * @param obj
     * @return 
     * 
     * Um Autor é identificado pelo seu endereço de e-mail que deve ser único no artigo, 
     * mas não tem que corresponder a um Utilizador.
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        else
            if(obj instanceof Autor) {
                Autor aux = (Autor) obj;
                return this.m_strEMail.equals(aux.m_strEMail);
            } else
                return false;
    }
/**
 * Metodo que vai atribuir o has code a um Objecto.
 * Vai mapear a memoria do endereço para um valor Integer.
 * @return 
 */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.m_Utilizador != null ? this.m_Utilizador.hashCode() : 0);
        hash = 41 * hash + (this.m_strEMail != null ? this.m_strEMail.hashCode() : 0);
        return hash;
    }
}

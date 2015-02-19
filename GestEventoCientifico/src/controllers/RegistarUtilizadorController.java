package controllers;

import model.Empresa;
import model.Utilizador;
import registos.RegistoUtilizadores;


/**
 *
 * @author Nuno Silva
 */

public class RegistarUtilizadorController
{
    private Utilizador m_utilizador;
    private RegistoUtilizadores ru;

    public RegistarUtilizadorController(Empresa empresa)
    {
        ru=empresa.getRegistoU();
        m_utilizador = ru.novoUtilizador();
    }

    public void novoUtilizador()
    {
        m_utilizador = ru.novoUtilizador();
    }

    public Utilizador setDados(String strUsername, String strPassword, String strNome, String strEmail)
    {
        m_utilizador.setUsername(strUsername);
        m_utilizador.setPassword(strPassword);
        m_utilizador.setNome(strNome);
        m_utilizador.setEmail(strEmail);
        
       return m_utilizador;
    }

    public Utilizador getM_utilizador() {
        return m_utilizador;
    }

    public void setM_utilizador(Utilizador m_utilizador) {
        this.m_utilizador = m_utilizador;
    }

    public RegistoUtilizadores getRu() {
        return ru;
    }

    public void setRu(RegistoUtilizadores ru) {
        this.ru = ru;
    }
    
}


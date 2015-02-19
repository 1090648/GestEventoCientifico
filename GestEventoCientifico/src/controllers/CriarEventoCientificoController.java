package controllers;

import model.Empresa;
import model.Evento;
import model.Utilizador;
import registos.RegistoEventos;
import registos.RegistoUtilizadores;

/**
 *
 * @author Nuno Silva
 */

public class CriarEventoCientificoController
{
    private RegistoEventos re;
    private RegistoUtilizadores ru;
    private Evento m_evento;

    public CriarEventoCientificoController(Empresa empresa)
    {

        this.re=empresa.getRegistoE();
        this.ru=empresa.getRegistoU();
        m_evento = re.novoEvento();
        
    }

    public void novoEvento()
    {
        m_evento = re.novoEvento();
    }

    public Evento getM_evento() {
        return m_evento;
    }

    public void setM_evento(Evento m_evento) {
        this.m_evento = m_evento;
    }

    public String getEventoString()
    {
        return m_evento.toString();
    }

    public void setTitulo(String strTitulo)
    {
        m_evento.setTitulo(strTitulo);
    }
    
    public void setDescricao(String strDescricao)
    {
        m_evento.setDescricao(strDescricao);
    }

    public void setLocal(String strLocal)
    {
        m_evento.setLocal(strLocal);
    }
    
    public void setDataInicio(String strDataInicio)
    {
        m_evento.setDataInicio(strDataInicio);
    }

    public void setDataFim(String strDataFim)
    {
        m_evento.setDataFim(strDataFim);
    }

    public RegistoEventos getRe() {
        return re;
    }

    public void setRe(RegistoEventos re) {
        this.re = re;
    }

    public RegistoUtilizadores getRu() {
        return ru;
    }

    public void setRu(RegistoUtilizadores ru) {
        this.ru = ru;
    }
    
    // adicionado na iteração 2
    public void setDataLimiteSubmissão(String strDataLimiteSubmissão)
    {
        m_evento.setDataLimiteSubmissão(strDataLimiteSubmissão);
    }

    public void addOrganizador(String strId, Utilizador u)
    {
         m_evento.addOrganizador( strId, u );
    }
    
    public boolean registaEvento()
    {
        return re.registaEvento(m_evento);
    }

    public void setEventoRegistado() {
        this.m_evento.getEstadoEvento().setRegistado();
    }
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import model.Empresa;
import model.Evento;
import model.Topico;
import java.util.List;

/**
 *
 * @author iazevedo
 */

public class CriarTopicoEventoController {
    
    private Empresa m_empresa;
    private Evento m_evento;
    

    public CriarTopicoEventoController(Empresa empresa) 
    {
        m_empresa = empresa;
    }
    
    public List<Evento> getEventosOrganizador(String strId)
    {
        return m_empresa.getEventosOrganizador(strId);
    }
    
   public void setEvento(Evento e)
   {
        m_evento = e;
   }
   public Topico addTopico(String strCodigo, String strDescricao)
   {
       Topico t = m_evento.novoTopico();
       
       t.setCodigoACM(strCodigo);
       t.setDescricao(strDescricao);
       
       
       if ( m_evento.validaTopico(t))
           return t;
       else
           return null;
   }
   
   public boolean registaTopico(Topico t)
   {
       return m_evento.addTopico(t);
   }
    
}


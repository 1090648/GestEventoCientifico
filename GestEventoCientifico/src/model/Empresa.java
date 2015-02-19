package model;


import java.io.Serializable;
import java.util.*;
import registos.RegistoEventos;
import registos.RegistoUtilizadores;

/**
 *
 * @author Nuno Silva
 */

public class Empresa implements Serializable {
    private RegistoUtilizadores registoU;
    private RegistoEventos registoE;

    public Empresa() {
        this.registoU = new RegistoUtilizadores(this);
        this.registoE = new RegistoEventos(this);
    }



    public Utilizador novoUtilizador()
    {
        return registoU.novoUtilizador();
    }
    
    public boolean registaUtilizador(Utilizador u)
    {
        if( u.valida() && validaUtilizador(u) )
            return addUtilizador(u);
        else
            return false;
    }
    
    // alterada na iteração 2
    private boolean validaUtilizador(Utilizador u)
    {
        for(Utilizador uExistente : registoU.getM_listaUtilizadores())
        {
            if( uExistente.mesmoQueUtilizador(u) )
                return false;
        }  
        return true;
    }
    
    public Evento novoEvento()
    {
        return new Evento();
    }

    public boolean registaEvento(Evento e)
    {
        if(validaEvento(e) )
            return addEvento(e);
        else
            return false;
    }
    
    private boolean validaEvento(Evento e)
    {
        return true;
    }

    public Utilizador getUtilizador(String strId)
    {
        for(Utilizador u:this.registoU.getM_listaUtilizadores())
        {
            String s1 = u.getUsername();
            if(s1.equalsIgnoreCase(strId))
                return u;
        }  
        return null;
    }
    
    public Utilizador getUtilizadorEmail(String strEmail)
    {
        for(Utilizador u:this.registoU.getM_listaUtilizadores())
        {
            String s1 = u.getEmail();
            if(s1.equalsIgnoreCase(strEmail))
                return u;
        }
    
        return null;
    }
    
    private boolean addUtilizador(Utilizador u)
    {
        return registoU.getM_listaUtilizadores().add(u);
    }

    private boolean addEvento(Evento e)
    {
        return this.registoE.registaEvento(e);
    }
    
    public List<Evento> getEventosOrganizador(String strId)
    {
        List<Evento> leOrganizador = new ArrayList<Evento>();

        Utilizador u = getUtilizador(strId);
        
        if(u != null )
        {
            for( Iterator<Evento> it = this.registoE.getM_listaEventos().listIterator(); it.hasNext(); )
            {
                Evento e = it.next();
                List<Organizador> lOrg = e.getListaOrganizadores();
             
                boolean bRet = false;
                for(Organizador org:lOrg)
                {
                    if (org.getUtilizador().equals(u))
                    {
                        bRet = true;
                        break;
                    }
                }
                if( bRet )
                    leOrganizador.add(e);
            }
        }
        return leOrganizador;
    }
    
    public List<Evento> getListaEventosPodeSubmeter()
    {
        List<Evento> le = new ArrayList<Evento>();
        
        for(Evento e:this.registoE.getM_listaEventos())
        {
            if (e.aceitaSubmissoes())
            {
                le.add(e);
            }
        }
        
        return le;
    }

    public RegistoUtilizadores getRegistoU() {
        return registoU;
    }

    public void setRegistoU(RegistoUtilizadores registoU) {
        this.registoU = registoU;
    }

    public RegistoEventos getRegistoE() {
        return registoE;
    }

    public void setRegistoE(RegistoEventos registoE) {
        this.registoE = registoE;
    }



}
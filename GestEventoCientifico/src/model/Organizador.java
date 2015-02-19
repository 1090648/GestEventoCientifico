package model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Nuno Silva
 */

public class Organizador implements Serializable {
    private final String m_strNome;
    private Utilizador m_utilizador;

    public Organizador(String strId, Utilizador u )
    {
        m_strNome = u.getNome();
        this.setUtilizador(u);
    }

    private void setUtilizador(Utilizador u)
    {
        m_utilizador = u;
    }
    
    public boolean valida()
    {
        return true;
    }
    
    public String getNome()
    {
        return m_strNome;
    }
    
    public Utilizador getUtilizador()
    {
        return m_utilizador;
    }

    @Override
    public String toString()
    {
        return m_utilizador.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Organizador) {
            Organizador aux = (Organizador) obj;
            return this.m_utilizador.equals(aux.m_utilizador);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.m_strNome);
        hash = 71 * hash + Objects.hashCode(this.m_utilizador);
        return hash;
    }
    
    
}

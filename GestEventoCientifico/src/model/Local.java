/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Nuno Silva
 */

public class Local  implements Serializable {
    private String m_strLocal;

    public Local()
    {
    }
    
    public void setLocal(String strLocal)
    {
        m_strLocal = strLocal;
    }

    @Override
    public String toString()
    {
        return m_strLocal;
    }
}

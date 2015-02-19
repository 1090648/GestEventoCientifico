/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registos;

import java.io.Serializable;
import java.util.ArrayList;
import model.Utilizador;
import java.util.List;
import model.Empresa;

/**
 *
 * @author RXFB73
 */
public class RegistoUtilizadores  implements Serializable {

    private final List<Utilizador> m_listaUtilizadores;

    public RegistoUtilizadores(Empresa empresa) {
        this.m_listaUtilizadores = new ArrayList<>();
    }

    public Utilizador novoUtilizador() {
        return new Utilizador();
    }

    public boolean addUtilizador(Utilizador u) {
        return m_listaUtilizadores.add(u);
    }

    public boolean registaUtilizador(Utilizador u) {
        if (validaUtilizador(u)) {
            return addUtilizador(u);
        } else {
            return false;
        }
    }

    public boolean validaUtilizador(Utilizador u) {
        for (Utilizador uExistente : m_listaUtilizadores) {
            if (uExistente.mesmoQueUtilizador(u)) {
                return false;
            }
        }
        return true;
    }

    public List<Utilizador> getM_listaUtilizadores() {
        return m_listaUtilizadores;
    }

    public Utilizador getUtilizador(String strId) {
        for (Utilizador s : getM_listaUtilizadores()) {
            if (s.getUsername().equals(strId)) {
                return s;
            }
        }
        return null;
    }

    public Utilizador getUtilizadorByEmail(String strEmail) {
        for (Utilizador u : getM_listaUtilizadores()) {
            String s1 = u.getEmail();
            if (u.getEmail().equalsIgnoreCase(strEmail)) {
                return u;
            }
        }

        return null;
    }

}

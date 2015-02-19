/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosStates;

import model.Evento;

/**
 *
 * @author Lopes
 */
public class EventoTopicoCriadoState implements EventoState {

    private Evento e;

    public boolean setCriado() {
        return false;
    }

    public boolean setRegistado() {
        return false;
    }

    public boolean setTopicosCriados() {
        return true;
    }

    public boolean setNotificado() {
        return false;
    }

    public boolean setCameraReady() {
        return false;
    }

    public boolean valida() {
        return false;
    }

    public boolean setCPCriado() {
        if (valida()) {
            e.setState(new EventoTopicoCriadoState());
            return true;
        } else {
            return false;
        }

    }
}

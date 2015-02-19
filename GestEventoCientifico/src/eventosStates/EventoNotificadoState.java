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
public class EventoNotificadoState implements EventoState {

    private Evento e;

    public boolean setCriado() {
        return false;
    }

    public boolean setRegistado() {
        return false;
    }

    public boolean setTopicosCriados() {
        return false;
    }

    public boolean setNotificado() {
        return true;
    }

    public boolean setCameraReady() {
        if (valida()) {
            e.setState(new EventoCameraReadyState());
            return true;
        } else {
            return false;
        }
    }

    public boolean valida() {
        return true;
    }

    public boolean setCPCriado() {
        return false;
    }
}

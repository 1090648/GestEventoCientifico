/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosStates;

import java.io.Serializable;
import model.Evento;

/**
 *
 * @author Lopes
 */
public class EventoCriadoState implements EventoState, Serializable {

    private Evento e;

    public EventoCriadoState(Evento e) {
        this.e = e;
    }

    public boolean valida() {
        for(int i = 0; i<e.getDadosIntroduzidosAquandoCriacao().length;i++){
            if(e.getDadosIntroduzidosAquandoCriacao()[i]==null)
                return false;
        }
        return true;
    }

    public boolean setCriado() {
        return true;
    }

    public boolean setRegistado() {
        if (valida()) {
            e.setState(new EventoRegistadoState());
            return true;
        } else {
            return false;
        }
    }

    public boolean setTopicosCriados() {
        return false;
    }

    public boolean setNotificado() {
        return false;
    }

    public boolean setCameraReady() {
        return false;
    }

    public boolean setCPCriado() {
        return false;
    }

}

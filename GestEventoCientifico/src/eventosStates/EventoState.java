/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosStates;

/**
 *
 * @author Lopes
 */
public interface EventoState {

    public boolean setCriado();

    public boolean setCPCriado();

    public boolean setRegistado();

    public boolean setTopicosCriados();

    public boolean setNotificado();

    public boolean setCameraReady();

    public boolean valida();
}

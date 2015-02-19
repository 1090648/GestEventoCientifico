/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package submissoesState;

/**
 *
 * @author RXFB73
 */
public interface SubmissaoState {
    /**
     * Validar o estado.
     * @return 
     */
    public boolean valida();
    public boolean setCriada();
    public boolean setArtigoParaRevisaoSubmetido();
    public boolean setDistribuida();
    public boolean setRevista();
    public boolean setRegeitada();
    public boolean setAceite();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registos;

import java.io.Serializable;
import model.Artigo;
import model.Empresa;
import model.Evento;
import model.Organizador;
import model.Revisor;
import model.Utilizador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegistoEventos  implements Serializable {

    /**
     * Lista de eventos
     */
    private List<Evento> m_listaEventos;
    /**
     * Empresa associada
     */
    private Empresa m_empresa;

    /**
     * Criar uma instancia de Evento.
     *
     * @return Evento instanciado.
     */
    public RegistoEventos(Empresa empresa) {
        m_empresa=empresa;
        this.m_listaEventos = new ArrayList();
    }
    
    public Evento novoEvento() {
        return new Evento();
    }

    /**
     * Registar o evento na lista de eventos.
     *
     * @param e Evento a registar.
     * @return Adiciona o evento caso passe as validações.
     */
    public boolean registaEvento(Evento e) {
        if (validaEvento(e)) {
            return addEvento(e);
        } else {
            return false;
        }
    }

    /**
     * Verificar se o evento a registar já existe na lista de eventos da
     * empresa.
     *
     * @param e Evento a verificar.
     * @return Verdadeiro se a validação for bem sucedida.
     */
    public boolean validaEvento(Evento e) {
        if (this.m_listaEventos.contains(e)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Adicionar um ovento à lista de eventos da empresa.
     *
     * @param e Evento a adicionar.
     * @return Verdadeiro se o adicionamento for bem sucedido.
     */
    public boolean addEvento(Evento e) {
        return m_listaEventos.add(e);
    }

    /**
     * Obter eventos de um organizador. Percorre a lista de eventos verificando
     * para cada um se contem o organizador que é recebido por parametro. Se
     * contiver, adiciona-o a uma lista temporaria que será retornada.
     *
     * @param strId Id do organizador.
     * @return Lista de eventos do organizador.
     */
    public List<Evento> getEventosOrganizador(String strId) {
        List<Evento> leOrganizador = new ArrayList();

        RegistoUtilizadores ru = m_empresa.getRegistoU();
        Utilizador u = ru.getUtilizador(strId);

        if (u != null) {
            for (Iterator<Evento> it = m_listaEventos.listIterator(); it.hasNext();) {
                Evento e = it.next();
                List<Organizador> lOrg = e.getListaOrganizadores();

                boolean bRet = false;
                for (Organizador org : lOrg) {
                    if (org.getUtilizador().equals(u)) {
                        bRet = true;
                        break;
                    }
                }
                if (bRet) {
                    leOrganizador.add(e);
                }
            }
        }
        return leOrganizador;
    }

    /**
     * Obter eventos que aceitem submissões. Percorre a lista de eventos e
     * adiciona a uma lista temporária os eventos cujo o método aceitaSubissões
     * retorne true.
     *
     * @return Lista de eventos que aceitem submissões.
     */
    public List<Evento> getListaEventosPodeSubmeter() {
        List<Evento> le = new ArrayList<Evento>();

        for (Evento e : m_listaEventos) {
            if (e.aceitaSubmissoes()) {
                le.add(e);
            }
        }

        return le;
    }

    /**
     * Obter eventos associados a um revisor. Percorre a lista de eventos e se o
     * revisor recebido por parâmetro estiver na lista revisores desse evento, é
     * adicionado a uma lista temporária que será retornada.
     *
     * @param strId Id do revisor.
     * @return Lista de eventos associados a um revisor.
     */
    public List<Evento> getEventosRevisor(String strId) {
        List<Evento> leRevisor = new ArrayList<Evento>();

        RegistoUtilizadores ru = m_empresa.getRegistoU();
        Utilizador u = ru.getUtilizador(strId);

        if (u != null) {
            for (Iterator<Evento> it = m_listaEventos.listIterator(); it.hasNext();) {
                Evento e = it.next();
                List<Revisor> lrev = e.getListaRevisores();

                boolean bRet = false;
                for (Revisor rev : lrev) {
                    if (rev.getUtilizador().equals(u)) {
                        bRet = true;
                        break;
                    }
                }
                if (bRet) {
                    leRevisor.add(e);
                }
            }
        }
        return leRevisor;
    }

//    public List<Evento> getListaEventosArtigosAceites() {
//        List<Evento> le = new ArrayList<Evento>();
//        //adicionar eventos com artigos aceites
//        return le;
//    }
//
//    public List<Artigo> getArtigosAceites() {
//        List<Artigo> la = new ArrayList<Artigo>();
//
//        //lista de artigos aceites
//        return la;
//    }


    public ArrayList<Evento> getM_listaEventos() {
        
        return (ArrayList)RegistoEventos.this.m_listaEventos;
    }
}

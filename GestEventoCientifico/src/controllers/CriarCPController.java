package controllers;

import java.util.ArrayList;
import model.CP;
import model.Empresa;
import model.Evento;
import model.Revisor;
import model.Topico;
import model.Utilizador;
import java.util.List;
import model.Organizador;
import registos.RegistoEventos;
import registos.RegistoUtilizadores;

/**
 *
 * @author 1090698
 */
public class CriarCPController {

    private Evento m_evento;
    private CP m_cp;
    private RegistoEventos re;
    private RegistoUtilizadores ru;

    /**
     *
     * @param empresa
     */
    public CriarCPController(Empresa empresa) {
        m_cp = new CP();
        re = empresa.getRegistoE();
        ru = empresa.getRegistoU();
    }

    /**
     *
     * @param strId
     * @return
     */
    public List<Evento> getEventosOrganizador(String strId) {
        return re.getEventosOrganizador(strId);
    }

    /**
     * retorna lista de organizadores de um Evento
     *
     * @return m_evento.getListaOrganizadores()
     */
    public List<Organizador> getOrganizadoresEvento() {
        return m_evento.getListaOrganizadores();
    }

    /**
     * retorna a lista de organizadores de toda a empresa
     *
     * @return lista_organizadores
     */
    public List<Organizador> obterOrganizadoresEmpresa() {
        List<Organizador> lista_organizadores = new ArrayList();
        for (int i = 0; i < ru.getM_listaUtilizadores().size(); i++) {
            if (this.getEventosOrganizador(ru.getM_listaUtilizadores().get(i).getUsername()).size() > 0) {
                Organizador org = new Organizador(ru.getM_listaUtilizadores().get(i).getUsername(), ru.getM_listaUtilizadores().get(i));
                lista_organizadores.add(org);
            }
        }
        return lista_organizadores;
    }

    /**
     * retorna a lista de utilizadores não organizadores de um evento
     *
     * @return lista_nao_org_evento
     */
    public List<Utilizador> getLista_Utiliz_Nao_OrganizadoresEvento() {
        List<Utilizador> lista_nao_org_evento = new ArrayList();
        for (int i = 0; i < ru.getM_listaUtilizadores().size(); i++) {
            boolean existe = false;
            for (int j = 0; j < m_evento.getListaOrganizadores().size(); j++) {
                if ((ru.getM_listaUtilizadores().get(i).getUsername()).equals(m_evento.getListaOrganizadores().get(j).getUtilizador().getUsername())) {
                    existe = true;
                    break;
                }
            }
            if (existe == false) {
                lista_nao_org_evento.add(ru.getM_listaUtilizadores().get(i));
            }
        }
        return lista_nao_org_evento;
    }

    /**
     *
     * @return list topicos
     */
    public List<Topico> getTopicosEvento() {
        if (m_evento != null) {
            return m_evento.getTopicos();
        } else {
            return null;
        }
    }

    /**
     *
     * @param e
     */
    public void selectEvento(Evento e) {
        m_evento = e;

        m_cp = m_evento.novaCP();
    }

    /**
     *
     * @param strId
     * @return
     */
    public Revisor addMembroCP(String strId) {
        Utilizador u = ru.getUtilizador(strId);

        if (u != null) {
            return m_cp.addMembroCP(strId, u);
        } else {
            return null;
        }
    }

    /**
     *
     * @param r
     * @return
     */
    public boolean registaMembroCP(Revisor r) {
        return m_cp.registaMembroCP(r);
    }

    /**
     *
     */
    public void setCP() {
        m_evento.setCP(m_cp);
    }

    /**
     *
     * @param r
     * @param listaTopicosRevisor
     */
    public void setListaTopicosRevisor(Revisor r, List<Topico> listaTopicosRevisor) {
        if (m_cp.getListaRevisores().contains(r)) {
            r.setListaTopicos(listaTopicosRevisor);
        }
    }

    /**
     *
     * @param revisor
     * @param topico
     */
    public void addTopicoRevisor(Revisor revisor, Topico topico) {
        revisor.addTopico(topico);
    }

    /**
     *
     * @return
     */
    public List<Utilizador> obterUtilizadoresEmpresa() {
        return ru.getM_listaUtilizadores();
    }

    /**
     *
     * @return
     */
    public Evento getM_evento() {
        return m_evento;
    }

    /**
     *
     * @return
     */
    public CP getM_cp() {
        return m_cp;
    }

    /**
     *
     * @return
     */
    public RegistoEventos getRe() {
        return re;
    }

    /**
     *
     * @return
     */
    public RegistoUtilizadores getRu() {
        return ru;
    }

}

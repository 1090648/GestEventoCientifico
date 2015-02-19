/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import eventosStates.EventoState;
import eventosStates.EventoTopicoCriadoState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Nuno Silva / Manuel Vieira
 */
public class Evento implements Serializable {

    /**
     * Variavel Titulo do evento.
     */
    private String m_strTitulo;
    /**
     * Variavel a Descrição
     */
    private String m_strDescricao;
    /**
     * Variavel a local
     */
    private Local m_local;
    /**
     * Variavel de Inicio
     */
    private String m_strDataLimiteinicioEvento;
    /**
     * Variavel de Fim
     */
    private String m_strDataFim;
    /**
     * Variavel Data Limite de submissao
     */
    private String m_strDataLimiteSubmissão;
    /**
     * Variavel Lista de Organizadores
     */
    private List<Organizador> m_listaOrganizadores;
    /**
     * Variavel Data limite de revisao
     */
    private String m_strDataLimiteRevisao;
    /**
     * Variavel Data limite de submissao Final
     */
    private String m_strDataLimiteSubmissaoFinal;
    /**
     * Variavel Data limite de registo
     */
    private String m_strDataLimiteRegisto;
    /**
     * Data limite d fim do Evento
     */
    private String m_strDataLimiteTerminoEvento;
    /**
     * Variavel lista de submissao
     */
    private List<Submissao> m_listaSubmissoes;
    /**
     * Variavel comissao de programa
     */
    private CP m_cp;
    /**
     * Variavel lista de topicos
     */
    private List<Topico> m_listaTopicos;
    /**
     * Variavel Estado do evento.
     */
    private EventoState estadoEvento;

    public Evento() {

        m_local = new Local();
        m_listaOrganizadores = new ArrayList<Organizador>();
        m_listaSubmissoes = new ArrayList();
        m_listaTopicos = new ArrayList();
        estadoEvento = new eventosStates.EventoCriadoState(this);
    }

    public Evento(String titulo, String descricao) {
        m_local = new Local();
        m_listaOrganizadores = new ArrayList<Organizador>();
        m_listaSubmissoes = new ArrayList<Submissao>();
        m_listaTopicos = new ArrayList<Topico>();
        this.setTitulo(titulo);
        this.setDescricao(descricao);
    }

    public EventoState getEstadoEvento() {
        return estadoEvento;
    }

    /**
     * Criar uma nova CP. Chama o construtor vazio da classe CP.
     *
     * @return CP instanciada
     */
    public CP novaCP() {
        m_cp = new CP();

        return m_cp;
    }

    /**
     * Cria o Titulo Pedido para dar um Titulo ao Evento.
     *
     * @param strTitulo
     */
    public final void setTitulo(String strTitulo) {
        this.m_strTitulo = strTitulo;
    }

    /**
     * Criar a Descricao Pedido para dar um Descricao do Evento
     *
     * @param strDescricao
     */
    public final void setDescricao(String strDescricao) {
        this.m_strDescricao = strDescricao;
    }

    /**
     * colocar a Data de inicio Indicar uma Data de Inicio do Evento
     *
     * @param strDataInicio
     */
    public void setDataInicio(String strDataInicio) {
        this.setM_strDataLimiteinicioEvento(strDataInicio);
    }

    /**
     * Colocar a Data do fim Indicar a Data de Fim para o Evento
     *
     * @param strDataFim
     */
    public void setDataFim(String strDataFim) {
        this.setM_strDataFim(strDataFim);
    }

    /**
     * Colocar a data limite de submissao Indicar uma data limite de submissao
     * para o Evento
     *
     * @param strDataLimiteSubmissão
     */
    // adicionada na iteração 2
    public void setDataLimiteSubmissão(String strDataLimiteSubmissão) {
        this.setM_strDataLimiteSubmissão(strDataLimiteSubmissão);
    }

    /**
     * colocar o local Vai indicar o local de realizacao do eveto
     *
     * @param strLocal
     */
    public void setLocal(String strLocal) {
        this.getM_local().setLocal(strLocal);
    }

    /**
     * Criar uma Lista de Orgenizadores
     *
     * @return lOrg
     */
    public List<Organizador> getListaOrganizadores() {
        List<Organizador> lOrg = new ArrayList<Organizador>();

        for (ListIterator<Organizador> it = getM_listaOrganizadores().listIterator(); it.hasNext();) {
            lOrg.add(it.next());
        }

        return lOrg;
    }

    /**
     * Vai dar um ID identificando o utilizador
     *
     * @param strId
     * @param u
     * @return add Organizador
     */
    public boolean addOrganizador(String strId, Utilizador u) {
        Organizador o = new Organizador(strId, u);

        if (o.valida() && !existeOrganizador(o)) {
            this.addOrganizador(o);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adicionar um Organizador a Lista
     *
     * @param o
     * @return getM_listaOrganizadores().add(o)
     */
    private boolean addOrganizador(Organizador o) {
        return this.m_listaOrganizadores.add(o);
    }

    private boolean existeOrganizador(Organizador o) {
        return this.m_listaOrganizadores.contains(o);
    }

    /**
     *
     * @param cp
     */
    public void setCP(CP cp) {
        m_cp = cp;
    }

    /**
     * Devolve o Titulo
     *
     * @return
     */
    @Override
    public String toString() {
        return this.m_strTitulo + "+ ...";
    }

    /**
     * confirma que aceitou a submissao
     *
     * @return
     */
    public boolean aceitaSubmissoes() {
        return true;
    }

    /**
     * Fazer uma nova Submissao
     *
     * @return
     */
    public Submissao novaSubmissao() {
        return new Submissao();
    }

    /**
     * vai validar a submissao se for aceite adiciona a Lista Se nao for aceite
     *
     * @param submissao
     * @return this.m_listaSubmissoes.add(submissao)
     */
    public boolean addSubmissao(Submissao submissao) {
        if (validaSubmissao(submissao)) {
            return this.m_listaSubmissoes.add(submissao);
        } else {
            return false;
        }
    }

    /**
     * Confirmação da Validaçao de submissao
     *
     * @param submissao
     * @return
     */
    private boolean validaSubmissao(Submissao submissao) {
        return submissao.valida();
    }

    /**
     * Vai buscar a Lista de submissao
     *
     * @return this.m_listaSubmissoes
     */
    public List<Submissao> getListaSubmissoes() {
        return this.m_listaSubmissoes;
    }

    /**
     * Vai buscar a CP
     *
     * @return
     */
    public CP getCP() {
        return this.m_cp;
    }

    /**
     * Vai buscar o Topicos
     *
     * @return
     */
    public List<Topico> getTopicos() {
        return m_listaTopicos;
    }

    /**
     * Pedir um Novo Topico
     *
     * @return
     */
    // adicionada na iteração 2
    public Topico novoTopico() {
        return new Topico();
    }

    /**
     * Adicionar o Topico a Lista de Topico
     *
     * @param t
     * @return
     */
    // adicionada na iteração 2
    public boolean addTopico(Topico t) {
        return this.m_listaTopicos.add(t);
    }
///**
// * Vai validar o Topico 
// * @param t
// * @return 
// */
//    // adicionada na iteração 2
//    public boolean validaTopico(Topico t) {
//        if (t.valida() && validaGlobalTopico(t)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
///**
// * Acite a validacao vai devolver o topico 
// * @param t
// * @return 
// */
//    // adicionada na iteração 2
//    private boolean validaGlobalTopico(Topico t) {
//        return true;
//    }

    /**
     *
     * @return
     */
    public List<Revisor> getListaRevisores() {
        return this.m_cp.getListaRevisores();
    }

    /**
     *
     * @param eventoState
     */
    public void setState(EventoState eventoState) {
        this.estadoEvento = eventoState;
    }

    /**
     * @return the m_local
     */
    public Local getM_local() {
        return m_local;
    }

    /**
     * @param m_local the m_local to set
     */
    public void setM_local(Local m_local) {
        this.m_local = m_local;
    }

    /**
     * @return the m_strDataLimiteinicioEvento
     */
    public String getM_strDataLimiteinicioEvento() {
        return m_strDataLimiteinicioEvento;
    }

    /**
     * @param m_strDataLimiteinicioEvento the m_strDataLimiteinicioEvento to set
     */
    public void setM_strDataLimiteinicioEvento(String m_strDataLimiteinicioEvento) {
        this.m_strDataLimiteinicioEvento = m_strDataLimiteinicioEvento;
    }

    /**
     * @return the m_strDataFim
     */
    public String getM_strDataFim() {
        return m_strDataFim;
    }

    /**
     * @param m_strDataFim the m_strDataFim to set
     */
    public void setM_strDataFim(String m_strDataFim) {
        this.m_strDataFim = m_strDataFim;
    }

    /**
     * @return the m_strDataLimiteSubmissão
     */
    public String getM_strDataLimiteSubmissão() {
        return m_strDataLimiteSubmissão;
    }

    /**
     * @param m_strDataLimiteSubmissão the m_strDataLimiteSubmissão to set
     */
    public void setM_strDataLimiteSubmissão(String m_strDataLimiteSubmissão) {
        this.m_strDataLimiteSubmissão = m_strDataLimiteSubmissão;
    }

    /**
     * @return the m_listaOrganizadores
     */
    public List<Organizador> getM_listaOrganizadores() {
        return m_listaOrganizadores;
    }

    /**
     * @param m_listaOrganizadores the m_listaOrganizadores to set
     */
    public void setM_listaOrganizadores(List<Organizador> m_listaOrganizadores) {
        this.m_listaOrganizadores = m_listaOrganizadores;
    }

    /**
     * @return the m_strDataLimiteRevisao
     */
    public String getM_strDataLimiteRevisao() {
        return m_strDataLimiteRevisao;
    }

    /**
     * @param m_strDataLimiteRevisao the m_strDataLimiteRevisao to set
     */
    public void setM_strDataLimiteRevisao(String m_strDataLimiteRevisao) {
        this.m_strDataLimiteRevisao = m_strDataLimiteRevisao;
    }

    /**
     * @return the m_strDataLimiteSubmissaoFinal
     */
    public String getM_strDataLimiteSubmissaoFinal() {
        return m_strDataLimiteSubmissaoFinal;
    }

    /**
     *
     * @param m_strDataLimiteSubmissaoFinal the m_strDataLimiteSubmissaoFinal to
     * set
     */
    public void setM_strDataLimiteSubmissaoFinal(String m_strDataLimiteSubmissaoFinal) {
        this.m_strDataLimiteSubmissaoFinal = m_strDataLimiteSubmissaoFinal;
    }

    /**
     *
     * @return the m_strDataLimiteRegisto
     */
    public String getM_strDataLimiteRegisto() {
        return m_strDataLimiteRegisto;
    }

    /**
     *
     * @param m_strDataLimiteRegisto the m_strDataLimiteRegisto to set
     */
    public void setM_strDataLimiteRegisto(String m_strDataLimiteRegisto) {
        this.m_strDataLimiteRegisto = m_strDataLimiteRegisto;
    }

    /**
     *
     * @return the m_strDataLimiteTerminoEvento
     */
    public String getM_strDataLimiteTerminoEvento() {
        return m_strDataLimiteTerminoEvento;
    }

    /**
     *
     * @param m_strDataLimiteTerminoEvento the m_strDataLimiteTerminoEvento to
     * set
     */
    public void setM_strDataLimiteTerminoEvento(String m_strDataLimiteTerminoEvento) {
        this.m_strDataLimiteTerminoEvento = m_strDataLimiteTerminoEvento;
    }

    public boolean validaTopico(Topico t) {
        if (t.valida() && validaGlobalTopico(t)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validaGlobalTopico(Topico t) {
        return !this.m_listaTopicos.contains(t);
    }

    public Object[] getDadosIntroduzidosAquandoCriacao() {
        Object[] dados = new Object[11];
        dados[0] = this.m_strTitulo;
        dados[1] = this.m_strDescricao;
        dados[2] = this.m_listaOrganizadores;
        dados[3] = this.m_local;
        dados[4] = this.m_strDataFim;
        dados[5] = this.m_strDataLimiteRegisto;
        dados[6] = this.m_strDataLimiteRevisao;
        dados[7] = this.m_strDataLimiteSubmissaoFinal;
        dados[8] = this.m_strDataLimiteSubmissão;
        dados[9] = this.m_strDataLimiteTerminoEvento;
        dados[10] = this.m_strDataLimiteinicioEvento;
        return dados;
    }

}

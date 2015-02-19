
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class Artigo implements Serializable  {

    /**
     * @return the tiposDeArtigo
     */
    public static String[] getTiposDeArtigo() {
        return tiposDeArtigo;
    }

    /**
     * @param aTiposDeArtigo the tiposDeArtigo to set
     */
    public static void setTiposDeArtigo(String[] aTiposDeArtigo) {
        tiposDeArtigo = aTiposDeArtigo;
    }
    /**
     * Variavel Titulo do Artigo
     */
    private String m_strTitulo;
    /**
     *Variavel resumo do Artigo
     */
    private String m_strResumo;
    /**
     *Variavel Lista de Autores
     */
    private List<Autor> m_listaAutores;
    /**
     *Variavel Autor correspondente
     */
    private Autor m_autorCorrespondente;
    /**
     *Variavel Ficheiro
     */
    private String m_strFicheiro;
    /**
     * Variavel Lista de Topicos
     */
    private List<Topico> m_listaTopicos;
    /**
     * Variavel Tipo de Artigo
     */
    private String tipoArtigo;
    /**
     * Variavel 
     */
    private static String[] tiposDeArtigo = {"full","short","poster"};
/**
 * 
 */
    // Criação do objecto Artigo
    public Artigo() {
        m_listaAutores = new ArrayList<Autor>();
        m_listaTopicos = new ArrayList<Topico>();
    }

    /**
     *Atributo do Titulo do Artigo
     * @param strTitulo
     */
    public void setTitulo(String strTitulo) {
        this.m_strTitulo = strTitulo;
    }
    
   /**
    * Return do atributo do Titulo
    * @return 
    */
    public String getTitulo() {
        return this.m_strTitulo;
    }

    /**
     * Atributo do Resumo do Artigo
     * @param strResumo
     */
    public void setResumo(String strResumo) {
        this.m_strResumo = strResumo;
    }

    /**
    * return do Atributo resumo do Artigo
    * @return 
    */
    public String getResumo() {
        return this.m_strResumo;
    }
    
    /**
     * Inserir o Nome do Autor e a Afiliacao 
     * @param strNome
     * @param strAfiliacao
     * @return autor
     */
    public Autor novoAutor(String strNome, String strAfiliacao) {
        Autor autor = new Autor();
        autor.setNome(strNome);
        autor.setAfiliacao(strAfiliacao);

        return autor;
    }

    /**
     * Resgisto do Autor pedido dos dados do novo Autor 
     * @param strNome
     * @param strAfiliacao
     * @param strEmail
     * @param utilizador
     * @return autor
     */
    public Autor novoAutor(String strNome, String strAfiliacao, String strEmail, Utilizador utilizador) {
        Autor autor = new Autor();

        autor.setNome(strNome);
        autor.setAfiliacao(strAfiliacao);
        autor.setEMail(strEmail);
        autor.setUtilizador(utilizador);

        return autor;
    }

    /**
     * Validacao dos dados do Autor para inserir na Lista 
     * @param autor
     * @return m_listaAutores.add(autor) ou false
     */
    public boolean addAutor(Autor autor) {
        if (validaAutor(autor)) {
            return m_listaAutores.add(autor);
        } else {
            return false;
        }

    }

    /**
     * confirmaçao da Validaçao do Autor
     * @param autor
     * @return
     */
    private boolean validaAutor(Autor autor) {
        return autor.valida();
    }

    /**
     * Obter Possiveis Autores Correspondentes.
     * Percorre a lista de autores e verifica para cada um se pode ou não ser autor-correspondente.
     * @return Lista de possíveis autores correspomdentes.
     */
    public List<Autor> getPossiveisAutoresCorrespondentes() {
        List<Autor> la = new ArrayList();

        for (Autor autor : this.m_listaAutores) {
            if (autor.podeSerCorrespondente()) {
                la.add(autor);
            }
        }
        return la;
    }

    /**
     * Atribuiçao de Autor Correspondente
     * @param autor
     */
    public void setAutorCorrespondente(Autor autor) {
        this.m_autorCorrespondente = autor;
    }

    /**
     * Atribuiçao do ficheiro
     * @param strFicheiro
     */
    public void setFicheiro(String strFicheiro) {
        this.m_strFicheiro = strFicheiro;
    }

    /**
     * Atribuição Lista de Topicos
     * @param listaTopicos
     * adicionado na iteração 2
     */
    public void setListaTopicos(List<Topico> listaTopicos) {
        this.m_listaTopicos.addAll(listaTopicos);
    }

    /**
     * Atributo Info
     * @return this.toString
     */
    public String getInfo() {
        return this.toString();
    }

    /**
     *metodo validar
     * @return
     */
    public boolean valida() {
        return true;
    }
/**
 * metodo Tostring 
 * @return Vai devolver o Titulo
 */
    @Override
    public String toString() {
        return this.m_strTitulo + "+ ...";
    }

    /**
     * Vai fazer a comperação do Autor a outros Autores na lista 
     * Se Existir na lista retorna False 
     * Se não Existir vai inserir o Autor na Lista
     * @param obj
     * @return 
     * 
     * Quando é que dois artigos são iguais? Quando têm o mesmo título e mesmo autor correspondente?
     * Ou quando todos os autores forem também os mesmos?
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Artigo) {
                Artigo aux = (Artigo) obj;
                 return this.m_autorCorrespondente.equals(aux.m_autorCorrespondente)
                        && this.m_strTitulo.equals(aux.m_strTitulo);
            } else {
                return false;
            }
        }
    }
/**
 * Metodo que vai atribuir o has code a um Objecto.
 * Vai mapear a memoria do endereço para um valor Integer.
 * @return 
 */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.m_strTitulo != null ? this.m_strTitulo.hashCode() : 0);
        hash = 19 * hash + (this.m_strResumo != null ? this.m_strResumo.hashCode() : 0);
        return hash;
    }
}

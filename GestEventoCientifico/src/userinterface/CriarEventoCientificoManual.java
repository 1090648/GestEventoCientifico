/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import controllers.CriarEventoCientificoController;
import eventosStates.EventoRegistadoState;
import javax.swing.JList;
import javax.swing.JOptionPane;
import model.Empresa;

/**
 *
 * @author RXFB73
 */
public class CriarEventoCientificoManual extends javax.swing.JDialog {

    private CriarEventoCientificoController m_controllerCEC;

    /**
     * Creates new form CriarEventoCientíficoManual
     * @param parent
     * @param modal
     * @param empresa
     */
    public CriarEventoCientificoManual(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        m_controllerCEC = new CriarEventoCientificoController(empresa);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_texto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txt_dataI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_usernameEmailUtilizador = new javax.swing.JTextField();
        txt_dataF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_DataLS = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_organizadores = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_local1 = new javax.swing.JTextField();

        jTextField2.setText("jTextField1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Título:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label1.setBackground(getBackground());
        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("UC2 - Criar Evento Científico Manual");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Título:");

        txt_titulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(153, 153, 153));
        txt_titulo.setText("insira titulo");
        txt_titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tituloMouseClicked(evt);
            }
        });
        txt_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tituloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Local:");

        txt_texto.setColumns(20);
        txt_texto.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txt_texto.setForeground(new java.awt.Color(153, 153, 153));
        txt_texto.setLineWrap(true);
        txt_texto.setRows(5);
        txt_texto.setText("insira o texto descritivo");
        txt_texto.setAutoscrolls(false);
        txt_texto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_texto.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_textoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txt_texto);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Texto Descritivo:");

        txt_dataI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_dataI.setForeground(new java.awt.Color(153, 153, 153));
        txt_dataI.setText("insira a data de inicio");
        txt_dataI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dataIMouseClicked(evt);
            }
        });
        txt_dataI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dataIActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Data de inicio:");

        txt_usernameEmailUtilizador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_usernameEmailUtilizador.setForeground(new java.awt.Color(153, 153, 153));
        txt_usernameEmailUtilizador.setText("insira Username/Email");
        txt_usernameEmailUtilizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_usernameEmailUtilizadorMouseClicked(evt);
            }
        });
        txt_usernameEmailUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameEmailUtilizadorActionPerformed(evt);
            }
        });

        txt_dataF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_dataF.setForeground(new java.awt.Color(153, 153, 153));
        txt_dataF.setText("insira a data de fim");
        txt_dataF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dataFMouseClicked(evt);
            }
        });
        txt_dataF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dataFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Data de fim:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Data limite de submissão:");

        txt_DataLS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_DataLS.setForeground(new java.awt.Color(153, 153, 153));
        txt_DataLS.setText("insira a data limite de submissão");
        txt_DataLS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_DataLSMouseClicked(evt);
            }
        });
        txt_DataLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DataLSActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Insira os Organizadores:");

        lista_organizadores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = obterArrayOrganizadores();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lista_organizadores);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Carregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Confirmar dados");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txt_local1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_local1.setForeground(new java.awt.Color(153, 153, 153));
        txt_local1.setText("insira o local");
        txt_local1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_local1MouseClicked(evt);
            }
        });
        txt_local1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_local1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_usernameEmailUtilizador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_local1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_titulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dataI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dataF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DataLS, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_local1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dataI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_dataF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_DataLS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_usernameEmailUtilizador, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tituloActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_txt_tituloActionPerformed

    private void txt_dataIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dataIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dataIActionPerformed

    private void txt_usernameEmailUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameEmailUtilizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameEmailUtilizadorActionPerformed

    private void txt_dataFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dataFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dataFActionPerformed

    private void txt_DataLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DataLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DataLSActionPerformed

    private void txt_tituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tituloMouseClicked
        // TODO add your handling code here:
        txt_titulo.setText("");
    }//GEN-LAST:event_txt_tituloMouseClicked

    private void txt_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_textoMouseClicked
        // TODO add your handling code here:
        txt_texto.setText("");
    }//GEN-LAST:event_txt_textoMouseClicked

    private void txt_usernameEmailUtilizadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usernameEmailUtilizadorMouseClicked
        // TODO add your handling code here:
        txt_usernameEmailUtilizador.setText("");
    }//GEN-LAST:event_txt_usernameEmailUtilizadorMouseClicked

    private void txt_dataIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dataIMouseClicked
        // TODO add your handling code here:
        txt_dataI.setText("");
    }//GEN-LAST:event_txt_dataIMouseClicked

    private void txt_dataFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dataFMouseClicked
        // TODO add your handling code here:
        txt_dataF.setText("");
    }//GEN-LAST:event_txt_dataFMouseClicked

    private void txt_DataLSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_DataLSMouseClicked
        // TODO add your handling code here:
        txt_DataLS.setText("");
    }//GEN-LAST:event_txt_DataLSMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:       
        String usernameOuEmail=this.txt_usernameEmailUtilizador.getText();
        if (m_controllerCEC.getRu().getUtilizador(usernameOuEmail) != null){
            m_controllerCEC.addOrganizador((usernameOuEmail), m_controllerCEC.getRu().getUtilizador(usernameOuEmail));
        } else if (m_controllerCEC.getRu().getUtilizadorByEmail(usernameOuEmail) != null) {
            m_controllerCEC.getM_evento().addOrganizador((usernameOuEmail), m_controllerCEC.getRu().getUtilizadorByEmail(usernameOuEmail));
        } else {
            JOptionPane.showMessageDialog(null, "Utilizador não encontrado!");
        }
        trataJlist();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        run();
        JOptionPane.showMessageDialog(null, "evento criado com sucesso!");
        this.m_controllerCEC.setEventoRegistado();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_local1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_local1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_local1MouseClicked

    private void txt_local1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_local1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_local1ActionPerformed

    public CriarEventoCientificoController getM_controllerCEC() {
        return m_controllerCEC;
    }

    public void setM_controllerCEC(CriarEventoCientificoController m_controllerCEC) {
        this.m_controllerCEC = m_controllerCEC;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private javax.swing.JList lista_organizadores;
    private javax.swing.JTextField txt_DataLS;
    private javax.swing.JTextField txt_dataF;
    private javax.swing.JTextField txt_dataI;
    private javax.swing.JTextField txt_local1;
    private javax.swing.JTextArea txt_texto;
    private javax.swing.JTextField txt_titulo;
    private javax.swing.JTextField txt_usernameEmailUtilizador;
    // End of variables declaration//GEN-END:variables
    public void run() {
        //novoEvento();

        introduzTitulo();
        introduzDescricao();
        introduzLocal();
        introduzDataInicio();
        introduzDataFim();
        introduzDataLimiteSubmissão();
        adicionaOrganizadores();
        this.m_controllerCEC.registaEvento();
    }

    private void adicionaOrganizadores() {
        
    }
//
//    private void novoEvento() {
//        m_controllerCEC.novoEvento();
//    }

    private void introduzTitulo() {
        String strTitulo = this.txt_titulo.getText();

        m_controllerCEC.setTitulo(strTitulo);
    }

    private void introduzDescricao() {
        String strDescricao = this.txt_texto.getText();

        m_controllerCEC.setDescricao(strDescricao);
    }

    private void introduzLocal() {
        String strLocal = this.txt_usernameEmailUtilizador.getText();

        m_controllerCEC.setLocal(strLocal);
    }

    private void introduzDataInicio() {
        String strDataInicio = this.txt_dataI.getText();

        m_controllerCEC.setDataInicio(strDataInicio);
    }

    private void introduzDataFim() {
        String strDataFim = this.txt_dataF.getText();

        m_controllerCEC.setDataFim(strDataFim);
    }

    private void introduzDataLimiteSubmissão() {
        String strDataLimiteSubmissão = this.txt_DataLS.getText();

        m_controllerCEC.setDataLimiteSubmissão(strDataLimiteSubmissão);
    }

    public String[] obterArrayOrganizadores() {
        String[] items = new String[m_controllerCEC.getM_evento().getListaOrganizadores().size()];

        for (int i = 0; i < items.length; i++) {
            {
                items[i] = m_controllerCEC.getM_evento().getListaOrganizadores().get(i).getNome();
            }
        }
        return items;
    }

    public void trataJlist() {
        this.lista_organizadores.removeAll();

        lista_organizadores= new JList(obterArrayOrganizadores());
        jScrollPane2.setViewportView(lista_organizadores);
    }
}
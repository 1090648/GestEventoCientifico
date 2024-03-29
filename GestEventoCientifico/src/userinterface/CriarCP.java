package userinterface;

import controllers.CriarCPController;
import java.util.List;
import javax.swing.JOptionPane;
import model.Empresa;
import model.Evento;
import model.Revisor;
import model.Topico;
import model.Utilizador;

/**
 *
 * @author 1090698
 */
public class CriarCP extends javax.swing.JDialog {
    CriarCPController CPcontroller;

    /**
     * Creates new form CriarCP
     *
     * @param parent
     * @param modal
     * @param empresa
     */
    public CriarCP(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        CPcontroller = new CriarCPController(empresa);
        initComponents();
        jComboBox_org_adicionar.setEnabled(false);
        jLabel_org_add.setEnabled(false);
        jButton_add_org.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        label_titulo = new java.awt.Label();
        jComboBox_org = new javax.swing.JComboBox();
        jLabel_evento = new javax.swing.JLabel();
        jLabel_org = new javax.swing.JLabel();
        jComboBox_evento = new javax.swing.JComboBox();
        jButton_add_org = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBox_org_adicionar = new javax.swing.JComboBox();
        jLabel_org_add = new javax.swing.JLabel();
        jButton_selEvento = new javax.swing.JButton();
        jButton_confirmar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_add_topico_revisor = new javax.swing.JButton();
        jLabel_org_add1 = new javax.swing.JLabel();
        jComboBox_topicos_evento = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label_titulo.setText("UC3 - Criar comissão de programa");

        jComboBox_org.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_orgActionPerformed(evt);
            }
        });

        jLabel_evento.setFont(jLabel_evento.getFont().deriveFont(jLabel_evento.getFont().getStyle() & ~java.awt.Font.BOLD, 14));
        jLabel_evento.setText("Qual o evento:");

        jLabel_org.setFont(jLabel_org.getFont().deriveFont(jLabel_org.getFont().getStyle() & ~java.awt.Font.BOLD, 14));
        jLabel_org.setText("Qual o seu nome:");

        jComboBox_evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_eventoActionPerformed(evt);
            }
        });

        jButton_add_org.setText("Adicionar");
        jButton_add_org.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_orgActionPerformed(evt);
            }
        });

        jComboBox_org_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_org_adicionarActionPerformed(evt);
            }
        });

        jLabel_org_add.setFont(jLabel_org_add.getFont().deriveFont(jLabel_org_add.getFont().getStyle() & ~java.awt.Font.BOLD, 14));
        jLabel_org_add.setText("Revisor a adicionar:");

        jButton_selEvento.setText("Escolher Evento");
        jButton_selEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selEventoActionPerformed(evt);
            }
        });

        jButton_confirmar.setFont(jButton_confirmar.getFont().deriveFont(jButton_confirmar.getFont().getStyle() | java.awt.Font.BOLD, 12));
        jButton_confirmar.setText("Confirmar dados");
        jButton_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirmarActionPerformed(evt);
            }
        });

        jButton_cancelar.setFont(jButton_cancelar.getFont().deriveFont(jButton_cancelar.getFont().getStyle() | java.awt.Font.BOLD, 12));
        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        jButton_add_topico_revisor.setText("Adicionar");
        jButton_add_topico_revisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_topico_revisorActionPerformed(evt);
            }
        });

        jLabel_org_add1.setFont(jLabel_org_add1.getFont().deriveFont(jLabel_org_add1.getFont().getStyle() & ~java.awt.Font.BOLD, 14));
        jLabel_org_add1.setText("Topicos do evento:");

        jComboBox_topicos_evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_topicos_eventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel_org_add)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_org_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_add_org, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_cancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel_org_add1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_topicos_evento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_add_topico_revisor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_evento)
                                    .addComponent(jLabel_org))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_org, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox_evento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_selEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_evento)
                            .addComponent(jButton_selEvento)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_org)
                        .addComponent(jComboBox_org, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add_org)
                    .addComponent(jComboBox_org_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_org_add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add_topico_revisor)
                    .addComponent(jComboBox_topicos_evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_org_add1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        for (int i = 0; i < this.CPcontroller.obterOrganizadoresEmpresa().size(); i++) {
            jComboBox_org.addItem(this.CPcontroller.obterOrganizadoresEmpresa().get(i).getUtilizador().getNome() + " - " + this.CPcontroller.obterOrganizadoresEmpresa().get(i).getUtilizador().getUsername());
        }
        jComboBox_evento.removeAllItems();
        List<Evento> jcb_eventos_lista = this.CPcontroller.getEventosOrganizador(this.CPcontroller.obterOrganizadoresEmpresa().get(jComboBox_org.getSelectedIndex()).getUtilizador().getUsername());
        for (int i = 0; i < jcb_eventos_lista.size(); i++) {
            jComboBox_evento.addItem(jcb_eventos_lista.get(i));
        }

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_orgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_orgActionPerformed

        jComboBox_evento.removeAllItems();
        List<Evento> jcb_eventos_lista = this.CPcontroller.getEventosOrganizador(this.CPcontroller.obterOrganizadoresEmpresa().get(jComboBox_org.getSelectedIndex()).getUtilizador().getUsername());
        for (int i = 0; i < jcb_eventos_lista.size(); i++) {
            jComboBox_evento.addItem(jcb_eventos_lista.get(i));
        }

    }//GEN-LAST:event_jComboBox_orgActionPerformed


    private void jComboBox_eventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_eventoActionPerformed

    }//GEN-LAST:event_jComboBox_eventoActionPerformed

    private void jButton_add_orgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_orgActionPerformed
        String[] opSimNao = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this,
                "Deseja adicionar '" + jComboBox_org_adicionar.getSelectedItem() + "' à CP do seguinte Evento? \nEvento: " + jComboBox_evento.getSelectedItem(),
                "Confirmação",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opSimNao,
                opSimNao[1]);

        int SIM = 0;
        if (resposta == SIM) {

            Revisor r = new Revisor(this.CPcontroller.getLista_Utiliz_Nao_OrganizadoresEvento().get(jComboBox_org_adicionar.getSelectedIndex()));            
            this.CPcontroller.registaMembroCP(r);
            
            List<Topico> topicos_evento = this.CPcontroller.getTopicosEvento();
            for (int i = 0; i < topicos_evento.size(); i++) {
                jComboBox_topicos_evento.addItem(topicos_evento.get(i));
            }

        }
    }//GEN-LAST:event_jButton_add_orgActionPerformed

    private void jComboBox_org_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_org_adicionarActionPerformed


    }//GEN-LAST:event_jComboBox_org_adicionarActionPerformed

    private void jButton_selEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selEventoActionPerformed
        jComboBox_org_adicionar.setEnabled(true);
        jLabel_org_add.setEnabled(true);
        jButton_add_org.setEnabled(true);
        jComboBox_org.setEnabled(false);
        jComboBox_evento.setEnabled(false);
        jLabel_evento.setEnabled(false);
        jLabel_org.setEnabled(false);
        jButton_selEvento.setEnabled(false);
        jComboBox_org_adicionar.removeAllItems();
        
        String strId_org = this.CPcontroller.obterOrganizadoresEmpresa().get(jComboBox_org.getSelectedIndex()).getUtilizador().getUsername();
        Evento evento = this.CPcontroller.getEventosOrganizador(strId_org).get(jComboBox_evento.getSelectedIndex());
        this.CPcontroller.selectEvento(evento);        

        List<Utilizador> util_n_org_evento = this.CPcontroller.getLista_Utiliz_Nao_OrganizadoresEvento();
        for (int i = 0; i < util_n_org_evento.size(); i++) {
            jComboBox_org_adicionar.addItem(util_n_org_evento.get(i).getNome());
        }

    }//GEN-LAST:event_jButton_selEventoActionPerformed

    private void jButton_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirmarActionPerformed

        this.CPcontroller.setCP();

        JOptionPane.showMessageDialog(rootPane, "CP associada com sucesso ao Evento " + this.CPcontroller.getM_evento());
        dispose();
    }//GEN-LAST:event_jButton_confirmarActionPerformed

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_cancelarActionPerformed

    private void jButton_add_topico_revisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_topico_revisorActionPerformed

        Revisor revisor = new Revisor(this.CPcontroller.getLista_Utiliz_Nao_OrganizadoresEvento().get(jComboBox_org_adicionar.getSelectedIndex()));

        Topico topico = this.CPcontroller.getTopicosEvento().get(jComboBox_topicos_evento.getSelectedIndex());
        
        this.CPcontroller.addTopicoRevisor(revisor, topico);
        
    }//GEN-LAST:event_jButton_add_topico_revisorActionPerformed

    private void jComboBox_topicos_eventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_topicos_eventoActionPerformed

    }//GEN-LAST:event_jComboBox_topicos_eventoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_org;
    private javax.swing.JButton jButton_add_topico_revisor;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JButton jButton_confirmar;
    private javax.swing.JButton jButton_selEvento;
    private javax.swing.JComboBox jComboBox_evento;
    private javax.swing.JComboBox jComboBox_org;
    private javax.swing.JComboBox jComboBox_org_adicionar;
    private javax.swing.JComboBox jComboBox_topicos_evento;
    private javax.swing.JLabel jLabel_evento;
    private javax.swing.JLabel jLabel_org;
    private javax.swing.JLabel jLabel_org_add;
    private javax.swing.JLabel jLabel_org_add1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private java.awt.Label label_titulo;
    // End of variables declaration//GEN-END:variables
}

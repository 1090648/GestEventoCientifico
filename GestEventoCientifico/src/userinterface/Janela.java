package userinterface;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import model.Empresa;
import model.FicheiroDadosBinarios;
import utils.ImportFicheiros;

public class Janela extends JFrame {

    private static final int JANELA_LARGURA = 900, JANELA_ALTURA = 650;
    private Empresa empresa;
    public Janela(Empresa empresa) {

        super("Gestão de eventos científicos - LAPR2 2013/2014");
        this.empresa = empresa;
        addMenuTopo();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                fechar();
            }
        });

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        pack();
        setResizable(true);
        setSize(JANELA_LARGURA, JANELA_ALTURA);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.white);
        add(BorderLayout.CENTER,new JLabel(new ImageIcon("isep_logo.jpg")));
    }

    private void addMenuTopo() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        //        menuBar.add(criarMenuEmpresa());
        menuBar.add(criarMenuUtilizadorNaoRegistado());
        menuBar.add(criarMenuUtilizadorRegistado());
        menuBar.add(criarMenuRevisor());
        menuBar.add(criarMenuOrganizador());
        menuBar.add(criarMenuAdministrador());
        menuBar.add(criarMenuAjuda());
        menuBar.add(criarMenuCarregarFicheiros());
    }

// inicio - menu Utilizador Não Registado
    private JMenu criarMenuUtilizadorNaoRegistado() {
        JMenu menu = new JMenu("Utilizador não registado");
        menu.add(criarItemRegistarUtilizador());
        return menu;
    }

    private JMenuItem criarItemRegistarUtilizador() {
        JMenuItem item = new JMenuItem("UC1. Registar Utilizador");

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* Create and display the dialog */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        CriarUtilizador dialog = new CriarUtilizador(new javax.swing.JFrame(), true,empresa);
                        dialog.setVisible(true);
                    }
                });
            }
        });
        return item;
    }
// fim - menu Utilizador Não Registado

// inicio - menu Utilizador Registado
    private JMenu criarMenuUtilizadorRegistado() {
        JMenu menu = new JMenu("Utilizador registado");
        menu.add(criarItemSubmeterArtigo());
        menu.add(criarItemSubmeterArtigoFinal());
        menu.add(criarItemRegistarAutorEventoCientifico());
        return menu;
    }

    private JMenuItem criarItemSubmeterArtigo() {
        JMenuItem item = new JMenuItem("UC4. Submeter Artigo");
        return item;
    }

    private JMenuItem criarItemSubmeterArtigoFinal() {
        JMenuItem item = new JMenuItem("UC11. Submeter Artigo Final");
        return item;
    }

    private JMenuItem criarItemRegistarAutorEventoCientifico() {
        JMenuItem item = new JMenuItem("UC13. Registar Autor em Evento Científico");
        return item;
    }
// fim - menu Utilizador Registado

// inicio - menu Revisor
    private JMenu criarMenuRevisor() {
        JMenu menu = new JMenu("Revisor");
        menu.add(criarItemSubmeterRevisaoArtigo());
        menu.add(criarItemDefinirTopicosPericia());
        return menu;
    }

    private JMenuItem criarItemSubmeterRevisaoArtigo() {
        JMenuItem item = new JMenuItem("UC6. Submeter Revisão de Artigo");
        return item;
    }

    private JMenuItem criarItemDefinirTopicosPericia() {
        JMenuItem item = new JMenuItem("UC10. Definir Tópicos de Perícia");
        return item;
    }
// fim - menu Revisor

// inicio - menu Organizador
    private JMenu criarMenuOrganizador() {
        JMenu menu = new JMenu("Organizador");
        menu.add(criarItemCriarComissãoPrograma());
        menu.add(criarItemDistribuirRevisõesArtigos());
        menu.add(criarItemDecidirSobreArtigos());
        menu.add(criarItemNotificarAutores());
        return menu;
    }

    private JMenuItem criarItemCriarComissãoPrograma() {
        JMenuItem item = new JMenuItem("UC3. Criar Comissão de Programa");
        
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        CriarCP dialog = new CriarCP(new javax.swing.JFrame(), true,empresa);
                        dialog.setVisible(true);
                    }
                });
            }
        });
        
        return item;
    }

    private JMenuItem criarItemDistribuirRevisõesArtigos() {
        JMenuItem item = new JMenuItem("UC5. Distribuir Revisões de Artigos");
        return item;
    }

    private JMenuItem criarItemDecidirSobreArtigos() {
        JMenuItem item = new JMenuItem("UC7. Decidir sobre Artigos");
                item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* Create and display the dialog */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        DecidirSobreArtigos dialog = new DecidirSobreArtigos(new javax.swing.JFrame(), true,empresa);
                        dialog.setVisible(true);
                    }
                });
            }
        });
        return item;
    }

    private JMenuItem criarItemNotificarAutores() {
        JMenuItem item = new JMenuItem("UC8. Notificar Autores");
        return item;
    }
// fim - menu Organizador

// inicio - menu Administrador
    private JMenu criarMenuAdministrador() {
        JMenu menu = new JMenu("Administrador");
        menu.add(criarItemEventoCientifico());
        menu.add(criarItemEventoCientificoFicheiro());
//        menu.add(criarSubmenuAdministrador());
        return menu;
    }

    private JMenuItem criarItemEventoCientifico() {
        JMenuItem item = new JMenuItem("UC2. Criar Evento Cientifico Manual");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* Create and display the dialog */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        CriarEventoCientificoManual dialog = new CriarEventoCientificoManual(new javax.swing.JFrame(), true,empresa);
                        dialog.setVisible(true);
                    }
                });
            }
        });
        return item;
    }

    private JMenuItem criarItemEventoCientificoFicheiro() {
        JMenuItem item = new JMenuItem("UC12. Criar Evento Cientifico a partir de Ficheiro");
        return item;
    }
// fim - menu Administrador

// inicio - menu ajuda
    private JMenu criarMenuAjuda() {
        JMenu menu = new JMenu("Ajuda");
        menu.setMnemonic(KeyEvent.VK_A);

        menu.add(criarItemAcerca());

        return menu;
    }

    private JMenuItem criarItemAcerca() {
        JMenuItem item = new JMenuItem("Acerca", KeyEvent.VK_C);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Janela.this,
                        "@Copyright\nLAPR2 2013/2014",
                        "Gestão de Eventos Cientificos",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        return item;
    }
// fim - menu ajuda

    
// inicio - menu Carregar ficheiros
    private JMenu criarMenuCarregarFicheiros() {
        JMenu menu = new JMenu("Carregar Ficheiros");
        menu.add(criarItemFicheiroCSV());
        menu.add(criarItemFicheiroXML());
        return menu;
    }

    /*
    carregar ficheiro CSV
    */
    private JMenuItem criarItemFicheiroCSV() {
        JMenuItem item = new JMenuItem("Carregar ficheiro CSV");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JFileChooser fich = new JFileChooser();
                    int resp = fich.showOpenDialog(Janela.this);
                    File caminho = null;
                    if (resp == JFileChooser.APPROVE_OPTION) {
                        caminho = fich.getSelectedFile();
                    }
                    System.out.println("Localização: " + caminho.toString());
                    ImportFicheiros.LerFichCSV(caminho);
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possível abrir o ficheiro!");
                }
            }
        });
        return item;
    }
    /*
    carregar ficheiro XML
    */
    private JMenuItem criarItemFicheiroXML() {
        JMenuItem item = new JMenuItem("Carregar ficheiro XML");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JFileChooser fich = new JFileChooser();
                    int resp = fich.showOpenDialog(Janela.this);
                    File caminho = null;
                    if (resp == JFileChooser.APPROVE_OPTION) {
                        caminho = fich.getSelectedFile();
                    }
                    System.out.println("Localização: " + caminho.toString());
                    ImportFicheiros.LerFichXML(caminho);
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possível abrir o ficheiro!");
                }
            }
        });
        return item;
    }
// fim - menu Carregar ficheiros
    
    
    
    
    /**
     * Mostrar caixa de dialogo antes de fechar a janela.
     */
    private void fechar() {
        String[] opSimNao = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this,
                "Deseja fechar a aplicação?",
                "Gestão de Eventos Científicos",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opSimNao,
                opSimNao[1]);

        final int SIM = 0;
        if (resposta == SIM) {
            
            try {
                FicheiroDadosBinarios.gravarObjeto(empresa);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
           
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    }
}

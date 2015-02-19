/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import utils.ImportFicheiros;

/**
 *
 * @author pedro_000
 */
public class CriarEventoCientificoAprtirDeFicheiroController {

    public static ArrayList data = new ArrayList();
    public static ArrayList organizadores = new ArrayList();
    public static boolean tipoAltCSV = true;
    public static int opção = 0;

    public static int VerificaTipo(File f) {
        String ficheiro = f.toString();
        String[] local = ficheiro.split(".");
        if (ficheiro.contains(".") && local.length > 0) {
            String tipo = local[1];
            int expResult = 0;
            if (tipo.equalsIgnoreCase("CSV")) {
                expResult = 1;
            } else {
                if (tipo.equalsIgnoreCase("XML")) {
                    expResult = 2;
                }
            }
            return expResult;
        } else {
            return 0;
        }
    }

    public static void TrataCarregar(File f) {
        opção = CriarEventoCientificoAprtirDeFicheiroController.VerificaTipo(f);
        try {
            if (opção == 1) {
                data = ImportFicheiros.LerFichCSV(f);
                tipoAltCSV = VerificaCSV();
            } else {
                if (opção == 2) {
                    data = ImportFicheiros.LerFichXML(f);
                } else {
                    JOptionPane.showMessageDialog(null, "Extensão não suportada!");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Impossível carregar ficheiro!");
        }
    }

    public static boolean VerificaCSV() {
        if (data.get(2).equals("ID")) {
            return true;
        }
        return false;
    }

    public static void FiltraOrganizadoresEvento() {
        //Se xml ou csv simples, começar a partir de 9.. csv alt 12
        if (opção == 1 || opção == 2) {
            for (int i = 9; i < data.size(); i++) {
                organizadores.add(data.get(i));
            }
        } else {
            if (!tipoAltCSV) {
                JOptionPane.showMessageDialog(null, "Erro no carregamento de organizadores.");
            } else {
                for (int i = 14; i < data.size(); i++) {
                    organizadores.add(data.get(i));

                }
            }
        }
    }

    public static void AtrbCSV(ArrayList data) {
        int ano = Integer.parseInt((String) data.get(0));
        String name = (String) data.get(1);
        String host = (String) data.get(2);
        String city = (String) data.get(3);
        String country = (String) data.get(4);
        String date = (String) data.get(5);
        int duracao = Integer.parseInt((String) data.get(6));
        String website = (String) data.get(7);
    }

    public static void AtrbCSValt(ArrayList data) {
        int ano = Integer.parseInt((String) data.get(0));
        String name = (String) data.get(1);
        String id = (String) data.get(2);
        String host = (String) data.get(3);
        String city = (String) data.get(4);
        String country = (String) data.get(5);
        String LimSub = (String) data.get(6);
        String LimRev = (String) data.get(7);
        String LimPaper = (String) data.get(8);
        String LimAut = (String) data.get(9);
        String date = (String) data.get(10);
        int duracao = Integer.parseInt((String) data.get(11));
        String website = (String) data.get(12);
    }

    public static void AtrbXML(ArrayList data) {
        int ano = Integer.parseInt((String) data.get(0));
        String name = (String) data.get(1);
        String host = (String) data.get(2);
        String city = (String) data.get(3);
        String country = (String) data.get(4);
        String begin = (String) data.get(5);
        String end = (String) data.get(6);
        String webpage = (String) data.get(7);
    }
    
    public void MostraOrg(){
    
    }
}

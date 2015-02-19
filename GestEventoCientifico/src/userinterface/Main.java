package userinterface;

import java.io.*;
import model.Empresa;
import model.FicheiroDadosBinarios;

/**
 *
 * @author 
 */
public class Main implements Serializable  {

    /**
     */
    public static Empresa empresa;

    public static void main(String[] args) {
        try {
            File ficheiroBinario = new File("dados.bin");

            if (ficheiroBinario.exists()) {
                empresa = (Empresa) FicheiroDadosBinarios.lerObjeto(ficheiroBinario);
            } else {
                empresa = new Empresa();
            }

            Janela janela = new Janela(empresa);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

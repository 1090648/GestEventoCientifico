package model;

import java.io.*;

/**
 *
 * @author 1090698
 */

public class FicheiroDadosBinarios implements Serializable {

    /**
     *
     * @param obj
     * @return
     * @throws IOException
     */
    public static Object gravarObjeto(Object obj) throws IOException {

        File ficheiroBinario = new File("dados.bin");

        FileOutputStream saida = new FileOutputStream(ficheiroBinario);
        ObjectOutputStream fiche = new ObjectOutputStream(saida);

        fiche.writeObject(obj);

        fiche.flush();
        fiche.close();
        saida.close();

        System.out.println("Dados guardados com sucesso");

        return ficheiroBinario;

    }

    /**
     *
     * @param arquivoSelecionado
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object lerObjeto(File arquivoSelecionado) throws IOException, ClassNotFoundException {

        FileInputStream fich = new FileInputStream(arquivoSelecionado);
        ObjectInputStream objs = new ObjectInputStream(fich);

        Object obj = objs.readObject();

        fich.close();
        objs.close();

        return obj;

    }

}


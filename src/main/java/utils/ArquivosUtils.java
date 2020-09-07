package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ArquivosUtils {

    //Método static não altera o contexto do objeto, por essa razão não precisa instancia-la
    public static String getPropriedade(String nomeDaProriedade) throws IOException {
        Properties propriedades = new Properties();
        propriedades.load(new FileInputStream("src\\main\\resources\\application.properties"));
        return propriedades.getProperty(nomeDaProriedade);
    }
}

package logicabooleana;

import java.util.Objects;

/**
 * @author dibpereira@rd.com.br @created on 22/01/2021
 */
public class Aplication {
    public static void main(String[] args) {
        Integer numero1 = 1;
        System.out.println(validador1(numero1));
    }

    public static Boolean validador1(Integer numero){
        return numero==null;
    }

    public static Boolean validador2(Integer numero){
        return Objects.isNull(numero);
    }


}

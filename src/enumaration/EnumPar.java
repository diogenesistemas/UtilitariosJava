package enumaration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dibpereira@rd.com.br @created on 22/01/2021
 */
public enum EnumPar {

    STATUS1( 2),
    STATUS2( 6);

    private Integer valor;

    private static final Map<String, EnumPar> statusImpar = new HashMap<>();

    EnumPar(Integer valor) {
        this.valor = valor;
    }

    static {
        for (EnumPar rd : EnumPar.values()) {
            statusImpar.put(rd.name(), rd);
        }
    }

    public Integer getValor() {
        return valor;
    }

    public static EnumPar getStatusForName(String name){
        return statusImpar.get(name);
    }


}

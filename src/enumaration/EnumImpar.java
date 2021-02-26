package enumaration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dibpereira@rd.com.br @created on 22/01/2021
 */
public enum EnumImpar {

    STATUS1( 1),
    STATUS2( 3);

    private Integer valor;

    private static final Map<String, EnumImpar> statusImpar = new HashMap<>();

    EnumImpar(Integer valor) {
        this.valor = valor;
    }

    static {
        for (EnumImpar rd : EnumImpar.values()) {
            statusImpar.put(rd.name(), rd);
        }
    }

    public Integer getValor() {
        return valor;
    }

    public static EnumImpar getStatusForName(String name){
        return statusImpar.get(name);
    }


}

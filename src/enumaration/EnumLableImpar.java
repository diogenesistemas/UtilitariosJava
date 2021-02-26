package enumaration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dibpereira@rd.com.br @created on 22/01/2021
 */
public enum EnumLableImpar {

    STATUS1("STATUS1", 1),
    STATUS2("STATUS2", 3);

    private String label;
    private Integer valor;

    private static final Map<String, EnumLableImpar> statusImpar = new HashMap<>();

    EnumLableImpar(String label, Integer valor) {
        this.label = label;
        this.valor = valor;
    }

    static {
        for (EnumLableImpar rd : EnumLableImpar.values()) {
            statusImpar.put(rd.label, rd);
        }
    }

    public Integer getValor() {
        return valor;
    }

    public static EnumLableImpar pegaStatus(String label){
        return statusImpar.get(label);
    }


}

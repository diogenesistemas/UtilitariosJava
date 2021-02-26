package enumaration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dibpereira@rd.com.br @created on 22/01/2021
 */
public enum EnumLablePar {

    STATUS1("STATUS1", 2),
    STATUS2("STATUS2", 6);

    private String label;
    private Integer valor;

    private static final Map<String, EnumLablePar> statusImpar = new HashMap<>();

    EnumLablePar(String label, Integer valor) {
        this.label = label;
        this.valor = valor;
    }

    static {
        for (EnumLablePar rd : EnumLablePar.values()) {
            statusImpar.put(rd.label, rd);
        }
    }

    public Integer getValor() {
        return valor;
    }

    public static EnumLablePar pegaStatus(String label){
        return statusImpar.get(label);
    }


}

package enumaration;

/**
 * @author dibpereira@rd.com.br @created on 22/01/2021
 */
public class AplicacaoEnum {
    public static void main(String[] args) {
        EnumLableImpar enumLableImpar = EnumLableImpar.STATUS1;

        System.out.println(enumLableImpar);
        System.out.println(enumLableImpar.getValor());

        EnumLablePar enumLablePar = EnumLablePar.pegaStatus(enumLableImpar.name());

        System.out.println(enumLablePar);
        System.out.println(enumLablePar.getValor());

        System.out.println("--------------------------------");

        EnumImpar enumImpar = EnumImpar.STATUS2;
        System.out.println(enumImpar);
        System.out.println(enumImpar.getValor());

        EnumPar enumPar = EnumPar.getStatusForName(enumImpar.name());
        System.out.println(enumPar);
        System.out.println(enumPar.getValor());
    }
}

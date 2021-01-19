package calendar;

import util.Dorminhoco;

/**
 * @author dibpereira@rd.com.br @created on 19/01/2021
 */
public class ChronometroJava6 {

    public static void main(String[] args) {

        long inicio = 0L;
        inicio = System.currentTimeMillis();

        Dorminhoco.durma(3000L);

        long fim = System.currentTimeMillis();
        long duracao = fim - inicio;
        System.out.println(duracao);

        /* Java = 6 */
        String hmsm = format(duracao);
        System.out.printf(hmsm);

    }


    public static String format(long duracao) {
        return String.format("%02d:%02d:%02d:%03d", duracao / 3600000, (duracao / 60000) % 60,
                (duracao / 1000) % 60, duracao % 1000);
    }


}

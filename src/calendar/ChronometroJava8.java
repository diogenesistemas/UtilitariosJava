package calendar;

import util.Dorminhoco;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author dibpereira@rd.com.br @created on 19/01/2021
 */
public class ChronometroJava8 {


    public static void main(String[] args) {

        LocalDateTime inicio = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));

        Dorminhoco.durma(3000L);

        LocalDateTime fim = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        Duration duracao = Duration.between(inicio, fim);
        System.out.println(duracao);

        /* Java = 8 */
        String hmsm = format(duracao);
        System.out.printf(hmsm);

    }

    public static String format(Duration d) {
        long hours = d.toHours();
        d = d.minusHours(hours);
        long minutes = d.toMinutes();
        d = d.minusMinutes(minutes);
        long seconds = d.getSeconds() ;
        d = d.minusSeconds(seconds);
        long millis = d.toMillis();
        return String.format("%02d:%02d:%02d:%03d",hours, minutes, seconds, millis);
    }


}

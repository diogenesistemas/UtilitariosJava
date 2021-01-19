package calendar;

import util.Dorminhoco;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author dibpereira@rd.com.br @created on 19/01/2021
 */
public class ChronometroJava9 {

    public static void main(String[] args) {
        LocalDateTime inicio = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));

        Dorminhoco.durma(3000L);

        LocalDateTime fim = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));

        Duration duracao = Duration.between(inicio, fim);
        System.out.println(duracao);

        /* Java > 9 */
//        String hmsm = String.format("%02d:%02d:%02d:%03d",
//                duracao.toHoursPart(),
//                duracao.toMinutesPart(),
//                duracao.toSecondsPart(),
//                duracao.toMillisPart());
//
//        System.out.printf(hmsm);

    }

}

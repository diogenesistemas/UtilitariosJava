package calendar;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.logging.Level;

/**
 * @author dibpereira@rd.com.br @created on 12/01/2021
 */
public class AplicacaoComData {

    public static void main(String[] args) {
        // Antes do Java 8
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dataHoraInicio = dateFormat.format(Calendar.getInstance().getTime());
        System.out.println("Calendar Data Início: " + dataHoraInicio);

        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);

        System.out.println("Calendar Ano Anterior: " + new Date(cal.getTimeInMillis()));


        // A partir do Java 8
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime hoje = LocalDateTime.now();
        System.out.println("Data de Hoje " + hoje.format(formatter));

        LocalDateTime outraData = hoje.minus(1, ChronoUnit.YEARS);
        long diferenca = ChronoUnit.YEARS.between(outraData, hoje);

        System.out.println(String.format("Diferença entre datas é de %s ano(s)", diferenca));


        LocalDateTime dataComTimeZone = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data de hoje com time zone: " + dataComTimeZone.format(formatter));


    }
}

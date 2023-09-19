import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// Desafio 2
// Conversão de Tempo
public class Ex02 {
    public static void main(String[] args) {

        long timestamp = 1693225566L;

        Date data = new Date(timestamp * 1000L);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");

        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        String dataFormatada = sdf.format(data);

        System.out.println("Dados convertidos: " + dataFormatada);
    }
}


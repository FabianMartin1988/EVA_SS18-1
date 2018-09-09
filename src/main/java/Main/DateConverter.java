package Main;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateConverter {

// Funktion um das Datumsformat in eine für Java verarbeitbare Form umzuwandeln
	
    public LocalDate formatDate(String cellValue) throws DateTimeException {

        try {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("M/d/yy");
            LocalDate FormattedDateOut = LocalDate.parse(cellValue,df);
            return FormattedDateOut;
        }
        catch (DateTimeException i){

            System.out.print("DateTimeException: " + cellValue);
            return null;
        }
    }
}

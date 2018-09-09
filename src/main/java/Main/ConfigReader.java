package Main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    protected static Properties prop;
    private InputStream inputStream;

    public ConfigReader() {

    	// Christian
        prop = new Properties();
        inputStream = ConfigReader.class.getClassLoader().getResourceAsStream("config_wp.txt");
 
        // Versuch die Datei zu öffnen / Fehlermeldung bei negativem Ausgang
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen von config_wp.txt");
        }
    }
    

    // Funktion die in der Config Datei nach dem String "YoY" + indicator sucht und den entsprechenden int Wert zurück gibt
    public int getIndicator(int indicator) {
        String key = "YoY"+indicator;
        Integer i = Integer.valueOf(prop.getProperty(key));
        return i;
    }

    // Funktion die den Dateipfad zurückgibt
    public String getFilePath() {
        return prop.getProperty("filepath");
    }

    // Liest die ConfigDatei aus und sucht nach einem Index Wert um die auszulesende Lasche zu bestimmen
    public int getWorkbook() {
        Integer workbook = Integer.valueOf(prop.getProperty("workbook"));
        return workbook;
    }

}

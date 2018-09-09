package Main;

import java.time.LocalDate;
import java.util.ArrayList;

public class NumberSet {
    /*
    Ein Datums-Objekt, in dem alle Werte gespeichert sind
    */
    private LocalDate numberSetDate = null;
    private ArrayList<Float> numberSetValues = new ArrayList<>();

    // Datum setzen
    public void setDate(LocalDate date) {
        this.numberSetDate = date;
    }
    
    // Werte hinzuf�gen
    public void setValues(float i) {
        numberSetValues.add(i);
    }

    // zum NumberSet zugeh�riges Datum auslesen (inkl. Pr�fung ob das Datum grunds�tzlich vorhanden ist)
    public LocalDate getDate() {
        if (numberSetDate != null) {

            return numberSetDate;
        }

        return null;
    }

    // Values im Numberset in einer entsprechenden Stelle auslesen und zur�ckgeben
    public float getValues(int j) {
        return numberSetValues.get(j);
    }

    // Hilfsfunktion um das NumberSet datum auszudrucken
    public void printDate() {
        System.out.println("\nDas Datum dieses NumberSets ist: " + numberSetDate);
    }

    // Pr�ffunktion : ist das Array an dieser Stelle unbeschrieben?
    public boolean checkArrayIntegrity() {
        boolean check = numberSetValues.isEmpty();
        return check;
    }
}


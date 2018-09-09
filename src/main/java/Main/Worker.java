package Main;

// soll ich diese Klasse als Interface zeichnen (Christian)
public class Worker implements Runnable {

    private int id;
    private int indicator;
    private NumberSetList numberSetList;

    // Dem Worker-Konstukor weerden die "Werkzeuge" und die zu bearbeitende NumberSetList übergeben
    public Worker(int id, int indicator, NumberSetList numberSetList) {
        this.id = id;
        this.indicator = indicator;
        this.numberSetList = numberSetList;
    }

    @Override
    public void run() {

        System.out.println("Starting Thread: " + id);
        KPICalc calc = new KPICalc(numberSetList);
        calc.calculateYoYProfit("7/24/18", 1, indicator);
        System.out.println("Closing Thread: " + id);
    }
}

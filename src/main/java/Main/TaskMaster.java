package Main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskMaster {

    private NumberSetList numberSetList;
    private ConfigReader config;

    //Dem Konstruktor des TaskMasters werden die NumberSetList und der Configreader �begeben
    public TaskMaster(NumberSetList numberSetList, ConfigReader config) {

        this.numberSetList = numberSetList;
        this.config = config;
    }

    // Starten der Thread �ber einen Threadpool
    public void startThreads() {

        System.out.println("TaskMaster: Starting Threads...");
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int id = 1; id < 6; id++) {


            executor.submit(new Worker(id, config.getIndicator(1), numberSetList));
        }
        executor.shutdown();


    }
}

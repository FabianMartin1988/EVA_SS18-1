package Main;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelLoader {

    Workbook workbook;
    Sheet sheet;
    String XLS_Filepath;

    //Übergabe des Dateipfades an den Konstruktor
    public ExcelLoader(String XLS_Filepath) {
        this.XLS_Filepath = XLS_Filepath;
    }
    // Christian
    public Workbook getWorkbook() throws IOException, InvalidFormatException {
        workbook = WorkbookFactory.create(new File(XLS_Filepath));
        System.out.println("ExcelLoader: Workbook has been created.");

        return workbook;
    }
}

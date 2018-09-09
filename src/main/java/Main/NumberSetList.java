package Main;

import java.util.ArrayList;

public class NumberSetList {

    private ArrayList<NumberSet> numberSetList = new ArrayList<>();

    // Ein neues Numberset wird der NumberSetList hinzugefügt
    public void addNumberSet(NumberSet numberSet) {
        this.numberSetList.add(numberSet);
    }

    // Ein Numberset an der Stelle X (Index) in der NumberSetList wird zurückgegeben
    public NumberSet getNumberSet(int index) {
        return numberSetList.get(index);
    }

    //Christian
    public ArrayList<NumberSet> getNumberSetList() {
        return numberSetList;
    }

    //die NumberSetList wird auf leere Numbersets überprüft
    public void checkNumberSetList() {
        System.out.println("numberSetList: checking for empty NumberSets");
        ArrayList<NumberSet> emptyNumberSets = new ArrayList<>();

        //suche NumberSets die ein leeres Array haben
        for (NumberSet currentNumberSet : numberSetList) {
            boolean check = currentNumberSet.checkArrayIntegrity();
            if (check) {
                emptyNumberSets.add(currentNumberSet);
            }
        }

        //printDate aller leeren NumberSets
        int emptyNumberSetsCounter = 0;
        for (NumberSet currentNumberSet : emptyNumberSets) {

            currentNumberSet.printDate();
            emptyNumberSetsCounter++;

        }
        // Gibt es leere Numbersets?
        if (emptyNumberSetsCounter == 0) {

            System.out.println("numberSetList: No empty NumberSets found.");
        } else {

            System.out.println("numberSetList: found " + emptyNumberSetsCounter);
        }
    }
}

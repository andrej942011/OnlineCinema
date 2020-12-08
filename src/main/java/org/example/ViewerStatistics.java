package org.example;

import java.util.ArrayList;

public class ViewerStatistics {
    public double averageAge(ArrayList<Viewer> arrayList){ //подсчитывается средний возраст пользователей из полученного списка (List)
        double sumAge = 0;
        for(Viewer ar: arrayList){
            sumAge+= ar.getAge();
        }
        double rash = sumAge/arrayList.size();

        return rash;
    }
}

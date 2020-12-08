package org.example;

import java.util.ArrayList;

public class CinemaApplicationRun {
    public static void main( String[] args )
    {
        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("aaa", 10, 5));
        viewers.add(new Viewer("bbb", 15, 7));
        viewers.add(new Viewer("ccc", 18, 2));
        viewers.add(new Viewer("ddd", 25, 8));
        viewers.add(new Viewer("eee", 12, 1));

        ViewerStatistics statistics = new ViewerStatistics();
        double srAge = statistics.averageAge(viewers);
        System.out.println("Средний возраст: "+  srAge);
    }
}

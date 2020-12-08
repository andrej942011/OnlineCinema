package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class CinemaApplicationRun {
    public static void main( String[] args )
    {
        //Фильмы доступные в кинотеатре
        ArrayList<Cinema> cinemas = new ArrayList<>();
        cinemas.add(new Cinema("Назад в будущее", "фантастика", 180));
        cinemas.add(new Cinema("Довод", "боевик", 150));
        cinemas.add(new Cinema("Паразиты", "комедия", 131));
        cinemas.add(new Cinema("Калашников", "биография",104));
        cinemas.add(new Cinema("Зов предков", "драмма",100));
        cinemas.add(new Cinema("Джентльмены", "боевик",113));
        cinemas.add(new Cinema("1917", "военный",119));


        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("aaa", 10, new ArrayList<Cinema>(Arrays.asList(new Cinema[]{cinemas.get(0), cinemas.get(1)}))));
        viewers.add(new Viewer("bbb", 15, new ArrayList<Cinema>(Arrays.asList(new Cinema[]{cinemas.get(2), cinemas.get(3)}))));
        viewers.add(new Viewer("ccc", 18, new ArrayList<Cinema>(Arrays.asList(new Cinema[]{cinemas.get(1), cinemas.get(4)}))));
        viewers.add(new Viewer("ddd", 25, new ArrayList<Cinema>(Arrays.asList(new Cinema[]{cinemas.get(4), cinemas.get(2), cinemas.get(3)}))));
        viewers.add(new Viewer("eee", 12, new ArrayList<Cinema>(Arrays.asList(new Cinema[]{cinemas.get(5), cinemas.get(2)}))));

        ViewerStatistics statistics = new ViewerStatistics();
        double srAge = statistics.averageAge(viewers);
        System.out.println("Средний возраст: "+  srAge);

        for(Viewer viewer: viewers){
            System.out.println(viewer.getName() + " " + viewer.getAge() + " " + viewer.getCinemaArray().size());
        }
    }
}

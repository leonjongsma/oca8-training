package nl.leon.week0.footballmanager;

import java.util.ArrayList;
import java.util.List;

public class Group {

    List<Squad> squadList;
    void populate() {
        // each group has four teams
        squadList = new ArrayList<>();
        for (int i=0; i < 4;i++ ) {
            Squad squad = new Squad.Builder("name").build();
            squadList.add(squad);
        }
    }
}

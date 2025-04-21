package Hafta3.Collections;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public  class ComparatorExample {

    static class Player implements Comparable<Player>,Comparator<String>{

        public int id;
        public String name;

        public Player(){

        }

        public Player(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Player o) {
            if (this.id < o.id){
                return 1;
            }
            else if(this.id > o.id){
                return -1;
            }
            return 0;
        }

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }


    public static void main(String[] args) {

        List<String> newlist = new ArrayList<>();

        newlist.add("mehmet");
        newlist.add("ahmet");
        newlist.add("memet");
        newlist.add("yusuf");
        newlist.add("fatma");

        Collections.sort(newlist);

        newlist.forEach(System.out::println);

        List<Player> players = new ArrayList<>();
        players.add(new Player(1,"mehmet"));
        players.add(new Player(2,"ahmet"));
        players.add(new Player(3,"fatma"));
        players.add(new Player(4,"enes"));

        Player p1 = new Player(5,"Murat");
        Player p2 = new Player(6,"Musa");

        Collections.sort(players);
        Collections.sort(newlist,new Player());
        players.forEach(System.out::println);
    }
}

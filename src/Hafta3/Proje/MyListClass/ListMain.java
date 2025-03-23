package Hafta3.Proje.MyListClass;

public class ListMain {

    public static void main(String[] args) {
        BenimListem<Integer> myList = new BenimListem<>();

        System.out.println("Listenin boyutu: "+ myList.size());
        System.out.println("Listenin kapasitesi: "+ myList.getCapasity());

        myList.add(100);
        myList.add(240);
        myList.add(310);
        myList.add(100);
        myList.add(159);
        myList.add(123);
        System.out.println("Listenin boyutu: "+ myList.size());
        System.out.println("Listenin kapasitesi: "+ myList.getCapasity());

        System.out.println(myList.get(1));
        //System.out.println(myList.remove(2));
        System.out.println(myList.set(1, 100));

        System.out.println(myList);
        System.out.println(myList.indexOf(100));
        System.out.println(myList.lastIndexOf(100));
        System.out.println(myList.isEmpty());

        Object[] array = myList.toArray();

        System.out.println(array[1]);
        //myList.clear();
        //System.out.println(myList.toString());

        System.out.println(myList.sublist(0,3).toString());
        System.out.println(myList.contains(100));

        myList.set(3,3);
    }
}

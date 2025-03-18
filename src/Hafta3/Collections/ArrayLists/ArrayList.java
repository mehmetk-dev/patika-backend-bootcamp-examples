package Hafta3.Collections.ArrayLists;


public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> buyList = new java.util.ArrayList<>();
        java.util.ArrayList<String> buyList2 = new java.util.ArrayList<>();


        buyList.add("Muz");
        buyList.add("Çilek");
        buyList.add("Laktozsuz süt");
        buyList.add("Künhe alman tipi kornişon turşu");


        for (String s:buyList){
            System.out.println(s);
        }
        System.out.println(buyList);
        buyList2.addAll(buyList);
        buyList2.add("Meyveli yoğurt");
        buyList2.remove("Muz");
        System.out.println(buyList2);

        System.out.println(buyList2.contains("Meyveli yoğurt"));
        System.out.println(buyList2.get(1));
        System.out.println(buyList2.indexOf("Meyveli yoğurt"));

        System.out.println(buyList2.set(0,"Meyveli yoğurt"));
        System.out.println(buyList2.subList(1,3));
    }
}

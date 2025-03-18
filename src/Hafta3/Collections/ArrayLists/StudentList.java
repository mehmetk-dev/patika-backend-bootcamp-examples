package Hafta3.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

class Students1{

    private String name;

    public Students1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}

    public class StudentList {
        public static Scanner sc = new Scanner(System.in);
            public static void main(String[] args) {
                ArrayList<Students1> students = new ArrayList<>();
                System.out.println("1-Eleman Ekle\n2-Eleman Kontrol\n3-Elemanları listele\nÇıkmak için 'q'ya basınız");
                while (true){
                    System.out.println("İşlem seçin");
                    String choise = sc.nextLine();
                    if (choise.equalsIgnoreCase("q")){
                        System.out.println("Program sonlandırılıyor...");
                        break;
                    }else if(choise.equals("1")){
                        addStudent(students);
                    }
                    else if(choise.equals("2")){
                        System.out.print("Kontrol etmek istediğiniz elemanı giriniz: ");
                        String queryName = sc.nextLine();
                        System.out.println(search(students,queryName));
                    }
                    else if (choise.equals("3")){
                        System.out.println(students);
                    }
                    else{
                        System.out.println("Yanlış seçim yaptınız tekrar deneyiniz");
                }
            }}

        private static ArrayList<Students1> addStudent(ArrayList<Students1> students) {
            System.out.println("Ogrenci İsmi giriniz");

            Students1 sStudents = new Students1(sc.nextLine());
            students.add(sStudents);
            return students;
        }


        public static boolean search(ArrayList<Students1> sStudents,String search){

            for (Students1 student : sStudents){
                if (student.getName().equalsIgnoreCase(search)){
                    return true;
                }
            }
            return false;
        }
}

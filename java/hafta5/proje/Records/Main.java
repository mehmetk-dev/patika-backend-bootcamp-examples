package hafta5.proje.Records;

public class Main {
    public static void main(String[] args) {

        // Creating student objects
        Student student1 = new Student("mehmet","kerem",123);
        Student student2 = new Student("enes","duman",124);
        Student student3 = new Student("emre","ömür",125);

        // Printing student information to the console
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // Testing the equals and hashCode methods
        System.out.println("student 1 equals student3: " + student1.equals(student3)); // Expected: False
        System.out.println("student 1 hashCode: " + student1.hashCode());
        System.out.println("student 2 hashCode: " + student2.hashCode());

    }
}

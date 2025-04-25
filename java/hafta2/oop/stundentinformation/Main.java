package hafta2.oop.stundentinformation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Teacher[] teacher = new Teacher[5];

        Teacher fenOgr = new Teacher("Mehmet","Kerem","5340711077");
        Teacher kimOgr = new Teacher("Enes","Duman","5340711077");
        Teacher matOgr = new Teacher("Emre","Taş","5340711077");
        Teacher biyOgr = new Teacher("Emre","Taş","5340711077");
        Teacher turOgr = new Teacher("Emre","Taş","5340711077");
        teacher[0] = fenOgr;
        teacher[1] = kimOgr;
        teacher[2] = matOgr;
        teacher[3] = biyOgr;
        teacher[4] = turOgr;

        Course matDersi = new Course("Matematik","MAT101",8);
        Course kimDersi = new Course("Kimya","FEN101",8);
        Course biyDersi = new Course("Biyoloji","BIY101",8);
        Course turDersi = new Course("Türkçe","TUR101",8);
        Course fenDersi = new Course("Fen","FEN101",8);

        matDersi.setTeacher(matOgr);
        kimDersi.setTeacher(kimOgr);
        biyDersi.setTeacher(biyOgr);
        turDersi.setTeacher(turOgr);
        fenDersi.setTeacher(kimOgr);

        fenOgr.setCourse(fenDersi);
        turOgr.setCourse(turDersi);
        biyOgr.setCourse(biyDersi);
        kimOgr.setCourse(kimDersi);
        matOgr.setCourse(matDersi);

        Student student1 = new Student("Mehmet","İvonovic", LocalDate.of(2000,12,21),01);
        Student student2 = new Student("Fatmagül","Akçay", LocalDate.of(2002,2,18),02);
        Student student3 = new Student("Murat","Dalkılıç", LocalDate.of(2003,5,9),03);
        Student student4 = new Student("Mözkay","Erişte", LocalDate.of(1999,9,3),04);
        Student[] students = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        Course[] course = new Course[5];
        course[0] = matDersi;
        course[1] = kimDersi;
        course[2] = biyDersi;
        course[3] = turDersi;
        course[4] = fenDersi;

        student1.setCourse(course);
        student2.setCourse(course);
        student3.setCourse(course);
        student4.setCourse(course);

        for (Teacher teacher1: teacher){
            System.out.println(teacher1);
        }

        for (Course courses: course){
            System.out.println(courses);
        }
        for (Student student: students){
            System.out.println(student);
        }


        // sadasdas

        student1.addCourse(matDersi,0);
        student1.addCourse(fenDersi,1);
        student1.addCourse(biyDersi,2);
        student1.addCourse(turDersi,3);
        student1.addCourse(kimDersi,4);


        student1.addNote(matDersi,95);
        for (Course c1 : student1.getCourse()){
            System.out.println(c1.getNote());
        }
    }
}

package Hafta3.Generics;

public class BoxMain {
    public static void main(String[] args) {


        Box<String> stringBox = new Box<>();
        stringBox.setContent("String generic");

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(12345);

        Box<Game> classBox = new Box<>();
        Game game = new Game();
        classBox.setContent(game);

        String[] array = {"Java","Springboot","Python"};

        GenericMethodExample.printArray(array);

        Integer[] array2 = {1,2,3,4,5};
        GenericMethodExample.printArray(array2);

        int[] array3 = {1,2,3,4};
        //GenericMethodExample.printArray(array3); // Primitive tiplerle kullanılmazlar.

        BoundedGeneric<Integer> clas =  new BoundedGeneric<>();
        //BoundedGeneric<String>  clas1 = new BoundedGeneric<String>(); Number classından miras alan classlara özel
        BoundedGeneric<Double> clas2 = new BoundedGeneric<>();
    }
}
